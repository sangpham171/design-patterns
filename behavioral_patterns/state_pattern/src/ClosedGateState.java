public class ClosedGateState implements GateState {
    private Gate gate;

    public ClosedGateState(Gate gate) {
        this.gate = gate;
    }

    @Override
    public void enter() {
        System.out.println("Gate is closed, you can't enter");
    }

    @Override
    public void pay() {
        System.out.println("Gate is closed, you can pay");
        this.gate.changeState(new ProcessingGateState(this.gate));
    }

    @Override
    public void payOk() {
        System.out.println("Gate is closed, you can't payOk");
    }

    @Override
    public void payFailed() {
        System.out.println("Gate is closed, you can't payFailed");
    }

}
