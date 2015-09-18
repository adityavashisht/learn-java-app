package com.indasil.learnjee.servlet.model;

/**
 * Created by vashishta on 9/17/15.
 */

// POJO - Plain old java object
public class Person {

    private String name;
    private Integer age;

    private Address address;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        System.out.println("Get method called by JSP");
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
