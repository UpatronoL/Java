package CommandPattern;

public class StereoOffCommand implements Command {
    Stereo stereo;
    
    public StereoOffCommand(Stereo s) {
        this.stereo = s;
    }

    @Override
    public void execute() {
        stereo.off();
    }

    @Override
    public void undo() {
        stereo.on();
    }
}
