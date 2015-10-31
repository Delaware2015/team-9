package cas.controllers;

import cas.models.Student;
import cas.models.StudentDAO;
import org.springframework.stereotype.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;
import java.util.HashMap;

/**
 * Created by emaron on 10/26/15.
 */
@RestController
public class StudentController {

    @Autowired
    private StudentDAO studentDAO;

    @RequestMapping(value= "/student")
    @ResponseBody
    public Student getStudent(String email, String password){
        Student student= null;

        if(studentDAO.findByEmail(email) == null){
            student=  new Student();
        }else{
            if(studentDAO.findByEmail(email).getPassword() == password) {
                student = studentDAO.findByEmail(email);
            }
            else{
                student= new Student();
            }
        }
        return student;
    }

    @RequestMapping(value = "/newStudent")
    @ResponseBody
    public Student createNewStudent(String firstname, String lastname, String email, String password, String schoolname){

        Student student= null;
        if(studentDAO.findByEmail(email) != null){

        }
        else{
            student = new Student(schoolname,password, )
        }
    }
}