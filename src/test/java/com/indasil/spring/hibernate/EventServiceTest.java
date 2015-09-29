package com.indasil.spring.hibernate;

import com.indasil.persistence.domain.Event;
import com.indasil.persistence.domain.TechTalk;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

/**
 * Created by vashishta on 9/29/15.
 */
@Transactional
@RunWith(SpringJUnit4ClassRunner.class)
// Multiple locations can be specified with comma delimited values
@ContextConfiguration(locations = {
        "/spring-hibernate.xml",

})
public class EventServiceTest {

    @Autowired
    private EventService eventService;

    @Test
    public void testEvent() {
        Event event = new Event();
        event.setDate(new Date());
        event.setTitle("Hibernate Symposium");

        TechTalk techTalk = new TechTalk();
        techTalk.setEvent(event);
        techTalk.setSpeaker("Ady");
        techTalk.setStart(new Date());

        event.addTechTalk(techTalk);

        eventService.saveEvent(event);
    }
}
