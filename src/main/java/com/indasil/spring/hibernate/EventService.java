package com.indasil.spring.hibernate;

import com.indasil.persistence.domain.Event;
import com.indasil.persistence.domain.TechTalk;
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
     * @param event
     */
    public void saveEvent(Event event) {
        Session session = sessionFactory.getCurrentSession();
        //session.beginTransaction();

        // Parent driven cascades, here the event is the parent and a tech talk is the child
        // We enable cascade for all session operations on the child, therefore a session save or update
        // will trigger a cascade on the children, issuing an insert/update/delete as necessary
        session.saveOrUpdate(event);


       /* session.save(event);

        session.merge(event);

        session.load(Event.class, event.getId());

        session.delete(event);*/

    }

    public void addTechTalk(Long eventId, TechTalk talk) {

        Session session = sessionFactory.getCurrentSession();

        Event event = session.load(Event.class, eventId);

        // Child is "talk" and we tell the child who the parent is
        // Therefore we can then save the child and the association is intact
        talk.setEvent(event);


        session.save(talk);

    }

    public void addTalkViaParent(Long eventId, TechTalk talk) {

        Session session = sessionFactory.getCurrentSession();

        Event event = session.load(Event.class, eventId);
        talk.setEvent(event);

        event.getTechTalkSet().add(talk);

        session.saveOrUpdate(event);

    }


}
