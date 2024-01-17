package CommandPattern;

public class GarageDoorCloseCommand implements Command {
    GarageDoor door;

    public GarageDoorCloseCommand(GarageDoor dor) {
        this.door = dor;
    }

    @Override
    public void execute() {
        door.Close();
    }

    @Override
    public void undo() {
        door.Open();
    }
}
