package _06Command.simpleRemote;

import _06Command.simpleRemote.commands.GarageDoorOpenCommand;
import _06Command.simpleRemote.commands.LightOnCommand;
import _06Command.simpleRemote.objects.GarageDoor;
import _06Command.simpleRemote.objects.Light;

//current command pattern-speak
public class RemoteControlTest {

    public static void main(String[] args) {

        /**
         * simpleRemote is our invoker
         * it will be passed a command object that cam be used to make requests.
         */
        SimpleRemoteControl remote = new SimpleRemoteControl();

        // This will be the receiver of the request
        Light light = new Light();

        GarageDoor garageDoor = new GarageDoor();

        //Here we create a command and pass the Receiver to it
        LightOnCommand lightOn = new LightOnCommand(light);

        GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);

        //here, pass the command to the invoker
        remote.setCommand(lightOn);
        //simulate the button being pressed.
        remote.buttonWasPressed();

        remote.setCommand(garageDoorOpenCommand);
        remote.buttonWasPressed();





    }
}
