package com.csrTraining.Exercises;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Exercise46 {

    public static String createDateAndParse() {

        Date date = new Date(126, 11, 25, 0, 0, 0);

        SimpleDateFormat sdf = new SimpleDateFormat("yy-MMMM-dd HH:mm:ss");

        return sdf.format(date);
    }

    public static void main(String[] args) {
        System.out.println(createDateAndParse());
    }
}
