package problem;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {
    Person person;
    @BeforeEach
    public void setUp() {
        person = new Person();
    }

    @Test
    public void testThatProblemListIsEmpty() {
        person.getSize();
        assertEquals(0,person.getSize());
    }
    @Test
    public void testThatYouCanCreateProblem() {
        person.createProblem("problemName",ProblemType.EDUCATION);
        assertEquals(1,person.getSize());
    }
    @Test
    public void testThatYouCanAddProblem() {
        person.createProblem("problemName", ProblemType.EDUCATION);
        person.createProblem("problemName2",ProblemType.FINANCIAL);
        assertEquals(2,person.getSize());
    }
    @Test
    public void testThatInvalidProblemTypeThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> {
            ProblemType invalidProblemType = ProblemType.valueOf("LOVE");
            person.createProblem("problemName", invalidProblemType);
        });
    }
    @Test
    public void testThatYouCanFindProblemById(){
        person.createProblem("problemName",ProblemType.EDUCATION);
        person.createProblem("problemName2",ProblemType.FINANCIAL);
        assertEquals(2,person.getSize());
        Problem problem = person.findProblemById(1);
        assertEquals("problemName",problem.getProblemName());
      //  assertEquals("id: 1, problemName: problemName, problemType: EDUCATION, isSolved: false",person.findProblemById(1));
    }
    @Test
    public void testThatYouCanSolveProblem(){
        person.createProblem("problemName",ProblemType.EDUCATION);
        person.createProblem("problemName2",ProblemType.FINANCIAL);
        person.solveProblem(1);
        Problem problem = person.findProblemById(1);
        assertTrue(problem.getIsSolved());
    }

    @Test
    public void testThatIAddTwoProblems_SolveOne_SizeOfUnsolvedProblemsIsOne() {
        person.createProblem("problemName",ProblemType.EDUCATION);
        person.createProblem("problemName2",ProblemType.FINANCIAL);
        person.solveProblem(1);
        assertEquals(1,person.sizeOfUnsolvedProblems());
    }

}
