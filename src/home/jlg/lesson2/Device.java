package home.jlg.lesson2;

public abstract class Device {
    private final String name;
    private final int year;

    public Device(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public String getName(){
        return name;
    }

    public int getYear() {
        return year;
    }

    public abstract boolean isPortable();
}
