package com.csrTraining.execptionhandling;

import com.csrTraining.accept_input.Logging;

import java.util.logging.Logger;

public class ArrayOutOfBoundDemo {
    static void main() {

        final Logger logger= Logger.getLogger(ArrayOutOfBoundDemo.class.getName());

        try {
            int[] num={5,8,3};
            System.out.println(num[5]);
        }
        catch (ArrayIndexOutOfBoundsException ex)
        {
            String message = ex.getMessage();
           logger.warning(message);
           logger.info("please input valid index which in inside the arrayindex.");
        }
        finally {
            System.out.println("Program executed successfully.");
        }
    }
}
