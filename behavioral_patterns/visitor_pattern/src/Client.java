public abstract class Client {
    private final String name;
    private final String address;
    private final String phone;
    private final String email;

    public Client(String name, String address, String phone, String email) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

    public abstract void accept(Visitor visitor);
}
