package com.indasil.learnjava.spring.domain;

/**
 * Created by vashishta on 9/22/15.
 */
public class Person {
    private Long id;
    private String name;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(Long id) {

        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
