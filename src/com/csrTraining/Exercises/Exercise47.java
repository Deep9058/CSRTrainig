package com.csrTraining.Exercises;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import java.text.SimpleDateFormat;

class Exercise47 {

    public static String createCalendarDateAndParse() {

        TimeZone tz = TimeZone.getTimeZone("America/New_York");
        GregorianCalendar calendar = new GregorianCalendar(tz);
        calendar.set(2026, Calendar.DECEMBER, 25, 11, 30, 0);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        sdf.setTimeZone(tz);
        return sdf.format(calendar.getTime());
    }

    public static void main(String[] args) {
        System.out.println(createCalendarDateAndParse());
    }
}