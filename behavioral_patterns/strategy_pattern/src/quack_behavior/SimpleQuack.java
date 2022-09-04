package quack_behavior;

public class SimpleQuack implements IQuackBehavior {
    @Override
    public void quack() {
        System.out.println("I can quack simply");
    }
}
