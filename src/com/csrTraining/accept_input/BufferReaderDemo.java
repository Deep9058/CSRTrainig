package com.csrTraining.accept_input;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReaderDemo {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader bf= new BufferedReader(isr);

        System.out.println("please enter the value: ");
        String num = bf.readLine();
        int newnum=Integer.parseInt(num);
        newnum++;
        System.out.println(newnum);
        bf.close();
    }
}
