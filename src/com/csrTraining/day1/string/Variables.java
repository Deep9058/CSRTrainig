package com.csrTraining.day1.string;

public class Variables {
    int x,y,sum;
    static int c=5,d=2,mul;

    public static void main(String[] args)
    {

        System.out.println("Addition using instance variable: ");
        sum();
        System.out.println("Subtraction using Local variable: ");
        Variables var= new Variables();
        var.sum2();
        System.out.println("Multiply using Static variable: ");
        multi();
    }

    public static void sum()
    {
        Variables v = new   Variables();
        v.x=50;
        v.y=2;
        v.sum=v.x+v.y;
        System.out.println(v.sum);

    }

    public void sum2()
    {
        int a,b;
        a=100;
        b=50;
        sum=a-b;
        System.out.println(sum);
    }

    public static void multi()
    {
        c=5;
        d=4;
        mul=c*d;
        System.out.println(mul);
    }

}

