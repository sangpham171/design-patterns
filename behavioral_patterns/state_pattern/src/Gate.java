public class Gate {
    private GateState state;

    public Gate() {
        this.state = new ClosedGateState(this);
    }

    public void enter() {
        this.state.enter();
    }

    public void pay() {
        this.state.pay();
    }

    public void payOk() {
        this.state.payOk();
    }

    public void payFailed() {
        this.state.payFailed();
    }

    public void changeState(GateState state) {
        this.state = state;
    }

}
