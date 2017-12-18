/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import Bin.Pessoa;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author mathe
 */
public class NBHibernate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        
 
        session.close();
        sf.close();
        
    }
    
}
