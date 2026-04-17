package com.csrTraining.collections.linkedlist;

import com.csrTraining.collections.linkedlist.model.Developer;
import com.csrTraining.collections.linkedlist.model.Employee;

public class CovarianceDemo {
    static void main(String[] args) {
        Employee[] employees = {new Employee("Deep",23,7078397320l), new Employee("Ayush",18,9548556023l)};
        printArray(employees);
        Developer[] developer = {new Developer("Deepak",28,7894561235l), new Developer("Ayushi",38,7017873706l)};
        printArray(developer);


    }

    public static void printArray(Employee[] employees)
    {
        for (Employee emp: employees)
            System.out.println(emp);
    }
}
