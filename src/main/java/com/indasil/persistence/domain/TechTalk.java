package com.indasil.persistence.domain;

import java.util.Date;

/**
 * Created by vashishta on 9/28/15.
 */
public class TechTalk {

    private Long id;
    private String speaker;
    private Date start;

    private Event event;

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSpeaker() {
        return speaker;
    }

    public void setSpeaker(String speaker) {
        this.speaker = speaker;
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TechTalk techTalk = (TechTalk) o;

        if (!speaker.equals(techTalk.speaker)) return false;
        if (!start.equals(techTalk.start)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = speaker.hashCode();
        result = 31 * result + start.hashCode();
        return result;
    }


}
