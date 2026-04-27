package com.csrTraining.streamApi;

import java.util.List;

public class Person {
    private String name;
    private List<String> phone_no;

    public String getName() {
        return name;
    }

    public List<String> getPhone_no() {
        return phone_no;
    }

    public Person(String name, List<String> phone_no) {
        this.name = name;
        this.phone_no = phone_no;
    }
}
