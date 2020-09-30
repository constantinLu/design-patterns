package _06Command.remoteControl;

import _06Command.remoteControl.commands.*;
import _06Command.remoteControl.receivers.CeilingFan;
import _06Command.remoteControl.receivers.GarageDoor;
import _06Command.remoteControl.receivers.Light;
import _06Command.remoteControl.receivers.Stereo;

public class RemoteLoader {


    public static void main(String[] args) {

        /** New Instance of remote control */
        RemoteControl remoteControl = new RemoteControl();

        /**
         * Create all devices in their proper locations
         */
        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");
        CeilingFan ceilingFan = new CeilingFan("Living Room Fan");
        GarageDoor garageDoor = new GarageDoor();
        Stereo stereo = new Stereo("Living Room stereo");


        /**
         * Create all the light Commands objects
         */
        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingLightOffCommand = new LightOffCommand(livingRoomLight);
        LightOnCommand kitchenLightOff = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOn = new LightOffCommand(kitchenLight);

        CeilingFanHighCommand ceilingFanHighCommand = new CeilingFanHighCommand(ceilingFan);
        CeilingFanOff ceilingFanOff = new CeilingFanOff(ceilingFan);

        GarageDoorOpen garageDoorOpenCommand = new GarageDoorOpen(garageDoor);
        GarageDoorClosedCommand garageDooOffCommand = new GarageDoorClosedCommand(garageDoor);

        StereoWithCDCommand stereoWithCDCommand = new StereoWithCDCommand(stereo);
        StereoOffComand stereoOffComand = new StereoOffComand(stereo);


    /*
      Load the commands into the remoteControl
     */

//        remoteControl.setCommand(0, livingRoomLightOn, livingLightOffCommand);

        // setting commands with lambda expressions
//        remoteControl.setCommand(0, () -> {livingRoomLight.on();}, () -> {livingRoomLight.off();});
//        remoteControl.setCommand(2, () -> {ceilingFan.on();}, () -> {ceilingFan.off();});


        remoteControl.setCommand(0, livingRoomLight::on, livingRoomLight::off);
        remoteControl.setCommand(2, () -> {ceilingFan.on();}, () -> {ceilingFan.off();});

        //Passing multimple methods to lambda expressions (super tare)
        Command stereoWithCD = () -> stereo.on(); stereo.setCd(); stereo.setVolume(12);
        remoteControl.setCommand(3, stereoWithCD, stereo::off);


//        remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
//        remoteControl.setCommand(2, ceilingFanHighCommand, ceilingFanOff);
//        remoteControl.setCommand(3, stereoWithCDCommand, stereoOffComand);
//        remoteControl.setCommand(4, stereoWithCDCommand, stereoOffComand);


        System.out.println(remoteControl);


        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        System.out.println(remoteControl);
        System.out.println("-----------");
        remoteControl.undoButtonWasPushed();
        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
        System.out.println("-----------2");
        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(2);
        System.out.println("-----------2");
        remoteControl.undoButtonWasPushed();

        remoteControl.onButtonWasPushed(3);
        remoteControl.offButtonWasPushed(3);


        Light livingLight = new Light("MacroLight");
        CeilingFan ceilingFanScene = new CeilingFan("SceneFan");
        Stereo stereoScene = new Stereo("StereScene");

        /** Using Macro commands */
        LightOnCommand livingRoom = new LightOnCommand(livingLight);
        CeilingFanHighCommand ceilingFanHighCommandScene = new CeilingFanHighCommand(ceilingFanScene);
        StereoWithCDCommand stereoSceneCommand = new StereoWithCDCommand(stereoScene);


        LightOffCommand livingOff = new LightOffCommand(livingLight);
        CeilingFanOff ceilingFanOffScene = new CeilingFanOff(ceilingFan);
        StereoOffComand stereoOffComandScene = new StereoOffComand(stereoScene);


        Command[] sceneModeOn = {livingRoom, ceilingFanHighCommandScene, stereoSceneCommand};
        Command[] sceneModeOff = {livingOff, ceilingFanOffScene, stereoOffComandScene};


        MacroCommand partyOnScene = new MacroCommand(sceneModeOn);
        MacroCommand partyOffScene = new MacroCommand(sceneModeOff);

        System.out.println("------------SCENE MODE----------");
        /** setting the macroCommand to a button */
        remoteControl.setCommand(4, partyOnScene, partyOffScene);
        remoteControl.onButtonWasPushed(4);
        remoteControl.offButtonWasPushed(4);
        System.out.println("------------UNDO MACRO-----------");
        remoteControl.undoButtonWasPushed();
        System.out.println(remoteControl);

    }
}




