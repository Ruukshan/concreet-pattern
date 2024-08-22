package design.pattern.command;

public class Test {
    public static void main(String[] args) {
        RemoteControl remote = new RemoteControl();

        Light kitchenLight = new kitchenroomLight();
        Light livingRoomLight = new livingroomLight();

        Command kitchenLightOn = new LightOnCommand(kitchenLight);
        Command kitchenLightOff = new LightOffCommand(kitchenLight);
        Command kitchenLightDim = new LightDimCommand(kitchenLight, 50);

        Command livingRoomLightOn = new LightOnCommand(livingRoomLight);
        Command livingRoomLightOff = new LightOffCommand(livingRoomLight);
        Command livingRoomLightDim = new LightDimCommand(livingRoomLight, 30);

        remote.setCommand(0, kitchenLightOn, kitchenLightOff);
        remote.setCommand(1, livingRoomLightOn, livingRoomLightOff);

        System.out.println("Testing Kitchen Room Light:");
        remote.onButtonWasPressed(0);
        remote.offButtonWasPressed(0);
        remote.undoButtonWasPressed();
        remote.onButtonWasPressed(0);
        kitchenLightDim.execute();
        remote.undoButtonWasPressed();

        System.out.println("\nTesting Living Room Light:");
        remote.onButtonWasPressed(0);
        remote.offButtonWasPressed(0);
        remote.undoButtonWasPressed();
        remote.onButtonWasPressed(1);
        livingRoomLightDim.execute();
        remote.undoButtonWasPressed();
    }
}
