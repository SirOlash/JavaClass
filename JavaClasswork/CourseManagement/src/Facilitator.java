import java.util.ArrayList;
import java.util.List;

public class Facilitator extends User{
    private final List<Course>   courses;
    public Facilitator(String firstName, String lastName, String email, String password) {
        super(firstName, lastName, email, password);
        courses = new ArrayList<>();
    }

    public Course createCourse(String courseName,int courseCode) {
        for (Course course : courses) {
            if (course.getCourseName().equals(courseName)) {
                throw new IllegalArgumentException("You have already created this course");
            }
        }
        String facilitatorFullName = this.getFirstName() +" "+ this.getLastName();
        Course newCourse = new Course(facilitatorFullName,courseName,courseCode);
        courses.add(newCourse);
        CourseManager.addCourse(newCourse);
        return newCourse;
    }

    public void viewCreatedCourses(){
        for (Course course : courses) {
            System.out.println(course);
        }
    }

    public void addGrade(String courseName, String studentName, int grade) {
        for (Course course : courses) {
            if (course.getCourseName().equals(courseName)) {
                for (CourseReg reg : course.getRegistrationsHistory()){
                    if (reg.getStudentName().equals(studentName)) {
                        reg.setGrade(grade);
                        System.out.println("Updated grade for " + studentName + " in " + courseName + " to " + grade);
                        return;
                    }
                }
            }
        }
        throw new IllegalArgumentException("Registration record not found for " + studentName + " in " + courseName);
    }
}
