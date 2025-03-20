import java.util.ArrayList;
import java.util.List;

public class Course {
    private String facilitatorName;
    private String courseName;
    private int courseCode;
    private final List<CourseReg> registrations;

    public Course(String facilitatorName, String courseName, int courseCode) {
        this.facilitatorName = facilitatorName;
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.registrations = new ArrayList<>();
    }

    public String getCourseName() {
        return courseName;
    }

    public String getFacilitatorName() {
        return facilitatorName;
    }

    public int getCourseCode() {
        return courseCode;
    }

    public void addCourseReg(CourseReg courseReg) {
        registrations.add(courseReg);
    }

    public List<CourseReg> getRegistrationsHistory() {
        return registrations;
    }

    @Override
    public String toString() {
        return "CourseName: " + courseName + ", Facilitator: " + facilitatorName + ", CourseCode: " + courseCode;
    }
}
