package com.indasil.persistence.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by vashishta on 9/28/15.
 */
public class Event implements Serializable {

    private Long id;
    private Date date;
    private String title;

    private Set<TechTalk> techTalkSet = new HashSet<TechTalk>();

    public Set<TechTalk> getTechTalkSet() {
        return techTalkSet;
    }

    public void setTechTalkSet(Set<TechTalk> techTalkSet) {
        this.techTalkSet = techTalkSet;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void addTechTalk(TechTalk talk) {
        if(getTechTalkSet()!=null) {
            techTalkSet.add(talk);
        }
    }

}
