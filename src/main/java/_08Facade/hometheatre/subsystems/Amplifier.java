package _08Facade.hometheatre.subsystems;

public class Amplifier {

    Tuner tuner;

    DvdPlayer dvd;

    CdPlayer cd;

    int volume;

    public void on() {
        System.out.println("Amplifier is ON");
    }

    public void off() {
        System.out.println("Amplifier is OFF");
    }

    public void setSurroundSound() {
        dvd.setSurroundAudio();
    }

    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("setting the volume to : " + volume);
    }

    public Tuner getTuner() {
        return tuner;
    }

    public void setTuner(Tuner tuner) {
        this.tuner = tuner;
    }

    public DvdPlayer getDvd() {
        return dvd;
    }

    public void setDvd(DvdPlayer dvd) {
        this.dvd = dvd;
    }

    public CdPlayer getCd() {
        return cd;
    }

    public void setCd(CdPlayer cd) {
        this.cd = cd;
    }


}
