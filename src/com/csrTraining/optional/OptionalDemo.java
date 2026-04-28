package com.csrTraining.optional;

import java.util.Optional;
import java.util.Random;

public class OptionalDemo {
    static void main(String[] args) {

        Optional<String> optMsg= sayHii();
        if (optMsg.isPresent()) {
//            System.out.println(optMsg.map(world -> world.toUpperCase()));
            System.out.println(optMsg.get().toUpperCase());
        }


        String msg= sayHello();
        if(msg!=null) {
            System.out.println(msg.toUpperCase());
        }

    }

    public static String sayHello()
    {
        int num = new Random().nextInt();
        System.out.println(num);
        if (num%2==0)
        {
            return "Hello World";
        }
        else
            return null;
    }
    public static Optional<String> sayHii()
    {
        int num = new Random().nextInt();
        System.out.println(num);
        String msg=null;
        if (num%2==0)
        {
            msg="Hello World";
        }
       return Optional.ofNullable(msg);
    }

}

