import fly_behavior.ComplexFly;
import fly_behavior.SimpleFly;
import quack_behavior.ComplexQuack;
import quack_behavior.SimpleQuack;

public class Main {
    public static void main(String[] args) {
        var simpleDuck = new Duck(new SimpleFly(), new SimpleQuack());
        simpleDuck.performFly();
        simpleDuck.performQuack();

        var complexDuck = new Duck(new ComplexFly(), new ComplexQuack());
        complexDuck.performFly();
        complexDuck.performQuack();
    }
}