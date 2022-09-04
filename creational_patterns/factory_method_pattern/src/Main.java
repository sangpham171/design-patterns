public class Main {
    public static void main(String[] args) {
        AnimalFactory animalFactory = new UniformFactory();
        Animal animal = animalFactory.createAnimal("Fido");
        System.out.println("Animal type : " + animal.getClass()
                                                   .getSimpleName());

        animal = animalFactory.createAnimal("Foo");
        System.out.println("Animal type : " + animal.getClass()
                                                    .getSimpleName());

        animal = animalFactory.createAnimal("Bar");
        System.out.println("Animal type : " + animal.getClass()
                                                    .getSimpleName());

        animal = animalFactory.createAnimal("Baz");
        System.out.println("Animal type : " + animal.getClass()
                                                    .getSimpleName());


    }
}