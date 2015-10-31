package cas.models;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by tejas1794 on 10/30/15.
 */
@Entity
@Table(name="studentStuff")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String school;

    private String password;

    private Mentor mentor;

    private List<Task> taskList;

    public Student() {}

    public Student(String school, String password, Mentor mentor, List<Task> taskList){
        this.school = school;
        this.password = password;
        this.mentor = mentor;
        this.taskList = new ArrayList<Task>();
    }

    public String getSchool() {
        return school;
    }

    public String getPassword() {
        return password;
    }

    public Mentor getMentor() {
        return mentor;
    }

    public List<Task> getTaskList() {
        return taskList;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setMentor(Mentor mentor) {
        this.mentor = mentor;
    }

    public void setTaskList(List<Task> taskList) {
        this.taskList = taskList;
    }
}
