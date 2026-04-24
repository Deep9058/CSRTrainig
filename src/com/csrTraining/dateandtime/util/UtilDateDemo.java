package com.csrTraining.dateandtime.util;

import java.util.Date;

public class UtilDateDemo {
    static void main(String[] args) {

        Date currentDate= new Date();   //  Current Date and Time.  //
        System.out.println(currentDate);
        Date date= new Date(126,7,25,11,24,55);     // date by Constructor  //
        Date futureDate = new Date(currentDate.getTime() + 86400000);       // date by adding milliseconds  //
        System.out.println(date);
        System.out.println(futureDate);
        long milisecond= currentDate.getTime();
        Date converteddate= new Date(milisecond);           //  date by milisecond  //
        System.out.println(converteddate);
        System.out.println(futureDate.after(currentDate));  //  after() method  //
    }
}
