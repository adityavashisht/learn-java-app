package com.indasil.learnjava.spring.dao;

import com.indasil.learnjava.spring.domain.Contact;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by vashishta on 9/23/15.
 */
@Component
public class SpringContactDao implements ContactDao, InitializingBean {

    private JdbcTemplate jdbcTemplate;

    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    @Autowired
    private DataSource dataSource;



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


        Map<String, Object> parameters = new HashMap<String, Object>();
        parameters.put("name", firstName);


        String namefinder = "select * from contact where FIRST_NAME = :name";

        List<Contact> contacts = namedParameterJdbcTemplate.query(namefinder, parameters, new RowMapper<Contact>() {
            @Override
            public Contact mapRow(ResultSet rs, int rowNum) throws SQLException {
                Contact contact = new Contact();
                contact.setId(rs.getLong("id"));
                contact.setFirstName(rs.getString("first_name"));
                contact.setLastName(rs.getString("last_name"));
                contact.setBirthDate(rs.getDate("birth_date"));

                return contact;
            }

        });

        return contacts;

    }

    @Override
    public void insert(Contact contact) {

        String insert = "insert into contact (first_name,last_name,birth_date) values(:firstName,:lastName,:birthDate)";

        Map<String, Object> parameters = new HashMap<String, Object>();
        parameters.put("firstName", contact.getFirstName());
        parameters.put("lastName", contact.getLastName());
        parameters.put("birthDate", contact.getBirthDate());

        namedParameterJdbcTemplate.update(insert,parameters);



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
        namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }
}
