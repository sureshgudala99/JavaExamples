package com.test.dtst;

import java.util.List;

public class Employee {

    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Employee(Integer id, String name, String city) {
        this.id = id;
        this.name = name;
        this.city = city;
    }

    private String name;
    private String city;



}
