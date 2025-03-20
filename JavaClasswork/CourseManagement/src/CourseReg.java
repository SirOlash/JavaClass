public class CourseReg {
    private String studentName;
    private String courseName;
    private String facilitatorName;
    private int grade;

    public CourseReg(String studentName, String courseName, String facilitatorName, int grade) {
        this.studentName = studentName;
        this.courseName = courseName;
        this.facilitatorName = facilitatorName;
        this.grade = -1;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getFacilitatorName() {
        return facilitatorName;
    }

    public void setGrade(int grade) {
        if (grade >= 0 && grade <= 100) {
            this.grade = grade;
        }
    }

    public String getGrade() {
        if (this.grade == -1){
            return "Unassigned";
        }
        else {
            return this.grade+"";
        }
    }



}
