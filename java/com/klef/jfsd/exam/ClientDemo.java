package com.klef.jfsd.exam;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ClientDemo {
    public static void main(String[] args) {
        // Load the configuration from the specified location
        Configuration configuration = new Configuration();
        configuration.configure("com/klef/jfsd/exam/hibernate.cfg.xml");

        // Build SessionFactory and open a session
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();

        // Perform your Hibernate operations here
        System.out.println("Hibernate is connected successfully!");

        session.close();
        sessionFactory.close();
    }
}
