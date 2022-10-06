package home.jlg.lesson2;

public class Refrigerator  implements  Switchable{
    private boolean isConnectedToGrid = false;
    private boolean status = false;
    private final String brand;

    public Refrigerator(String brand) {
        this.brand = brand;
    }


    public void connectToGrid(){
        isConnectedToGrid = true;
    }

    public void disconnectFromGrid(){
        if (isConnectedToGrid){
            isConnectedToGrid = false;
        }
    }

    @Override
    public void switchOn() {
        if (isConnectedToGrid){
            this.status = true;
        }
    }

    @Override
    public void switchOff() {
        if (status){
            this.status = false;
        }
    }

    @Override
    public boolean isOn() {
        return false;
    }
}
