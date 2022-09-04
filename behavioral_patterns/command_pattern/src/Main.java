public class Main {
    public static void main(String[] args) {
        Light light = new Light();
        ICommand on = new LightOnCommand(light);
        ICommand off = new LightOffCommand(light);
        ICommand up = new LightUpCommand(light);
        ICommand down = new LightDownCommand(light);
        Remote remote = new Remote(on, off, up, down);
        remote.on();
        remote.off();
        remote.up();
        remote.down();
    }
}