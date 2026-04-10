package com.csrTraining.wrapperclasses;

public class Unboxing {
    static void main() {
        int num=16;
        Integer num1= Integer.valueOf(num);
        Double num2= Double.valueOf(264.524);

        //      Unboxing    //
        int num3= num1.intValue();
        System.out.println(num3);
        System.out.println(num2.doubleValue());
    }
}
