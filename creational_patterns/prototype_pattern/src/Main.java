public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car("Renault", "black", 200);
        System.out.println(car);
        System.out.println(car.getClass()
                              .getSimpleName());

        Vehicle car2 = car.clone();
        System.out.println(car2);
        System.out.println(car2.getClass()
                               .getSimpleName());


    }
}