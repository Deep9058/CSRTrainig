package com.csrTraining.dateandtime.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class TimezoneDateDemo {
    static void main(String[] args) {
        SimpleDateFormat formatedDate= new SimpleDateFormat("yyyy-MMMM-dd HH:mm:ss");
        formatedDate.setTimeZone(TimeZone.getTimeZone("America/New_York"));
        String date= formatedDate.format(new Date());
        System.out.println(date);

    }
}
