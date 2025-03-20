import java.util.ArrayList;
import java.util.List;


public class Admin {
    private List<Student> students;
    private final List<Facilitator> facilitators;

    public Admin() {
        students = new ArrayList<>();
        facilitators = new ArrayList<>();
    }

    public boolean register(String firstName, String lastName, String email, String password,String choice) {
           if (choice.equalsIgnoreCase("s")) {
               students.add(new Student(firstName, lastName, email, password));
               return true;
           }
           else{
               facilitators.add(new Facilitator(firstName, lastName, email, password));
               return false;
           }

    }
    public Student studentLogin(String email, String password) {
        for (Student student : students) {
            if (student.getEmail().equalsIgnoreCase(email) && student.validatePassword(password)) {
               return student;
            }
        }
        throw new IllegalArgumentException("Invalid email or password");
    }
    public Facilitator facilitatorLogin(String email, String password) {
        for (Facilitator facilitator : facilitators) {
            if (facilitator.getEmail().equalsIgnoreCase(email) && facilitator.validatePassword(password)) {
               return facilitator;
            }
        }
        throw new IllegalArgumentException("Invalid email or password");
    }

    public Student getStudentByEmail(String email) {
        for (Student student : students) {
            if (student.getEmail().equals(email)) {
                return student;
            }
        }
        throw new IllegalArgumentException("This email has not been registered");
    }

    public Facilitator getFacilitatorByEmail(String email) {
        for (Facilitator facilitator : facilitators) {
            if (facilitator.getEmail().equals(email)) {
                return facilitator;
            }
        }
        throw new IllegalArgumentException("This email has not been registered");
    }

}
