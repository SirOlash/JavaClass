import java.util.ArrayList;
import java.util.List;

public class Student extends User {
    List<CourseReg> registrations;

    public Student(String firstName, String lastName, String email, String password) {
        super(firstName, lastName, email, password);
        registrations = new ArrayList<>();
    }

    public void viewAllCourses() {
        List<Course> courses = CourseManager.getAllCourses();
        if (courses.isEmpty()){
            System.out.println("No courses found");
            return;
        }
        for (Course course : courses) {
            System.out.println("Facilitator: " + course.getFacilitatorName() +
                    ", Course: " + course.getCourseName() + ", CourseCode: " + course.getCourseCode());
        }

    }

    public void registerCourse(String courseName,int courseCode) {
        List<Course> courses = CourseManager.getAllCourses();
        String studentName = this.getFirstName() + " " + this.getLastName();
        for (Course course : courses) {
            if (course.getCourseName().equals(courseName)) {
                CourseReg register = new CourseReg(studentName,course.getCourseName(),course.getFacilitatorName(),course.getCourseCode());
                registrations.add(register);
                course.addCourseReg(register);
            }
        }

    }

}
