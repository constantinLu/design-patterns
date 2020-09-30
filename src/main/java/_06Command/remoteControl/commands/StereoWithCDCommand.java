package _06Command.remoteControl.commands;

import _06Command.remoteControl.receivers.Stereo;

public class StereoWithCDCommand implements Command {

    Stereo stereo;

    public StereoWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setCd();
        stereo.setVolume(11);
    }

//    @Override
//    public void undo() {
//
//    }
}
