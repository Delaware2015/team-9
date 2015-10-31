package cas.controllers;

import cas.models.Mentor;
import cas.models.MentorDAO;
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
public class MentorController {

    @Autowired
    private MentorDAO mentorDAO;

    @RequestMapping(value = "/mentor")
    @ResponseBody
    public Mentor getMentor(String email, String lastname){
        Mentor mentor= null;

        if(mentorDAO.findByEmail(email) == null){
            mentor= new Mentor();
        } else{
            if(mentorDAO.findByEmail(email) == lastname) {
                //mentor = mentorDAO.findByEmail(email);
            }
            else{
                mentor= new Mentor();
            }
        }
        return mentor;
    }

    @RequestMapping(value = "/newMentor")
    @ResponseBody
    public String createNewStudent(String firstName, String lastName, String email, String relationship){
        Mentor mentor = null;
        try {
                mentor = new Mentor(firstName, lastName, email, relationship);
                mentorDAO.save(mentor);
            } catch (Exception e) {
                return "Error created student: " + e.toString();
            }
            return mentor.toString();
        }
    }

    /*
     public String create(Integer age, String name) {
        Student student = null;
        try {
            student = new Student(age, name);
            studentDAO.save(student);
        } catch (Exception ex) {
            return "Error created student: " + ex.toString();
        }
        return "Student successfully created! (id = " + student.getId() + ")";
     */


