package src;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author abdel
 */
public class Courses {
    private int id ;
    private String courseName;
    private Set<Center> center = new HashSet<Center>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Set<Center> getCenter() {
        return center;
    }

    public void setCenter(Set<Center> center) {
        this.center = center;
    }
    
    
}
