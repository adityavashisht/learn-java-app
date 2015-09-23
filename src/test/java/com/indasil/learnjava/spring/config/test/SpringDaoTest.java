package com.indasil.learnjava.spring.config.test;

/**
 * Created by vashishta on 9/23/15.
 */

import com.indasil.learnjava.spring.dao.SpringContactDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
// Multiple locations can be specified with comma delimited values
@ContextConfiguration(locations = {
        "/db-config.xml",

})
public class SpringDaoTest {

    @Autowired
    private SpringContactDao springContactDao;

    @Test
    public void checkNameById() {
        String name = springContactDao.findFirstNameById(1L);
        System.out.println(name);
    }
}
