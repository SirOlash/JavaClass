package problem;

import java.util.ArrayList;

public class Person {

    private ArrayList<Problem> problems = new ArrayList<>();
    private ArrayList<Problem> unSolvedProblems = new ArrayList<>();
    private int id = 1;

    public void createProblem(String problemName, ProblemType type) {
        problems.add(new Problem(id++,problemName,type));
    }

    public int getSize() {
        return problems.size();
    }

    public Problem findProblemById(int id) {
        for (Problem problem : problems) {
            if (problem.getId() == id) {
                return problem;
            }
        }
        return null;
    }
    public ArrayList<Problem> getUnSolvedProblems() {
        for (Problem problem : problems) {
            if (!problem.getIsSolved()) {
                unSolvedProblems.add(problem);
            }
        }
        return null;
    }
    public int sizeOfUnsolvedProblems() {
        int count = 0;
        for (Problem problem : problems) {
            if (problem.getIsSolved()) {
                count++;
            }
        }
        return count;
    }
    public void solveProblem(int id) {
        Problem problem = findProblemById(id);
        if (problem != null) {
            problem.setIsSolved(true);
        }
        else {
            System.out.println("Problem not found");
        }
    }

//    public boolean equals(Object obj){
//        if(!obj.getClass().equals(this.getClass())){}
//    }




}
