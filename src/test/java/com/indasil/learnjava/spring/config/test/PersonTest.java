package com.indasil.learnjava.spring.config.test;

import com.indasil.learnjava.spring.domain.Person;
import com.indasil.learnjava.spring.service.PersonService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.Assert;

/**
 * Created by vashishta on 9/22/15.
 */
@RunWith(SpringJUnit4ClassRunner.class)
// Multiple locations can be specified with comma delimited values
@ContextConfiguration(locations = {
        "/db-config.xml",

})
public class PersonTest {

    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    @Autowired
    private PersonService personService;

    @Test
    public void testInit() {
        Assert.notNull(namedParameterJdbcTemplate);
    }

    @Test
    public void testAdd() {
        Person p = new Person();
        p.setId(2L);
        p.setName("Ady");

        personService.addPerson(p);
    }

    @Test
    public void check() {
        personService.getNext();
    }
}
