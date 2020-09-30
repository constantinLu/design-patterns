package _06Command.remoteControl;

import _06Command.remoteControl.commands.Command;
import _06Command.remoteControl.commands.LightOnCommand;
import _06Command.remoteControl.receivers.Light;

public class RemoteControlSimulator {

    public static void main(String[] args) {

        RemoteControl remoteControl = new RemoteControl();

        Light light = new Light("Test");

        LightOnCommand lightOnCommand = new LightOnCommand(light);

        remoteControl.setCommand(0, lightOnCommand, null);

        remoteControl.onButtonWasPushed(0);


    }
}
