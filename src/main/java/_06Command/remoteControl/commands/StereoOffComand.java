package _06Command.remoteControl.commands;

import _06Command.remoteControl.receivers.Stereo;

public class StereoOffComand implements Command {

    Stereo stereo;

    public StereoOffComand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.off();
    }

//    @Override
//    public void undo() {
//        stereo.on();
//    }
}
