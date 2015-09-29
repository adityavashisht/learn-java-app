package com.indasil.spring.hibernate;

import com.indasil.persistence.domain.Event;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by vashishta on 9/29/15.
 */

@Service
@Transactional
public class EventService {


    @Autowired
    private SessionFactory sessionFactory;

    /**
     *
     * @param event
     */
    public void saveEvent(Event event) {
        Session session = sessionFactory.getCurrentSession();
        //session.beginTransaction();
        session.saveOrUpdate(event);

    }
}
