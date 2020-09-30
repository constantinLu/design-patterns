package _06Command.remoteControl.commands;

import _06Command.remoteControl.receivers.CeilingFan;

import static _06Command.remoteControl.receivers.CeilingFan.*;
import static _06Command.remoteControl.receivers.CeilingFan.OFF;

public class CeilingFanOff implements Command {

    CeilingFan fan;

    public CeilingFanOff(CeilingFan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        fan.off();
    }

//    @Override
//    public void undo() {
//           int previousSpeed = fan.getSpeed();
//            switch(previousSpeed) {
//                case HIGH:
//                    fan.setHigh();
//                    break;
//                case MEDIUM:
//                    fan.setMedium();
//                    break;
//                case LOW:
//                    fan.setLow();
//                    break;
//                case OFF:
//                    fan.off();
//                    break;
//                    default:
//                        fan.on();
//                        break;
//            }
//
//
//        }
}
