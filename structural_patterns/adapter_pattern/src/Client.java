public class Client {
    private ITarget target;

    public Client(ITarget target) {
        this.target = target;
    }

    public void request() {
        target.request();
    }
}
