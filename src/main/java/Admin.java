import utils.Utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Admin extends Person {

    private String id = "A";
    private static int adminID = 1000001;
    private static List<Admin> admins = new ArrayList<>();

    public Admin(String firstName, String lastName){
        super(firstName, lastName);
        this.id = id + adminID;
        adminID++;
    }

    public static void addAdmin(Admin admin){
        admins.add(admin);
    }

    public static void printAdmins(){
        for (Admin admin : admins){
            System.out.println(admin.getFirstName());
            System.out.println(admin.getLastName());
            System.out.println(admin.getUserName());
            System.out.println(admin.getPassword());
            System.out.println(admin.id);
        }
    }

    public static List<Admin> getAdmins(){
        return admins;
    }

    public void runAdmin(){

        Utils.printExitMessage();
        Scanner in = new Scanner(System.in);

        System.out.println("Would you like");
        System.out.println("1 - Register new user");
        System.out.println("2 - Print existing data");
        System.out.println();

        String input = in.nextLine();

        if(Utils.isExit(input)) {
            System.out.println("Goodbye");
            System.exit(0);
        } else if (input.equals("1")) {
            runRegistration();
        }  else if (input.equals("2")) {
            runPrintInfo();
        }
    }
    private void runRegistration(){
        System.out.println("Running registration");
        Utils.printExitMessage();

        Scanner in = new Scanner(System.in);

        System.out.println("Would you like");
        System.out.println("1 - Register new Student");
        System.out.println("2 - Register new Professor");
        System.out.println("3 - Register new Admin");
        String input = in.nextLine();

        if(Utils.isExit(input)) {
            System.out.println("Goodbye");
            System.exit(0);
        } else if (input.equals("1")) {
            runRegisterNewStudent();
        }  else if (input.equals("2")) {
            runRegisterNewProfessor();
        }  else if (input.equals("3")) {
            runRegisterNewAdmin();
        }
    }

    private void runPrintInfo(){
        System.out.println("Running print Info");
        Utils.printExitMessage();
    }

    private void runRegisterNewStudent(){

        System.out.println("Register New Student");
        Utils.printExitMessage();

        Scanner in = new Scanner(System.in);

        System.out.print("Enter first name: ");
        String firstName = in.nextLine();

        System.out.print("Enter last name: ");
        String lastName = in.nextLine();

        System.out.println("Would you like to add courses? ");
        System.out.println("1 - yes");
        System.out.println("2 - no");
        System.out.println("Exit - q");
        String input = in.nextLine();

        if(Utils.isExit(input)) {
            System.out.println("Goodbye");
            System.exit(0);
        } else if (input.equals("1")) {
            runCourseRegistration();
        }  else if (input.equals("2")) {
            Student student = new Student(firstName, lastName, new ArrayList<>());
            student.addStudent(student);
            runRegistration();
        }
    }
    private void runRegisterNewProfessor(){
        System.out.println("Running print Info");
        Utils.printExitMessage();
    }

    private void runRegisterNewAdmin(){
        System.out.println("Running print Info");
        Utils.printExitMessage();
    }

    private void runCourseRegistration(){
        System.out.println("***********************");
        Utils.printExitMessage();

        List<String> courses = new ArrayList<>();
        Scanner in = new Scanner(System.in);

        do {
            System.out.println("Enter course name or 'q': ");
            String input = in.nextLine();
            if (input.equalsIgnoreCase("q")) {
                Utils.printList(courses);
                runRegistration();

                break;
            } else {
                courses.add(input);
            }

        } while (true);
    }
}
