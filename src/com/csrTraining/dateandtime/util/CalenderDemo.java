package com.csrTraining.dateandtime.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalenderDemo {
    static void main(String[] args) {
        Calendar calendar= Calendar.getInstance();
        GregorianCalendar gregorianCalendar= new GregorianCalendar();
        GregorianCalendar future_date = new GregorianCalendar(2026,25,7,12,35,45);
        System.out.println(calendar.getTime());
        System.out.println(future_date.getTime());
        System.out.println(gregorianCalendar.getActualMaximum(3));
        System.out.println(future_date.get(Calendar.DAY_OF_MONTH));
        System.out.println(future_date.get(Calendar.MONTH)+1);
        System.out.println(future_date.get(Calendar.YEAR));
        future_date.set(Calendar.YEAR,2025);
        System.out.println(future_date.get(Calendar.YEAR));

        SimpleDateFormat dateFormat= new SimpleDateFormat("dd-MMMM-yyyy HH:mm:ss");
        String formatedDate= dateFormat.format(gregorianCalendar.getTime());
        System.out.println(formatedDate);

        gregorianCalendar.add(Calendar.HOUR,2);
        String formatedDate2 = dateFormat.format(gregorianCalendar.getTime());
        System.out.println(formatedDate2);

        System.out.println(gregorianCalendar.isLeapYear(2028));
        System.out.println(gregorianCalendar.isLeapYear(2048));

    }
}
