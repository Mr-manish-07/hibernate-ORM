package org.manish07.OneToMany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

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
        
        Question question = new Question (100,"What about you?");
    
        Answer ans1 = new Answer(200,"This is Manish Kumar",question);
        Answer ans2 = new Answer(201,"Currently Studying in Heritage for aiming engineering with " +
                "cse",question);
        Answer ans3 = new Answer(203,"I'm From Ranchi Jharkhand",question);
        Answer ans4 = new Answer(204,"Right Now i'm living in kolkata",question);
        
        List<Answer> answers = Arrays.asList (ans1, ans2,ans3,ans4);
        question.setAnswer (answers);
        
        
        session.persist (question);
        session.persist (ans1);
        session.persist (ans2);
        session.persist (ans3);
        session.persist (ans4);
        
        Question question1 = session.find (Question.class, 100);
        
        for(Answer a : question1.getAnswer ()) {
            System.out.println (question1.getQuestion() +" : "+a.getAnswer ());
        }
        
        session.getTransaction().commit();
        session.close();
        
    }
}
