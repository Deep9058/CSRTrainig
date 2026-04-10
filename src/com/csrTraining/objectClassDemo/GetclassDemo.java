package com.csrTraining.objectClassDemo;

public class GetclassDemo {

    public static void main(String[] args) {

        Person person= new Person();
        Class Name=person.getClass();
        System.out.println(Name);
        System.out.println(Name.getName());
        System.out.println(Name.getSimpleName());
        System.out.println(Name.getPackageName());
        System.out.println(person.hashCode());

    }
}
