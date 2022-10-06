package home.jlg.lesson2;

public class Laptop extends Device{
    private final int displaySize;
    private final String maker;

    private String keyboardType;


    public Laptop(String name, int year, int displaySize, String maker) {
        super(name, year);
        this.displaySize = displaySize;
        this.maker = maker;
    }

    @Override
    public boolean isPortable() {
        return true;
    }

    public int getDisplaySize() {
        return displaySize;
    }

    public String getMaker() {
        return maker;
    }

    public String getKeyboardType() {
        return keyboardType;
    }

    public void setKeyboardType(String keyboardType) {
        this.keyboardType = keyboardType;
    }

    public boolean repaired() {
        return false;
    }
}
