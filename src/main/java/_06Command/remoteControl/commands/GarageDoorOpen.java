package _06Command.remoteControl.commands;


import _06Command.remoteControl.receivers.GarageDoor;

public class GarageDoorOpen implements Command {

    GarageDoor garageDoor;

    public GarageDoorOpen(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
    garageDoor.up();;
    }

//    @Override
//    public void undo() {
//
//    }
}
