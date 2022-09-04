public class ProcessingGateState implements GateState {
    private Gate gate;

    public ProcessingGateState(Gate gate) {
        this.gate = gate;
    }

    @Override
    public void enter() {
        System.out.println("Gate is processing, you can't enter");
    }

    @Override
    public void pay() {
        System.out.println("Gate is processing, you can't pay");
    }

    @Override
    public void payOk() {
        System.out.println("Gate is processing, payOk, you can enter");
        this.gate.changeState(new OpenGateState(this.gate));
    }

    @Override
    public void payFailed() {
        System.out.println("Gate is processing, payFailed, you can't enter");
        this.gate.changeState(new ClosedGateState(this.gate));
    }

}
