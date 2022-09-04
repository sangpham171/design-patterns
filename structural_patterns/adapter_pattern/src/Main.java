public class Main {

    // Adapter pattern is used to change the interface of a class into another interface clients expect.

    public static void main(String[] args) {
        Adaptee adaptee = new Adaptee();
        ITarget target = new Adapter(adaptee);
        Client client = new Client(target);
        client.request();
    }
}