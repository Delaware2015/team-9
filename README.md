# team-9

Elementary School:
https://studentaid.ed.gov/sa/prepare-for-college/checklists/elementary-school

Middle School:
https://studentaid.ed.gov/sa/prepare-for-college/checklists/middle-school

High School Freshman: 
-Grade 9:
https://studentaid.ed.gov/sa/prepare-for-college/checklists/9th-grade
http://www.collegeprep101.com/uploads/1/1/7/2/11721368/freshman_year_checklist.pdf

High School Sophomore:
-Grade 10:
https://studentaid.ed.gov/sa/prepare-for-college/checklists/10th-grade
http://www.collegeprep101.com/uploads/1/1/7/2/11721368/sophomore_year_checklist.pdf

High School Junior:
-Grade 11:
https://studentaid.ed.gov/sa/prepare-for-college/checklists/11th-grade
http://www.collegeprep101.com/uploads/1/1/7/2/11721368/junior_year_checklist.pdf

High School Senior:
-Grade 12:
https://studentaid.ed.gov/sa/prepare-for-college/checklists/12th-grade
http://www.collegeprep101.com/uploads/1/1/7/2/11721368/senior_year_checklist.pdf

Adult Student:
https://studentaid.ed.gov/sa/prepare-for-college/checklists/adult-student

Financial Aid Infographic:
https://studentaid.ed.gov/sa/sites/default/files/financial-aid-process.png

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