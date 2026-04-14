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


//    static void main() {
////        String str= "Deep";
////        int age=23;
////        String classes ="Fifth";
////        boolean isContains = str.startsWith("Hello");
////        System.out.printf("Age of %s is %d and studying in class %s. ",str,age,classes);
//
//
//        StringBuffer sb= new StringBuffer("Hello Deep");
//        String str3= "njbv guver";
//        sb.setLength(2);
//        System.out.println(sb);
//        StringBuffer str4= sb.reverse();
//        System.out.println(str4);
//}
}
