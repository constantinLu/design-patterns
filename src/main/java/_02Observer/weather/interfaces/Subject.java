package _02Observer.weather.interfaces;


public interface Subject {

    void registerDisplay(Observer o);

    void removeDisplay(Observer o);

    void notifyDisplay();
}
