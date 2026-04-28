package com.csrTraining.optional;

import java.util.Optional;
import java.util.Random;

public class OptionalMethods {
    static void main(String[] args) {

        Optional<String> optMsg= sayHii();
        optMsg.ifPresent(msg-> System.out.println(msg.toUpperCase()));

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
