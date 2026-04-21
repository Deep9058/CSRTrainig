package com.csrTraining.enums;
public class EnumTest {
    Day day;

    public EnumTest(Day day) {
        this.day = day;
    }

    public void print()
    {
        switch (day)
        {
            case MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY -> System.out.println("WeekDay");
            case SATURDAY,SUNDAY -> System.out.println("Weekend");
        }
    }
    static void main(String[] args) {
        EnumTest monday= new EnumTest(Day.MONDAY);
        monday.print();
        EnumTest tuesday= new EnumTest(Day.TUESDAY);
        tuesday.print();
        EnumTest thursday= new EnumTest(Day.THURSDAY);
        thursday.print();
        EnumTest saturday= new EnumTest(Day.SATURDAY);
        saturday.print();
        EnumTest sunday= new EnumTest(Day.SUNDAY);
        sunday.print();



    }
}
