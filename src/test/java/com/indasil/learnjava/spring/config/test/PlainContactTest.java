package com.indasil.learnjava.spring.config.test;

import com.indasil.learnjava.spring.dao.ContactDao;
import com.indasil.learnjava.spring.dao.PlainContactDao;
import com.indasil.learnjava.spring.domain.Contact;

import java.util.List;

/**
 * Created by vashishta on 9/23/15.
 */
public class PlainContactTest {

    public static void main(String[] args) {
        ContactDao dao = new PlainContactDao();
        List<Contact> contactList = dao.findAll();

        System.out.println(contactList.size());
    }
}
