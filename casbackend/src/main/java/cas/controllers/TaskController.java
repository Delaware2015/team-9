package cas.controllers;

import cas.models.Mentor;
import cas.models.MentorDAO;
import cas.models.Task;
import cas.models.TaskDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by emaron on 10/31/15.
 * Controller for each Task
 */
@RestController
public class TaskController {

    @Autowired
    private TaskDAO taskDAO;

    @RequestMapping(value = "/task")
    @ResponseBody
    public Task getMentor(String name, String dateTime, Integer studentId ){
        Task task= null;

        if(taskDAO.findByName(name) == null){
            task= new Task();
        } else{
            if(taskDAO.findByName(name) == name) {
                //mentor = mentorDAO.findByEmail(email);
            }
            else{
                task= new Task();
            }
        }
        return task;
    }

    @RequestMapping(value = "/newTask")
    @ResponseBody
    public String createNewStudent(String name, String dateTime, Integer studentId, String status){
        Task task = null;
        try {
            task = new Task(name, dateTime, studentId, status);
            taskDAO.save(task);
        } catch (Exception e) {
            return "Error created student: " + e.toString();
        }
        return "Successful";
    }

    @RequestMapping("/readsingletask")
    @ResponseBody
    public Task readSingle(String name) {
        Task taskExisting;
        try {
            taskExisting = taskDAO.findOneByName(name);
        } catch (Exception ex) {
            return null;
        }

        if (taskExisting == null) {
            return null;
        }

        return taskExisting;
    }
}

