package cas.models;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by tejas1794 on 10/30/15.
 */
@Entity
@Table(name="student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String school;

    private String firstName;

    private String lastName;

    private String email;

    private String password;

    private Integer mentorId;

    public Student() {}

    public Student(String firstName, String lastName, String email, String school, String password, Integer mentorId){
        this.school = school;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.mentorId = mentorId;

    }

    public String getSchool() {
        return school;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Integer getId() {
        return id;
    }

    public Integer getMentor() {
        return mentorId;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setMentor(Integer mentorId) {
        this.mentorId = mentorId;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}
