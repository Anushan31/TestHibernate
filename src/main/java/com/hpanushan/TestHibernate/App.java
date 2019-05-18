package com.hpanushan.TestHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Employee emp1 = new Employee();
        emp1.setId(359);
        emp1.setName("Nimesh");
        emp1.setSalary(1000);
        
        Configuration con = new Configuration().configure().addAnnotatedClass(Employee.class);
        
        
        SessionFactory sf = con.buildSessionFactory();
        
        Session session = sf.openSession();
        
        Transaction tx = session.beginTransaction();
        
        session.save(emp1);
        
        tx.commit();
    }
}
