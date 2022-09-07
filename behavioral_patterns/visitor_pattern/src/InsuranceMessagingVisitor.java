public class InsuranceMessagingVisitor implements Visitor {

    @Override
    public void visit(Bank bank) {
        System.out.println("Insurance Messaging for Bank");
    }

    @Override
    public void visit(Restaurant restaurant) {
        System.out.println("Insurance Messaging for Restaurant");
    }
}
