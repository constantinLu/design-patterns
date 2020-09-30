package _06Command.remoteControl.commands;

import _06Command.remoteControl.receivers.Light;

public class LightOnCommand implements Command {

    Light light;


    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

//    @Override
//    public void undo() {
//        light.off();
//    }
}
