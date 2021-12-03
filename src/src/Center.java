package src;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author abdel
 */
public class Center {
    private int id;
    private String centerName;
    private Set<Courses> course = new HashSet<Courses>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCenterName() {
        return centerName;
    }

    public void setCenterName(String centerName) {
        this.centerName = centerName;
    }

    public Set<Courses> getCourse() {
        return course;
    }

    public void setCourse(Set<Courses> course) {
        this.course = course;
    }
    
    
}
