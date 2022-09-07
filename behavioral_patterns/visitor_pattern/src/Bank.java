public class Bank extends Client {

    public Bank(String name, String address, String phone, String email) {
        super(name, address, phone, email);
    }


    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

}
