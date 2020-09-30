package _08Facade.hometheatre.subsystems;

public class Tuner {

    Amplifier amp;

    private void on() {
        System.out.println("Tuner is ON");

    }

    private void off() {
        System.out.println("Tuner is OFF");
    }


}
