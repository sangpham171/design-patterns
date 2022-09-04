import java.util.ArrayList;
import java.util.List;

public class UniformFactory implements AnimalFactory {

    private List<String> createdAnimal = new ArrayList<>();

    private String getAnimalType() {

        String animalType;

        while (true) {
            int random = (int) (Math.random() * 3);
            animalType = switch (random) {
                case 0 -> "Cat";
                case 1 -> "Dog";
                default -> "Duck";
            };

            if (!createdAnimal.contains(animalType)) {
                createdAnimal.add(animalType);
                break;
            }
        }
        return animalType;
    }

    private void initCreatedAnimal() {
        createdAnimal = new ArrayList<>();
    }

    @Override
    public Animal createAnimal(String name) {
        if (createdAnimal.size() == 3)
            initCreatedAnimal();

        String animalType = getAnimalType();

        return switch (animalType) {
            case "Cat" -> new Cat(name);
            case "Dog" -> new Dog(name);
            default -> new Duck(name);
        };
    }
}
