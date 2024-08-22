package design.pattern.command;

public class RemoteControl {
    private Command[] onCommands;
    private Command[] offCommands;
    private Command undoCommand;

    public RemoteControl() {
        onCommands = new Command[7];
        offCommands = new Command[7];
        undoCommand = null;
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands [slot] = onCommand;
        offCommands [slot] = offCommand;
    }

    public void onButtonWasPressed(int slot) {
        if (onCommands[slot] != null) {
            offCommands[slot].execute();
            undoCommand = onCommands[slot];
        }
    }

    public void offButtonWasPressed(int slot) {
        if (onCommands[slot] != null) {
            offCommands[slot].execute();
            undoCommand = offCommands[slot];
        }
    }

    public void undoButtonWasPressed() {
        if (undoCommand != null) {
            undoCommand.undo();
        }
    }
}
