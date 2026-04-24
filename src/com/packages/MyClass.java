package com.packages;
import com.csrTraining.Exercises.Example;

import static com.csrTraining.Exercises.Example.a;


public class MyClass {
    static int i=5 ;
    static void main() {

//        String str= new String("Hello");
//        System.out.println(str);
//        System.out.println(a);
//        System.out.println(Example.b);


        int result= i++ + ++i + i++;
        System.out.println(result);
    }
}
