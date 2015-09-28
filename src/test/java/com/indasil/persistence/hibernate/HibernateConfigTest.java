package com.indasil.persistence.hibernate;

import com.indasil.persistence.domain.Event;
import com.indasil.persistence.domain.HibernateUtil;
import com.indasil.persistence.domain.TechTalk;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.util.Date;

/**
 * Created by vashishta on 9/28/15.
 */
public class HibernateConfigTest {

    private HibernateUtil util;

    @Before
    public void setUp() {
        util = HibernateUtil.getInstance();
    }

    @Ignore
    public void checkSession() {
        Session s = util.getSession();

        Event event = new Event();
        event.setDate(new Date());
        event.setTitle("Hibernate Symposium");

        Transaction tx = s.beginTransaction();

        s.save(event);

        tx.commit();


        System.out.println(s);
    }

    @Test
    public void createEventWithTechTalk() {

        Session s = util.getSession();

        Event event = new Event();
        event.setDate(new Date());
        event.setTitle("Hibernate Symposium");

        TechTalk techTalk = new TechTalk();
        techTalk.setEvent(event);
        techTalk.setSpeaker("Ady");
        techTalk.setStart(new Date());

        event.addTechTalk(techTalk);


        Transaction tx = s.beginTransaction();

        s.save(event);

        tx.commit();


    }


}
