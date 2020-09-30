package _06Command.remoteControl.commands;


import _06Command.remoteControl.receivers.GarageDoor;

public class GarageDoorClosedCommand implements Command {

    GarageDoor garageDoor;

    public GarageDoorClosedCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.down();
    }

//    @Override
//    public void undo() {

   // }
}
