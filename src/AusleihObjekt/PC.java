package AusleihObjekt;

import java.util.Date;

public class PC extends BorrowObject{

    public PC (String deviceName){
        super(deviceName);
    }

    @Override
    public void borrow() {
        if (available == true){
            available = false;
        }
    }

    @Override
    public void giveBack() {
        if (available==false)
        available = true;
    }
}
