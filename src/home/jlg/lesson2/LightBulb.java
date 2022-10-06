package home.jlg.lesson2;

public class LightBulb implements  Switchable{
    private final  String type;
    private boolean status;

    public LightBulb(String type) {
        this.type = type;
        this.status = false;
    }

    @Override
    public void switchOn() {
        this.status = true;
    }

    @Override
    public void switchOff() {
        if (status){
            status = false;
        }
    }

    @Override
    public boolean isOn() {
        return this.status;
    }


}
