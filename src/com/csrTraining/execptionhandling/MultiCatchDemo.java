package com.csrTraining.execptionhandling;

import java.util.logging.Logger;

public class MultiCatchDemo {
    static final Logger logger= Logger.getLogger(ArrayOutOfBoundDemo.class.getName());
    public static void main() {
        String input=null;
        try {
            input="Deep";
            System.out.println(input.toUpperCase());
            String inp=input.substring(1,4);
            logger.info(inp);
            logger.info(inp.substring(1,5));
        }

        //      Catch Block 1     //
        catch (NullPointerException ex) {
            String message= ex.getMessage();
            logger.warning(message);
            logger.severe("please check your data it is null. ");
        }

        //      Catch Block 2 [multiple exceptions handled in a single catch block.]     //
        catch (StringIndexOutOfBoundsException | ArrayIndexOutOfBoundsException e) {
            String message= e.getMessage();
            logger.warning(message);
            logger.severe("Please input a valid range within limits.");
        }

        //      Catch Block 3  [Default common exception handling block.]     //
        catch (Exception exe) {
            String message= exe.getMessage();
            logger.warning(message);
        }
        finally {
            System.out.println("Program executed successfully.");
        }
    }
}
