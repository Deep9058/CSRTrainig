package com.csrTraining.enums;

public class TaskPriorityConstantDemo {
    static void main(String[] args) {
        System.out.println(TaskUtil.EstimateCompileTime(PriorityEnum.LOW));
        System.out.println(TaskUtil.EstimateCompileTime(PriorityEnum.MEDIUM));
        System.out.println(TaskUtil.EstimateCompileTime(PriorityEnum.HIGH));
        System.out.println(TaskUtil.EstimateCompileTime(PriorityEnum.URGENT));
        System.out.println(PriorityEnum.URGENT);
        System.out.println(PriorityEnum.MEDIUM.ordinal());
        boolean value= PriorityEnum.LOW==PriorityEnum.valueOf("LOW");
        System.out.println(value);
        System.out.println(Day.THURSDAY.value);

    }
}
