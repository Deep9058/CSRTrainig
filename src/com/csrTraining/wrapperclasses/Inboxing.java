package com.csrTraining.wrapperclasses;

public class Inboxing {
    static void main() {
        int num=16;
        Integer num1= new Integer(num);
        Double num2= new Double(5.254);
        Integer num4= Integer.parseInt("264");

        Integer num3= Integer.valueOf(num);
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num2.getClass());
        System.out.println(num4);

    }
}
