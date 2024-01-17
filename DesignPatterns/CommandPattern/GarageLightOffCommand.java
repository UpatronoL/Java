package CommandPattern;

public class GarageLightOffCommand implements Command {
    GarageDoor garage;

    public GarageLightOffCommand(GarageDoor garag) {
        this.garage = garag;
    }

    @Override
    public void execute() {
        garage.garageLightOff();
    }

    @Override
    public void undo() {
        garage.garageLightOn();
    }
}
