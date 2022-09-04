public class Main {
    public static void main(String[] args) {
        Gate gate = new Gate();
        gate.enter();
        gate.pay();
        gate.payOk();
        gate.enter();
        gate.pay();
        gate.payFailed();
        gate.enter();
    }
}