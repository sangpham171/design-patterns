public class Car extends Vehicle {

    private String name;
    private String color;
    private int maxSpeed;

    public Car(String name, String color, int maxSpeed) {
        this.name = name;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Car{" + "name=" + name + ", color=" + color + ", maxSpeed=" + maxSpeed + '}';
    }

}
