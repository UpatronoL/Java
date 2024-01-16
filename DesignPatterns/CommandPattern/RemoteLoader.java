package CommandPattern;

public class RemoteLoader {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        Light livingRoomLight = new Light("living room");
        Light kitchenLight = new Light("kitchen light");
        CealingFan cealingFan = new CealingFan("living room");
        GarageDoor garageDoor = new GarageDoor("");
        Stereo stereo = new Stereo("living room");

        LightOnCommand livingRoomLightOnCommand = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOffCommand = new LightOffCommand(livingRoomLight);
        LightOnCommand kitchenLightOnCommand = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOffCommand = new LightOffCommand(kitchenLight);

        CealingFanOnCommand cealingFanOnCommand = new CealingFanOnCommand(cealingFan);
        CealingFanOffCommand cealingFanOffCommand = new CealingFanOffCommand(cealingFan);

        GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);
        GarageDoorCloseCommand garageDoorCloseCommand = new GarageDoorCloseCommand(garageDoor);

        StereoOnWithCD stereoOnWithCD = new StereoOnWithCD(stereo);
        StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);

        remoteControl.setCommand(0, livingRoomLightOnCommand, livingRoomLightOffCommand);
        remoteControl.setCommand(1, kitchenLightOnCommand, kitchenLightOffCommand);
        remoteControl.setCommand(2, cealingFanOnCommand, cealingFanOffCommand);
        remoteControl.setCommand(3, garageDoorOpenCommand, garageDoorCloseCommand);
        remoteControl.setCommand(4, stereoOnWithCD, stereoOffCommand);

        System.out.println(remoteControl);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(2);
        remoteControl.onButtonWasPushed(3);
        remoteControl.offButtonWasPushed(3);
        remoteControl.onButtonWasPushed(4);
        remoteControl.offButtonWasPushed(4);
    }
        
}
