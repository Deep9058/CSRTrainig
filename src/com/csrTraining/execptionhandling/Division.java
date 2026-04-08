package com.csrTraining.execptionhandling;
import java.util.logging.Logger;

public class Division {

    Logger logger = Logger.getLogger(Division.class.getName());

    public static void main(String[] args) {
    }

    public void divide(String num1, String num2)
            throws NumberFormatException,ArithmeticException {

        int n1 = Integer.parseInt(num1);
        int n2 = Integer.parseInt(num2);

        double result = (double) n1 / n2;

        logger.info("Result: " + result);

    }
}