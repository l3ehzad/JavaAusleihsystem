package Person;

public class Student extends Person{
    //private String name, lastname, idNumber;      //die werden automatisch vererbt.

    public Student(String lastname, String name, String idNumber){
        super(lastname, name, idNumber);
    }
}
