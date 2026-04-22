package com.csrTraining.dateandtime.sql;

import java.sql.Date;
import java.sql.Time;

public class SQLDateDemo {
    static void main(String[] args) {
        Date currentDate = new Date(System.currentTimeMillis());
        java.util.Date currentdate1=  new java.util.Date(System.currentTimeMillis());
        System.out.println(currentDate);
        System.out.println(currentdate1);
        Time currentTime= new Time(System.currentTimeMillis() +43200000);
        System.out.println(currentTime);

    }
}