package com.csrTraining.abstraction;

public abstract class Subject {
    public static final int MIN_MARKS=0;
    public int marks;

    public int totalmarks()
    {
        System.out.println("Total Marks is : "+ 100);
        return 100;
    }
    public int minMarks()
    {
        System.out.println("Minimum Marks is : "+ MIN_MARKS);
        return 0;
    }

    public abstract void teach();

}
