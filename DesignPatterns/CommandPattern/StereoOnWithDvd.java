package CommandPattern;

public class StereoOnWithDvd implements Command {
    Stereo stereo;

    public StereoOnWithDvd(Stereo s) {
        this.stereo = s;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setDvd();
        stereo.setVolume(11);
    }

    @Override
    public void undo() {
        stereo.off();
    }
}