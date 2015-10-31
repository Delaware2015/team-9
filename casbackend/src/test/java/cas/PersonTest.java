package cas;

import cas.models.Person;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by emaron on 10/30/15.
 */
public class PersonTest {

    Person testPerson;

    @Before
    public void resourcesNeededToTest(){
        testPerson = new Person("John", "Doe", "blandemail@comcast.net");

    }

    @Test
    public void givenPersonShouldReturnAName(){
        assertEquals("Should return a string", "John", testPerson.getFirstName());

    }
}
