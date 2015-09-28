package com.indasil.persistence.domain;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

/**
 * Created by vashishta on 9/28/15.
 */
public class HibernateUtil {

    private static SessionFactory sessionFactory;

    private static HibernateUtil hibernateUtil = new HibernateUtil();


    private HibernateUtil() {
        createFactory();
    }

    public static HibernateUtil getInstance() {
        return hibernateUtil;
    }

    private void createFactory() {
        // A SessionFactory is set up once for an application!
        final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
                .configure() // configures settings from hibernate.cfg.xml
                .build();
        try {
            sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
        } catch (Exception e) {
            // The registry would be destroyed by the SessionFactory, but we had trouble building the SessionFactory
            // so destroy it manually.
            e.printStackTrace();
            StandardServiceRegistryBuilder.destroy(registry);
        }

    }

    public Session getSession() {
        return  sessionFactory.getCurrentSession();
    }
}
