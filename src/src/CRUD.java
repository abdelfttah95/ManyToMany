package src;

import org.hibernate.HibernateException;
import org.hibernate.Session;

/**
 *
 * @author abdel
 */
public class CRUD {
    public void insertData(){
        Session se = NewHibernateUtil.getSessionFactory().openSession();
        try {
            se.beginTransaction();
            
            Center center = new Center();
            Center center2 = new Center();
            
            center.setCenterName("Ibm");
            center2.setCenterName("Sun");
            
            Courses courses = new Courses();
            Courses courses1 = new Courses();
            
            courses.setCourseName("Java");
            courses1.setCourseName("Security");
            
            center.getCourse().add(courses);
            center2.getCourse().add(courses1);
            
            courses.getCenter().add(center);
            courses1.getCenter().add(center2);
            
            se.save(center);
            se.save(center2);
            se.getTransaction().commit();
        } catch (HibernateException e) {
            se.getTransaction().rollback();
            e.printStackTrace();
        }finally{
            se.close();
        }
    }
}
