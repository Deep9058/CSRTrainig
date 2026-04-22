package com.csrTraining.dateandtime.util;

import java.util.TimeZone;

public class TimezoneIDList {
    static void main(String[] args) {
        String[] timezonesID= TimeZone.getAvailableIDs();

        for (String id:timezonesID)
        {
            System.out.println(id);
        }

    }
}
