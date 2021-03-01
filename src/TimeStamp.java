import java.text.*;
import java.util.* ;

public class TimeStamp {

    Calendar cal = new GregorianCalendar();

    static DateFormat dateformatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");    //DateFormat: Oberklasse & SimpleDateFormat:Unterklasse

    void printTime (){          //change to private???
        System.out.println(dateformatter.format(cal.getTime()));
    }
}
