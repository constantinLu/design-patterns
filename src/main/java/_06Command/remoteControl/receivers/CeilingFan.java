package _06Command.remoteControl.receivers;

public class CeilingFan {

    public static final int HIGH = 10;
    public static final int MEDIUM = 5;
    public static final int LOW = 2;
    public static final int OFF = 0;


    String fanName;

    private int speed;




    public CeilingFan(String fanName) {
        this.fanName = fanName;
        speed = OFF;
    }

    public void on() {
        speed = MEDIUM;
        System.out.println("Turning on the fan ...");
    }

    public void off() {
        speed = OFF;
        System.out.println("Fan OFF");
    }

    public void setHigh() {
        speed = HIGH;
        System.out.println("Setting the fan to maximum rotation speed" + speed);
    }

    public void setMedium() {
        speed = MEDIUM;
        System.out.println("Setting the fan to medium speed" + speed);
    }

    public void setLow() {
        speed = LOW;
        System.out.println("Setting the fan to low speed" + speed);
    }

    public int getSpeed() {
        return speed;
    }
}
