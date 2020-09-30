package _08Facade.hometheatre.subsystems;

public class Lights {

    private int intesity;

    public void off() {
        intesity = 0;
        System.out.println("Lights are OFF");
    }

    public void on() {
        intesity = 5;
        System.out.println("Lights are ON");
    }

    public void dim(int intesity) {
        this.intesity = intesity;
        System.out.println("Setting the lights to : " + this.intesity + " intensity");
    }
}
