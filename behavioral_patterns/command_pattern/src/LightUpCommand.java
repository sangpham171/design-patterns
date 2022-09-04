public class LightUpCommand implements ICommand {
    private Light light;

    public LightUpCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.up();
    }

    public void undo() {
        light.down();
    }
}
