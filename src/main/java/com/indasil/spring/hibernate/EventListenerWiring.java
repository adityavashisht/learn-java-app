package com.indasil.spring.hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.event.service.spi.EventListenerRegistry;
import org.hibernate.event.spi.EventType;
import org.hibernate.internal.SessionFactoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * Created by vashishta on 9/29/15.
 */
@Component
public class EventListenerWiring {

    @Autowired
    private SessionFactory sessionFactory;

    @Autowired
    private EventSaveUpdateListener saveUpdateListener;


    @PostConstruct
    public void init() {

        EventListenerRegistry registry = ((SessionFactoryImpl) sessionFactory).getServiceRegistry().getService(
                EventListenerRegistry.class);


        registry.getEventListenerGroup(EventType.SAVE_UPDATE).appendListener(saveUpdateListener);
    }


}
