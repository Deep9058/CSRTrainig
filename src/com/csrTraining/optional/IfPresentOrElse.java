package com.csrTraining.optional;

import java.util.Optional;

import static com.csrTraining.optional.OptionalMethods.*;

public class IfPresentOrElse {
    static void main(String[] args) {
        Optional<String> message = sayHii();
//        message.ifPresentOrElse(msg-> System.out.println(msg.toUpperCase()),
//                ()-> System.out.println("value is absent"));

//        String msg2= message.orElse("value is absent");
//        System.out.println("OrElse() Method: " +msg2);

        String msg3 = message.orElseGet(()->"Value is absent. ");
        System.out.println("orElseGet() method: "+ msg3);

    }


}
