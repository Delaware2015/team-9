package cas.controllers;

import cas.models.Person;
import cas.models.PersonDAO;
import cas.models.Student;
import cas.models.StudentDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by emaron on 10/31/15.
 */
@Controller
public class PersonController {

    @Autowired
    private PersonDAO personDAO;

    @RequestMapping(value = "/person")
    @ResponseBody
    public Person getStudent(String email, String password){
        Person person= null;

        if(personDAO.findByEmail(email) == null){
            person= new Person();
        } else{
            if(personDAO.findByEmail(email) == email) {
               // person = personDAO.findByEmail(email);
            }
            else{
                person = new Person();
            }
        }
        return person;
    }

    @RequestMapping(value = "/newPerson")
    @ResponseBody
    public String createNewStudent(String firstName, String lastName, String email){
        Person person = null;
        if(personDAO.findByEmail(email) != null){
           person = new Person();
        }
        else{
            person = new Person(firstName, lastName, email);
        }
        return person.toString();
    }

}
