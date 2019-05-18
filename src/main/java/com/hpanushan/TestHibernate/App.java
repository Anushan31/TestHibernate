package com.hpanushan.TestHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
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
        emp1.setId(373);
        emp1.setName("Nimesh");
        emp1.setSalary(1000);
        
        Configuration con = new Configuration();
        
        SessionFactory sf = con.buildSessionFactory();
        
        Session session = sf.openSession();
        session.save(emp1);
    }
}
