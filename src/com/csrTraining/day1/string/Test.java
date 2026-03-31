package com.csrTraining.day1.string;

public class Test {
    static int a, b, sum;

    public static void main() {

        System.out.println("Hello.....!");
        a=5;
        b=7;
        b-=a;
        String name=new String("Deep Gangwar");
        System.out.println(name);
        name="Abhishek Puri";
        sum(a,b);
        mult();
        System.out.println(b);
        System.out.println(name);
    }
    public static  int sum(int a,int b) {
        a=5;
        b=7;
        b+=a;
        System.out.println(b);
        return b;
    }

    public static void mult()
    {
        int x,y,mul;
        x=5;
        y=2;
        mul=x*y;
        System.out.println(mul);

    }

}
