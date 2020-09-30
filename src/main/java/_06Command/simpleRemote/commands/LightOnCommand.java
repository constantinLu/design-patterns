package _06Command.simpleRemote.commands;

import _06Command.simpleRemote.Command;
import _06Command.simpleRemote.objects.Light;

public class LightOnCommand  implements Command {

    Light light;


    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
    light.on();

    }
}
