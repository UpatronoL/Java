package CommandPattern;

public class CealingFanMediumCommand implements Command {
    CealingFan cealingFan;
    int prevSpeed;

    public CealingFanMediumCommand(CealingFan ceal) {
        this.cealingFan = ceal;
    }

    @Override
    public void execute() {
        prevSpeed = cealingFan.speed;
        cealingFan.high();
    }

    @Override
    public void undo() {
        switch (prevSpeed) {
            case CealingFan.HIGH:
                cealingFan.high();
                break;

            case CealingFan.MEDIUM:
                cealingFan.medium();
                break;

            case CealingFan.LOW:
                cealingFan.low();
                break;
        
            default:
                cealingFan.off();
                break;
        }
    }
}
