package CommandPattern;

public class LightOffCommand implements Command {
    Light light;
    
    public LightOffCommand(Light li) {
        this.light = li;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}
