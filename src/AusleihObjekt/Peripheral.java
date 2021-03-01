package AusleihObjekt;

import java.util.Calendar;

public class Peripheral extends BorrowObject{

    public Peripheral (String deviceName, Calendar borrowDate, String usePurpose){
        super(deviceName, borrowDate, usePurpose);

/*        setDeviceName(deviceName);
        setBorrowDate(borrowDate);
        setUsePurpose(usePurpose);*/
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