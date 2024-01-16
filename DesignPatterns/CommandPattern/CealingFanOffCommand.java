package CommandPattern;

public class CealingFanOffCommand implements Command {
    CealingFan cealingFan;

    public CealingFanOffCommand(CealingFan ceal) {
        this.cealingFan = ceal;
    }

    @Override
    public void execute() {
        cealingFan.off();
    }
}
