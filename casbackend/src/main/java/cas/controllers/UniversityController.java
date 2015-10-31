package cas.controllers;

import cas.models.Task;
import cas.models.TaskDAO;
import cas.models.University;
import cas.models.UniversityDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by emaron on 10/31/15.
 */
@Controller
public class UniversityController {

    @Autowired
    private UniversityDAO universityDAO;

    @RequestMapping(value = "/university")
    @ResponseBody
    public University getMentor(String name){
        University university= null;

        if(universityDAO.findByName(name) == null){
            university= new University();
        } else{
            if(universityDAO.findByName(name) == name) {
                //mentor = mentorDAO.findByEmail(email);
            }
            else{
                university= new University();
            }
        }
        return university;
    }

    @RequestMapping(value = "/newUniversity")
    @ResponseBody
    public String createNewStudent(String name){
        University university = null;
        try {
            university = new University(name);
            universityDAO.save(university);
        } catch (Exception e) {
            return "Error created student: " + e.toString();
        }
        return university.toString();
    }
}
