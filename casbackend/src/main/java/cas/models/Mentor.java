package cas.models;


import javax.persistence.*;

/**
 * Created by emaron on 10/30/15.
 */
@Entity
@Table(name="MentorStuff")
public class Mentor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String firstName;

    private String lastName;

    private String email;

    private String relationship;

    public Mentor() {}

    public Mentor(String firstName, String lastName, String email, String relationship){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.relationship = relationship;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getRelationship() {
        return relationship;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }
}
