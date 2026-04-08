package com.csrTraining.execptionhandling;

import com.sun.jdi.event.ExceptionEvent;

import javax.xml.transform.Source;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Logger;

public class ExceptionDemo {
    static void main() {
        final Logger logger= Logger.getLogger(ArrayOutOfBoundDemo.class.getName());
        try {
            Scanner sc= new Scanner(System.in);
            System.out.println("Enter a number: ");
            int number =sc.nextInt();
            System.out.println(++number);
            sc.close();
        }
        catch (InputMismatchException e)
        {
            logger.info("Input Mismatch. Please input only numeric values. ");
        }
        finally {
            System.out.println("Program executed successfully.");
        }
    }
}
