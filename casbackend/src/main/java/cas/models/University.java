package cas.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jack Baumann on 10/30/15.
 */
@Entity
@Table(name="universityStuff")
public class University {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private List<Task> taskList;

    public University() {}

    public University(String name List<Task> taskList){
        this.name = name;
        this.taskList = new ArrayList<Task>();
    }

    public String getName() {
        return name;
    }

    public List<Task> getTaskList() {
        return taskList;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTaskList(List<Task> taskList) {
        this.taskList = taskList;
    }
}