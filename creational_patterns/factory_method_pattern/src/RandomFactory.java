public class RandomFactory implements AnimalFactory {
    @Override
    public Animal createAnimal(String name) {
        int random = (int) (Math.random() * 3);

        switch (random) {
            case 0:
                return new Cat(name);
            case 1:
                return new Dog(name);
            default:
                return new Duck(name);
        }
    }
}
