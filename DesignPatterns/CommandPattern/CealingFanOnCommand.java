package CommandPattern;

public class CealingFanOnCommand implements Command {
    CealingFan cealingFan;

    public CealingFanOnCommand(CealingFan ceal) {
        this.cealingFan = ceal;
    }

    @Override
    public void execute() {
        cealingFan.high();
    }
}
