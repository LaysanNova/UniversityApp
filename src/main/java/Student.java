import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Student extends Academy{
    private String id = "S";
    private static int studentID = 1000001;
    private static List<Student> students = new ArrayList<>();

    public Student(String firstName, String lastName, List<String> courses ){

        super(firstName, lastName, courses);
        this.id = id + studentID;
        studentID++;
        System.out.println("Student " + firstName + " " + lastName + " is in system.");
    }

    public void addStudent(Student student){
        students.add(student);

    }
}
