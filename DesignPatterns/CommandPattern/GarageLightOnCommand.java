package CommandPattern;

public class GarageLightOnCommand implements Command {
    GarageDoor garage;

    public GarageLightOnCommand(GarageDoor garag) {
        this.garage = garag;
    }

    @Override
    public void execute() {
        garage.garageLightOn();
    }
}
