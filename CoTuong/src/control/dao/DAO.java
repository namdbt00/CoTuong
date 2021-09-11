package control.dao;
 
import java.io.File;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

 
public class DAO {
    public static Session session;
     
    public DAO(){
            if(session == null){
                try {
                    session = new Configuration().configure(new File("src/resources/hibernate.cfg.xml")).buildSessionFactory().openSession();
                }catch (HibernateException ex) {
                    ex.printStackTrace();
                }
            }
    }
}