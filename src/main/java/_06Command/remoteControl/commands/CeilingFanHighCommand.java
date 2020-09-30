package _06Command.remoteControl.commands;

import _06Command.remoteControl.receivers.CeilingFan;

import static _06Command.remoteControl.receivers.CeilingFan.*;

public class CeilingFanHighCommand implements Command {

    CeilingFan fan;

    int previousSpeed;

    public CeilingFanHighCommand(CeilingFan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        previousSpeed = fan.getSpeed();
        fan.on();
        fan.setHigh();
    }

//    @Override
//    public void undo() {
//        switch(previousSpeed) {
//            case HIGH:
//                fan.setHigh();
//                break;
//            case MEDIUM:
//                fan.setMedium();
//                break;
//            case LOW:
//                fan.setLow();
//                break;
//            case OFF:
//                fan.off();
//                break;
//        }
//
//    }
}
