public class Remote {
    private ICommand on;
    private ICommand off;
    private ICommand up;
    private ICommand down;

    public Remote(ICommand on, ICommand off, ICommand up, ICommand down) {
        this.on = on;
        this.off = off;
        this.up = up;
        this.down = down;
    }

    public void on() {
        on.execute();
    }

    public void off() {
        off.execute();
    }

    public void up() {
        up.execute();
    }

    public void down() {
        down.execute();
    }

}
