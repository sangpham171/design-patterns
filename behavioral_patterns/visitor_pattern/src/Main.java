public class Main {
    public static void main(String[] args) {

        InsuranceMessagingVisitor insuranceMessaging = new InsuranceMessagingVisitor();

        Client bank = new Bank("BNP", "Paris", "0123456789", "bnp@email.com");
        bank.accept(insuranceMessaging);

        Client restaurant = new Restaurant("Leon", "Paris", "0987654321", "leon@email.com");
        restaurant.accept(insuranceMessaging);

    }
}