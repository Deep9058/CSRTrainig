package com.csrTraining.wrapperclasses;

public class CatchingUsingValueOf {
    static void main() {

        //----------Using Constructor----------//
        Integer num1= new Integer(50);
        Integer num2= new Integer(50);
        System.out.println(num1==num2);
        System.out.println(num1.equals(num2));

        //----------Using ValueOf() Function----------//
        Integer num3= Integer.valueOf(45);
        Integer num4= Integer.valueOf(45);
        System.out.println(num3==num4);
        System.out.println(num3.equals(num4));

    }
}
