import java.util.ArrayList;
import java.util.List;

public class CourseManager {
    private static final List<Course> fullCourses = new ArrayList<>();;


    public static void addCourse(Course course) {
        fullCourses.add(course);
    }

    public static List<Course> getAllCourses(){
        return fullCourses;
    }

    public static Course registerCourse(String courseName) {
        for (Course course : fullCourses) {
            if (course.getCourseName().equals(courseName)) {
                return course;
            }
        }
        return null;
    }
}
