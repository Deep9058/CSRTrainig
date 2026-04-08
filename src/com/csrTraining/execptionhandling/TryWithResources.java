package com.csrTraining.execptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Logger;

public class TryWithResources {
    static final Logger logger= Logger.getLogger(TryWithResources.class.getName());
    static void main() {

        //      TryWithResources Block      //
        try (Scanner sc= new Scanner(System.in);){
            System.out.println("Enter a number: ");
            int number =sc.nextInt();
            System.out.println(++number);
        }
        catch (InputMismatchException e)
        {
            String mes=e.getMessage();
            logger.warning("Please Enter Numeric Values only");
        }
        finally {
            System.out.println("Program executed successfully.");
        }
    }
}
