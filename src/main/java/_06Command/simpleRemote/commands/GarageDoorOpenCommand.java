package _06Command.simpleRemote.commands;

import _06Command.simpleRemote.Command;
import _06Command.simpleRemote.objects.GarageDoor;

public class GarageDoorOpenCommand implements Command {


    GarageDoor garageDoor;

    public GarageDoorOpenCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.up();
    }
}
