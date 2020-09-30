package _05SingletonPattern.singleton;

public class ChocolateBoiler {

    private boolean empty;

    private boolean boiled;

    private static ChocolateBoiler boiler;

    private  ChocolateBoiler() {
        empty = true;
        boiled = false;
    }

    public static ChocolateBoiler getInstance() {
        if (boiler == null) {
            boiler = new ChocolateBoiler();
        }
        return boiler;
    }

    public void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;
        }
    }

    public void drain() {
        if (!isEmpty() && isBoiled()) {
            //drain the boild milk and chocolate
            empty = true;
        }
    }

    public void boil() {
        if (!isEmpty() && !isBoiled()) {
            boiled = true;
        }
    }

    public boolean isEmpty() {
        return empty;
    }

    public void setEmpty(boolean empty) {
        this.empty = empty;
    }

    public boolean isBoiled() {
        return boiled;
    }

    public void setBoiled(boolean boiled) {
        this.boiled = boiled;
    }
}
