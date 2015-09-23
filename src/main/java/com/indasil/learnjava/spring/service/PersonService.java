package com.indasil.learnjava.spring.service;

import com.indasil.learnjava.spring.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by vashishta on 9/22/15.
 */
@Service
@Transactional
public class PersonService {

    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public void addPerson(Person person) {


        String insert = "insert into Person values(:id,:name)";

        Map<String, Object> parameters = new HashMap<String, Object>();
        parameters.put("id", person.getId());
        parameters.put("name", person.getName());


        namedParameterJdbcTemplate.update(insert, parameters);


    }

    public void getNext() {
        String q = "select 1 from dual";
        Integer value = namedParameterJdbcTemplate.queryForObject(q, new HashMap<String, Object>(), Integer.class);
        System.out.println(value);
    }
}
