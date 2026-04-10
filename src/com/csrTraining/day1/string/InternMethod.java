package com.csrTraining.day1.string;

public class InternMethod {


    static void main() {
        String str1="Deep";
        String str2=str1.intern();
        System.out.println(str2);
        System.out.println(str1==str2);
    }
}
