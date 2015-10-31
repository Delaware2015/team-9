package cas.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jack Baumann on 10/30/15.
 */
@Entity
@Table(name="universities")
public class University {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String name;

    public University() {}

    public University(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}