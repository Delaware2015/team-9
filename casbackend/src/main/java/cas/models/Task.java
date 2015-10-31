package cas.models;


import javax.persistence.*;

/**
 * Created by tejas1794 on 10/30/15.
 * Task Class
 */
@Entity
@Table(name = "task")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String name;

    private String status;

    @Column(name = "studentid")
    private Integer studentId;

    private String date;

    public Task() {
    }

    public Task(String name, String dateTime, Integer studentId, String status) {
        this.name = name;
        this.date = dateTime;
        this.studentId = studentId;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public String getDateTime() {
        return date;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public String getStatus() {
        return status;
    }

    public Integer getId() {
        return id;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDateTime(String dateTime) {
        this.date = dateTime;
    }

}
