package com.indasil.learnjava.spring.dao;

import com.indasil.learnjava.spring.domain.Contact;

import java.util.List;

/**
 * Created by vashishta on 9/23/15.
 */
public interface ContactDao {
    public List<Contact> findAll();
    public List<Contact> findByFirstName(String firstName);
    public void insert(Contact contact);
    public void update(Contact contact);
    public void delete(Long contactId);

    String findFirstNameById(Long id);


}