package _06Command.remoteControl;

import _06Command.remoteControl.commands.Command;
import _06Command.remoteControl.commands.NoCommand;

public class RemoteControl {

    Command[] onCommands;

    Command[] offCommands;
    Command undo;

    public RemoteControl() {
        onCommands = new Command[7];
        offCommands = new Command[7];

       Command noCommand = new NoCommand();
        undo = noCommand;

        for (int i = 0; i < 7; i++) {
            onCommands[i] = () -> { };
            offCommands[i] = noCommand;
        }
    }


    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
        undo = onCommands[slot];
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
        undo = offCommands[slot];
    }

    public void undoButtonWasPushed() {
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("\n ----------------Remote Control --------------\n");
        for (int i = 0; i < onCommands.length; i++) {
            stringBuffer.append("[slot " + i + "] " + onCommands[i].getClass().getName() + "      " + offCommands[i].getClass().getName() + "\n");
        }

        return stringBuffer.toString();
    }
}
