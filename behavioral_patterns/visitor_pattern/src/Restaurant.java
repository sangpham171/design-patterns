public class Restaurant extends Client {

    public Restaurant(String name, String address, String phone, String email) {
        super(name, address, phone, email);
    }


    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }


}
