package Person;

public abstract class Person {
    private String name, lastname, idNumber;

    public Person(String lastname, String name, String idNumber){
        this.name = name;
        this.lastname = lastname;
        this.idNumber = idNumber;
    }

    @Override
    public String toString() {
        return "Person Info: [" +
                "First Name='" + name + '\'' +
                ", Last name='" + lastname + '\'' +
                ", ID Number='" + idNumber + '\'' +
                ']';
    }

    public void setName(String name) {this.name = name; }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public String getIdNumber() {
        return idNumber;
    }
}
