package cas.models;


import javax.persistence.*;

/**
 * Created by tejas1794 on 10/30/15.
 */
@Entity
@Table(name="task")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String name;

    private Integer studentId;

    private String dateTime;

    public Task() {}

    public Task(String name, String dateTime){
        this.name = name;
        this.dateTime = dateTime;
    }

    public String getName() {
        return name;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

}
