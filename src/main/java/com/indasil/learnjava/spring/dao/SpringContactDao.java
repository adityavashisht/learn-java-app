package com.indasil.learnjava.spring.dao;

import com.indasil.learnjava.spring.domain.Contact;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.util.List;

/**
 * Created by vashishta on 9/23/15.
 */
@Component
public class SpringContactDao implements ContactDao, InitializingBean {

    private JdbcTemplate jdbcTemplate;

    @Autowired
    private DataSource dataSource;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public String findFirstNameById(Long id) {
        String firstName = jdbcTemplate.queryForObject(
                "select first_name from contact where id = ?",
                new Object[]{id}, String.class);
        return firstName;
    }

    @Override
    public List<Contact> findAll() {
        return null;
    }

    @Override
    public List<Contact> findByFirstName(String firstName) {
        return null;
    }

    @Override
    public void insert(Contact contact) {

    }

    @Override
    public void update(Contact contact) {

    }

    @Override
    public void delete(Long contactId) {

    }

    @Override
    public void afterPropertiesSet() throws Exception {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }
}
