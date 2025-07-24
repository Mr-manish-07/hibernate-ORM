package org.manish07.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.manish07.student.Address;
import org.manish07.student.Students;

public class FetchDemo {
    public static void main (String[] args) {
        SessionFactory sessionFactory = new Configuration ().configure ().buildSessionFactory ();
        Session session = sessionFactory.openSession();
        Students students =  (Students)session.find (Students.class, 121);
        System.out.println (students.getCity ());
        
        Address address = (Address)session.find (Address.class, 1);
        System.out.println (address);
        
        
        sessionFactory.close ();
        
    }
}
