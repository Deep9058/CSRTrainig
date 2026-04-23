package com.csrTraining.lambda;

public class AnonymousClassDemo {
    static void main(String[] args) {
        Hello hello=new Hello() {
            @Override
            public void sayHello() {
                System.out.println("Anonymous");
            }
        };
        process(hello);
        process(new Hello() {
            @Override
            public void sayHello() {
                System.out.println("Anonymous1");
            }
        });
    }

    public static void process(Hello h)
    {
        h.sayHello();
    }
}
