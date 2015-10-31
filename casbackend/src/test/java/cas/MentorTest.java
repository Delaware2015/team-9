package cas;

import cas.models.Mentor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by emaron on 10/30/15.
 */
public class MentorTest {

    Mentor testMentor;
    @Before
    public void resourcesNeededToTest(){
        testMentor = new Mentor("Mary", "Sue", "swagster@netscape.com", "Mother");
    }

    @Test
    public void givenAMentorShouldReturnARelationship() {
        assertEquals("Should return a relationship string", "Mother", testMentor.getRelationship());
    }
}
