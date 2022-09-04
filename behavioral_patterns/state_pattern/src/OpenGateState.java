public class OpenGateState implements GateState {
    private Gate gate;

    public OpenGateState(Gate gate) {
        this.gate = gate;
    }

    @Override
    public void enter() {
        System.out.println("Gate is open, you can enter");
        this.gate.changeState(new ClosedGateState(this.gate));
    }

    @Override
    public void pay() {
        System.out.println("Gate is processing, you can pay");
        this.gate.changeState(new ProcessingGateState(this.gate));
    }

    @Override
    public void payOk() {
        System.out.println("Gate is open, you can enter");
        this.gate.changeState(new ClosedGateState(this.gate));
    }

    @Override
    public void payFailed() {
        System.out.println("Gate is close, you can not enter");
        this.gate.changeState(new ClosedGateState(this.gate));
    }
}
