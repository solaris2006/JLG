package home.jlg.lesson2;

public class Smartphone extends  Device{
    private final String operatingSystem;


    public Smartphone(String name, int year, String operatingSystem) {
        super(name, year);
        this.operatingSystem = operatingSystem;
    }

    @Override
    public boolean isPortable() {
        return false;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }
}
