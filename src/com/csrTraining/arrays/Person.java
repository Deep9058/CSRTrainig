package com.csrTraining.arrays;

public class Person {
    String name;
    Long phoneNo;

    public Person(String name, Long phoneNo) {
        this.name = name;
        this.phoneNo = phoneNo;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(Long phoneNo) {
        this.phoneNo = phoneNo;
    }
}
