package com.csrTraining.collections;

import org.jetbrains.annotations.NotNull;

public class Students implements Comparable<Students>{
    String name;
    int rollno;
    int marks;

    public Students(String name, int rollno, int marks) {
        this.name = name;
        this.rollno = rollno;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", rollno=" + rollno +
                ", marks=" + marks +
                '}';
    }

    @Override
    public int compareTo(Students thatStudent) {
        int marksComparison = Integer.compare(this.marks,thatStudent.marks);

        if (marksComparison==0)
        {
            return Integer.compare(this.rollno, thatStudent.rollno);
        }
        return marksComparison;
    }
}
