package com.csrTraining.accept_input;

import com.packages.MyClass;

import java.util.logging.Logger;

public class Logging {
    private static final Logger logger= Logger.getLogger(Logging.class.getName());
    static void main() {

        logger.info("Application Started. ");
        logger.severe("This is severe error message. ");
        logger.warning("this is logger warning. ");
    }
}
