package problem;

public class Problem {

    private String problemName;
    private ProblemType problemType;
    private boolean isSolved;
    private int id;

    public Problem(int id, String name, ProblemType problemType) {
        this.problemName = name;
        this.problemType = problemType;
        this.isSolved = false;
        this.id = id;
    }
    public boolean getIsSolved() {
        return isSolved;
    }
    public void setIsSolved(boolean isSolved) {
        this.isSolved = isSolved;
    }

    public int getId(){
        return id;
    }
    public String toString() {
        return "id: " + id + ", problemName: " + problemName + ", problemType: " + problemType + ", isSolved: " + isSolved;
    }
    public String getProblemName() {
        return problemName;
    }



}
