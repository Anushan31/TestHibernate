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
    	// Configuring the name object
    	FullName nm = new FullName();
    	nm.setFname("Anushan");
    	nm.setMname("Ramesh");
    	nm.setLname("Ariyarathna");
    	//
    	
        Employee emp1 = new Employee();
        emp1.setId(210);
        emp1.setName(nm);
        emp1.setSalary(220);
        
        Configuration con = new Configuration().configure().addAnnotatedClass(Employee.class);
        
        ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();                               
        
        SessionFactory sf = con.buildSessionFactory(reg);
        
        Session session = sf.openSession();
        
        Transaction tx = session.beginTransaction();
        
        session.save(emp1);
        
        tx.commit();
    }
}
