package cas;

import cas.models.Mentor;
import cas.models.Student;
import cas.models.Task;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

/**
 * Created by emaron on 10/30/15.
 */
public class StudentTest {

    Student testStudent;
    ArrayList<Task> testArrayList = new ArrayList<>();
    Mentor testMentor;


    @Before
    public void resourcesNeededToTest() {
        testStudent = new Student();
        testMentor = new Mentor();
    }

    @Test
    public void givenAStudentShouldReturnAPassword(){
        assertEquals("Should return a string", "default", testStudent.getPassword());

    }
}
