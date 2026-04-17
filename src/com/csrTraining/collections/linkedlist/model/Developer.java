package com.csrTraining.collections.linkedlist.model;

public class Developer extends Employee {
    public Developer(String name, int age, long phone) {
        super(name, age, phone);
    }

    @Override
    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", phone=" + phone +
                '}';
    }

}
