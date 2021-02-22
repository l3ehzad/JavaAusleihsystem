import AusleihObjekt.*;
import Person.*;

import java.util.*;

public class Ausleihsystem {
    Person p;
    BorrowObject b;

    public Ausleihsystem (Person p, BorrowObject b){
        this.b = b;
        this.p = p;
    }

    public static void printTheList (List<Ausleihsystem>listOfBorrow){
        for (int i=0; i<listOfBorrow.size(); i++){
            System.out.println("#"+i+ " "+ listOfBorrow.get(i).b.toString()+" \nRegistered to:\n"+ listOfBorrow.get(i).p.toString());       //define method in b and p for printing
            System.out.println("____________________________________________");
        }
    }


    //MAIN METHOD
    public static void main (String [] args){

        //define an object of Ausleihsystem class
        PC pc1 = new PC("PCL480");
        Student st1 = new Student("Voss", "Behz", "bv23");      //why set Student.Student to public?
        Ausleihsystem a = new Ausleihsystem(st1,pc1);

        PC pc2 = new PC("PCL481");
        Student st2 = new Student("Trump", "Donald", "DT32");      //why set Student.Student to public?
        Ausleihsystem b = new Ausleihsystem(st2,pc2);


        //adding more info for PC:
        pc1.setUsePurpose("IG.2");

        //creating List
        List<Ausleihsystem> listOfBorrow = new ArrayList<>();

        //add new object to the list
        listOfBorrow.add(a);
        listOfBorrow.add(b);

        //print objects of the list
        printTheList(listOfBorrow);



    }
}
