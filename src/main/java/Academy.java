import java.util.ArrayList;
import java.util.List;

public class Academy extends Person {

    private List<String> courses = new ArrayList<>();

//    private
    public Academy(String firstName, String lastName, List<String> courses){
        super(firstName, lastName);
        this.courses = courses;
    }
}
