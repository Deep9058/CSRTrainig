package com.csrTraining.objectClassDemo;

public class HashcodeDemo {
    static void main(String[] args) throws CloneNotSupportedException {
        Person p1= new Person("Deep",23,'M',99062144);
        Person p2= (Person)p1.clone();
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        System.out.println(p1.equals(p2));
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p1==p2);
        System.out.println(p1.getName()==p2.getName());
    }
}
