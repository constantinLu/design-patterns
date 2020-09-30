package _06Command.remoteControl.receivers;

public class Stereo {

    private String name;

    private int volume;


    public Stereo(String name) {
        this.name = name;
    }

    public void on() {
        System.out.println("Stereo is On");
    }

    public void off() {
        System.out.println("Stereo is off");
    }

    public void setCd() {
        System.out.println("CD is initializing.. .  . ");
    }


    public void setDvd() {
        System.out.println("Dvd is initializing.. .  . ");
    }

    public void setRadio() {
        System.out.println("Radio turned ON");
    }

    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("Changing the volume to : " + volume);
    }
}
