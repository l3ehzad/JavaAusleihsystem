package AusleihObjekt;

import java.util.Date;

public abstract class BorrowObject {
    String deviceName;
    Date borrowDate;
    Date returnDate;
    String usePurpose;

    public void setUsePurpose(String usePurpose) {
        this.usePurpose = usePurpose;
    }

    @Override
    public String toString() {
        return "Device Info: [" +
                "Device Name='" + deviceName + '\'' +
                ", Borrow Date=" + borrowDate +
                ", Return Date=" + returnDate +
                ", Using Purpose='" + usePurpose + '\'' +
                ']';
    }

    static boolean available = true;

    public BorrowObject (String deviceName){
        this.deviceName = deviceName;
    }

    public abstract void borrow ();
    public abstract void giveBack ();
}
