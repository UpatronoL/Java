package CommandPattern;

public class RemoteLoader {
    public static void main(String[] args) {
        RemoteControlWithUndo remoteControlWithUndo = new RemoteControlWithUndo();

        CealingFan cealingFan = new CealingFan("Living room");

        CealingFanLowCommand cealingFanLowCommand = new CealingFanLowCommand(cealingFan);
        CealingFanOffCommand cealingFanOffCommand = new CealingFanOffCommand(cealingFan);

        remoteControlWithUndo.setCommand(0, cealingFanLowCommand, cealingFanOffCommand);

        System.out.println(remoteControlWithUndo);
        remoteControlWithUndo.onButtonWasPushed(0);
        remoteControlWithUndo.offButtonWasPushed(0);
        System.out.println(remoteControlWithUndo);
        remoteControlWithUndo.undoCommandWasPushed();
    }
}
