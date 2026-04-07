package com.csrTraining.accept.input;

import java.io.IOException;

public class JavaBasicInput  {
    static void main() throws IOException {
        System.out.println("please enter the value: ");
       int num = System.in.read();
       num++;
        System.out.println(num);
    }
}
