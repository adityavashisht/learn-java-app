package com.indasil.learnjava.spring.domain;

import java.io.Serializable;

/**
 * Created by vashishta on 9/23/15.
 */
public class ContactTelDetail implements Serializable {
    private Long id;
    private Long contactId;
    private String telType;
    private String telNumber;

    // Getter and setter method omitted
    public String toString() {
        return "Contact Tel Detail - Id: " + id + ", Contact id: " + contactId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getContactId() {
        return contactId;
    }

    public void setContactId(Long contactId) {
        this.contactId = contactId;
    }

    public String getTelType() {
        return telType;
    }

    public void setTelType(String telType) {
        this.telType = telType;
    }

    public String getTelNumber() {
        return telNumber;
    }

    public void setTelNumber(String telNumber) {
        this.telNumber = telNumber;
    }
}
