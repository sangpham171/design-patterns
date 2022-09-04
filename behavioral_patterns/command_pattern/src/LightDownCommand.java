public class LightDownCommand implements ICommand {
    private Light light;

    public LightDownCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.down();
    }

    public void undo() {
        light.up();
    }
}
