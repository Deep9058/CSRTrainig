package com.csrTraining.lambda;

public class LambdaExpressionDemo {
    static void main(String[] args) {
        Hello hello= ()-> System.out.println("Hello");      //    Approach 1   //
        Hello hello1= ()-> System.out.println("Hello World");
        process(hello);
        process(hello1);
        process(()-> System.out.println("Hello,Kese ho"));     //    Approach 1   //


        ArithmeticOperations addition=(a,b)->
        {
            int result=a+b;
            return result;
        };
        ArithmeticOperations subtraction=(a,b)->
        {
            if (a>b)
            {
                int result=a-b;
                return result;
            }
            else {
                int result = b-a;
                return result;
            }
        };
        ArithmeticOperations multiply=(a,b)->
        {
            int result=a*b;
            return result;
        };
        ArithmeticOperations divide=(a,b)->
        {
            if (a>b)
            {
                int result=a/b;
                return result;
            }
            else {
                int result = b/a;
                return result;
            }
        };

        System.out.println(subtraction.operation(5,8));

    }
    public static void process(Hello h)
    {
        h.sayHello();
    }

}
