package com.csrTraining.dateandtime.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormattingDemo {
    static void main(String[] args) throws ParseException {
        Date currentDate= new Date();
        System.out.println(currentDate);        //  Wed Apr 22 14:07:58 IST 2026    //
        SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");   // FormattedDate    //
        System.out.println(dateFormat.format(currentDate));

        Date currentDate1= new Date();
        SimpleDateFormat dateFormat1= new SimpleDateFormat("dd-MM-yyyy");   // FormattedDate    //
        System.out.println(dateFormat1.format(currentDate));

        String dateString= "2026-04-22 14:16:32";
        SimpleDateFormat dateFormat2= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date parsedDate= dateFormat.parse(dateString);
        System.out.println(parsedDate);

    }
}
