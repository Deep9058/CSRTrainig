package com.csrTraining.Interfaces;

public interface Hero {
      String name="Deep";

      String walk();          // Abstract Method    //
      String fight();         // Abstract Method    //
      default String talk()          // Default Method    //
      {
            System.out.println("interface Method.");
          return "";
      }


}
