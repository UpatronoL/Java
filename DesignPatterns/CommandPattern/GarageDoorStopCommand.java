package CommandPattern;

public class GarageDoorStopCommand implements Command {
    GarageDoor door;

    public GarageDoorStopCommand(GarageDoor dor) {
        this.door = dor;
    }

    @Override
    public void execute() {
        door.stop();
    }
}
