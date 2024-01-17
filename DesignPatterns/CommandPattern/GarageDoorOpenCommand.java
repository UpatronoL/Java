package CommandPattern;

public class GarageDoorOpenCommand implements Command {
    GarageDoor door;

    public GarageDoorOpenCommand(GarageDoor dor) {
        this.door = dor;
    }

    @Override
    public void execute() {
        door.Open();
    }

    @Override
    public void undo() {
        door.Close();
    }
}
