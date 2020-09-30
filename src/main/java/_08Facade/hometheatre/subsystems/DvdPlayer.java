package _08Facade.hometheatre.subsystems;

public class DvdPlayer {


    Amplifier amp;

    public void on() {
        System.out.println("DvdPlayer is ON");
    }

    public void off() {
        System.out.println("DvdPlayer is OFF");
    }

    public void eject() {
        System.out.println("Ejecting dvd. ... ");
    }

    public void play(String name){
        System.out.println("Playing :" + name);
    }

    public void stop(){
        System.out.println("STOP Playing");
    }

    public void setSurroundAudio() {
        System.out.println("Setting the surroundAudio to ON");

    }




}
