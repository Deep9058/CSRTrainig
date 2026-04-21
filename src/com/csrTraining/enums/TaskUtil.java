package com.csrTraining.enums;

public class TaskUtil {

    public static int EstimateCompileTime(PriorityEnum priority)
    {
        return switch (priority)
        {
            case LOW-> 7;
            case MEDIUM-> 5;
            case HIGH-> 3;
            case URGENT-> 1;
        };
    }
}
