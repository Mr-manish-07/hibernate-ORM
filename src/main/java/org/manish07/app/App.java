package org.manish07.app;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.manish07.student.Address;
import org.manish07.student.Certificate;
import org.manish07.student.Students;

import java.io.IOException;
import java.util.Date;

public class App {
    public static void main (String[] args) throws IOException {
        System.out.println ("Hello World!");
        
        SessionFactory sessionFactory = new Configuration ().configure ().buildSessionFactory ();
        
        // Session Factory is same as Connection interface in jdbc as we were using to obtain
        // statement and prepared Statement , here we will use sessionFactory.getCurrentSession()
        // to obtain save method , update , delete , insert etc. through SessionFactory
        
        Certificate certificate = new Certificate ("Java development",
                                                   "Core Java",
                                                   "Heritage",
                                                   "Development"
        );
        Students students = new Students (122, "Manish", "Ranchi", certificate);
        Students students1 = new Students (123, "Amit", "Munger", certificate);
        Students students2 = new Students (124, "Dipu", "Patna", certificate);
        System.out.println (students);
        
//        Address address = new Address ();
//        address.setStreet ("Kolkata");
//        address.setCity ("Ranjeet");
//        address.setState ("Kolkata");
//        address.setAge (18);
//        address.setZip (825316);
//        address.setCreatedDate (new Date ());
        
        
        Session session = sessionFactory.openSession ();
        session.beginTransaction ();
        session.persist (students);
        session.persist (students2);
        session.persist (students1);
//        session.persist (address);
        session.getTransaction ().commit ();
        
        
    }
}