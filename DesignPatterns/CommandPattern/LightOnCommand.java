package CommandPattern;

public class LightOnCommand implements Command {
    Light light;

    public LightOnCommand(Light li) {
        this.light = li;
    }

    @Override
    public void execute() {
        light.on();
    }
}
