package com.hpanushan.TestHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class App 
{
    public static void main( String[] args )
    {
        Employee emp;
        
        Configuration con = new Configuration().configure().addAnnotatedClass(Employee.class);
        
        ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();                               
        
        SessionFactory sf = con.buildSessionFactory(reg);
        
        Session session = sf.openSession();
        
        Transaction tx = session.beginTransaction();
        
        // Reading the object according to the primary key 
        emp = (Employee) session.get(Employee.class, 341);
        //
        
        tx.commit();
        
        System.out.println(emp);
    }
}
