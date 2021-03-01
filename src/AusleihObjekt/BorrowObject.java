package AusleihObjekt;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public abstract class BorrowObject {
    private String deviceName;
    private Calendar borrowDate;
    private Calendar returnDate;
    private String usePurpose;

    BorrowObject (String deviceName, Calendar borrowDate, String usePurpose){
        this.deviceName = deviceName;
        this.borrowDate = borrowDate;
        this.usePurpose = usePurpose;
    }



    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public void setReturnDate(Calendar returnDate) {
        this.returnDate = returnDate;
    }

    public void setUsePurpose(String usePurpose) {
        this.usePurpose = usePurpose;
    }

    public void setBorrowDate(Calendar borrowDate) {
        this.borrowDate = borrowDate;
    }


    DateFormat dateformatter = new SimpleDateFormat("dd-MM-YYYY HH:mm:ss");
    @Override
    public String toString() {
        return "Device Info: [" +
                "Device Name='" + deviceName + '\'' +
                ", Borrow Date=" + dateformatter.format(borrowDate.getTime())+
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
