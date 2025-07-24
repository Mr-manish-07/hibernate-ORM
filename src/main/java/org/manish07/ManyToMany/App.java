package org.manish07.ManyToMany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import javax.sound.midi.SysexMessage;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class App {
    public static void main (String[] args) {
        Logger.getLogger ("org.hibernate").setLevel (Level.OFF);
        SessionFactory sessionFactory = new Configuration ().configure ().buildSessionFactory ();
        Session session = sessionFactory.openSession ();
        session.beginTransaction ();
        
        emp emp = new emp ();
        emp.setEid (100);
        emp.setEmployeeName ("Manish Kumar");
        
        emp emp1 = new emp ();
        emp1.setEid (101);
        emp1.setEmployeeName ("Suraj Mondal");
        
        emp emp2 = new emp ();
        emp2.setEid (102);
        emp2.setEmployeeName ("Amit Pal");
        
        
        project project = new project ();
        project.setProjectName ("Java Social Media Project");
        project.setProjectId (200);
        
        project project1= new project ();
        project1.setProjectName ("Web Development Project");
        project1.setProjectId (201);
        
        project project2 = new project ();
        project2.setProjectName ("Ios App Project");
        project2.setProjectId (202);
        
        project project3 = new project ();
        project3.setProjectName ("App Project");
        project3.setProjectId (203);
        
        project project4 = new project ();
        project4.setProjectName ("Os App Project");
        project4.setProjectId (204);
        
        project project5 = new project ();
        project5.setProjectName ("Dbms App Project");
        project5.setProjectId (205);
        
        List<emp> empList = Arrays.asList (emp, emp1, emp2);
        
        emp.setProjectList (Arrays.asList (project, project1, project2));
        emp1.setProjectList (Arrays.asList (project, project1));
        emp2.setProjectList (Arrays.asList (project3, project2, project5));
        
        
        session.persist (emp);
        session.persist (emp1);
        session.persist (emp2);
        session.persist (project);
        session.persist (project1);
        session.persist (project2);
        session.persist (project3);
        session.persist (project4);
        session.persist (project5);
        
        
        
        
        
        
        
        session.getTransaction().commit();
        session.close();
    }
}
