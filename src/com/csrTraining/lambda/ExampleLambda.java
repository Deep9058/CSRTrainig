package com.csrTraining.lambda;
import java.util.function.Predicate;

import static com.csrTraining.Exercises.Example.a;

public class ExampleLambda {
    static void main(String[] args) {
        Example example= (a,b)->{
            int result=a+b;
            System.out.println("Addition of "+ a +" and "+b +" is: "+result);
        };
        example.add(5,8);
        ExampleLambda obj= new ExampleLambda();
        obj.Square(5);
        obj.Square(7);
    }

    void Square(int i)
    {
        System.out.println("Square of "+i+" is: "+i*i);
    }
}
