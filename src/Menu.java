import AusleihObjekt.BorrowObject;
import AusleihObjekt.PC;
import AusleihObjekt.Peripheral;
import Person.Mitarbeiter;
import Person.Student;

import java.text.*;
import java.util.*;

public class Menu {

    // Design menu
    boolean exit;
    private void printHeader() {
        System.out.println("--------------------------------");
        System.out.println("|      Ausleihsystemprogram    |");
        System.out.println("|        Menu Application      |");
        System.out.println("--------------------------------");
    }

    private void printMenu(){
        System.out.println("\nMain Menu:");
        System.out.println("1)  Add new device");
        System.out.println("2)  Return device");
        System.out.println("3)  List of devices");
        System.out.println("4)  Search device");
        System.out.println("5)  Exit");
    }

    protected void runMenu(){
        printHeader();
        while (!exit){
            printMenu();
            int choice = getInput();
            performAction (choice);
        }
    }

    private int getInput(){
        Scanner sc = new Scanner(System.in);
        int choice = -1;
        while (choice< 0 || choice>5)
            try {
                System.out.println("\nPlease select a choice between 0-5:");
                choice = Integer.parseInt(sc.nextLine());
                if (choice>5 || choice<0){
                    System.out.println("Wrong number! Your selected number should be between 0 - 5.");
                }
            } catch (NumberFormatException e){
                System.out.println("Invalid selection: Please try again.");
            }
        return choice;}

    private void performAction(int choice){
        switch (choice){
            case 1:
                addNewInput();
                break;
            /*case 2:
                deleteDevice();
                break;
            case 3:
                showList();
                break;
            case 4:
                searchDevice();
                break;*/
            case 5:
                exit = true;
                System.out.println("Goodbye and have a nice day!");
                break;
            default:
                System.out.println("Sorry! an unknown error has occured.");
        }
    }


    //New Menu ->   Everything related to add new device:
    private void addNewInput (){
        System.out.println("\nADD NEW DEVICE TO BORROW LIST:");

        //-->Device type
        System.out.println("Select type of device:");
        System.out.println("[1]  PC");
        System.out.println("[2]  Peripheral");
        System.out.println("[3]  Back to main menu");
        int choice1 = -1;
        Scanner sc1 = new Scanner(System.in);
        while (choice1<1 || choice1>3) {
            try {
                choice1 = Integer.parseInt(sc1.nextLine());
                if (choice1<1 || choice1>3) {System.out.println("Your selected number is not from the menu. Please try again:");}
            } catch (NumberFormatException e) {
                System.out.println("Invalid selected number. Please try again:");
            }
        }

        // Choose PC as Device:


            //Getting parameters of PC object
            String deviceName="";
            String purpose = "";
            System.out.println("Enter device name:");
            Scanner sc3 = new Scanner(System.in);
            try {
                deviceName = sc3.nextLine();
            } catch (InputMismatchException e){
                System.out.println("Error with entering Device Name.");
            }

            Calendar c1 = new GregorianCalendar();
            /*TimeStamp ts = new TimeStamp();*/

            System.out.println("Enter borrowing reason:");
            Scanner sc4 = new Scanner(System.in);
            try {
                purpose = sc4.nextLine();
            } catch (InputMismatchException e){
                System.out.println("Error with entering Device Name.");
            }

            //Create PC Object:


            switch (choice1) {
                case 1:
                    BorrowObject b1 = new PC(deviceName, c1, purpose);
                    System.out.println(b1.toString() + " has been added.\n");
                    break;
                case 2:
                    BorrowObject b2 = new Peripheral(deviceName, c1, purpose);
                    System.out.println(b2.toString() + " has been added.\n");
                    break;
                case 3:
                    System.out.println("You'll head back to main menu.\n");
                    runMenu();
            }


        //--> Person type
        System.out.println("Select type of person:");
        System.out.println("[1]  Student");
        System.out.println("[2]  Colleague");
        System.out.println("[3]  Back to main menu");
        int choice2 = -1;
        Scanner sc2 = new Scanner(System.in);

        while (choice2<1 || choice2>3) {
            try {
                choice2 = Integer.parseInt(sc2.nextLine());
                if (choice2<1 || choice2>3) {System.out.println("Your selected number is not from the menu. Please try again:");}
            } catch (NumberFormatException e) {
                System.out.println("Invalid selected number. Please try again:");
            }
        }


            String lastname="";
            String name="";
            String idNumber="";

            //scan last name
            Scanner sc5 = new Scanner(System.in);
            System.out.println("Enter last name: ");
            try {
                lastname = sc5.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Error with entering last name.");
            }

            //scan name
            Scanner sc6 = new Scanner(System.in);
            System.out.println("Enter first name: ");
            try {
                name = sc6.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Error with entering first name.");
            }

            //scan idNumber
            Scanner sc7 = new Scanner(System.in);
            System.out.println("Enter ID number: ");
            try {
                idNumber = sc7.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Error with entering ID number.");
            }

            switch (choice2){
                case 1:
                    Person.Person p1 = new Student(lastname, name, idNumber);          //it has to be from the super class "Person" in order later to add to ArrayList. cause arrayList knows only items of super class.
                    System.out.println(p1.toString()+" has been added.");
                    break;
                case 2:
                    Person.Person p2 = new Mitarbeiter(lastname, name, idNumber);
                    System.out.println(p2.toString()+" has been added.");
                    break;
                case 3:
                    System.out.println("You'll head back to main menu.\n");
                    runMenu();
                    break;
                }

            //Adding info to our ArrayList, which has already been created




    }


}
