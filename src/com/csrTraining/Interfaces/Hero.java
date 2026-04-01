package com.csrTraining.Interfaces;

public interface Hero {
      String name="Deep";

      String walk();          // Abstract Method    //
      String fight();         // Abstract Method    //
      default String talk(String name)          // Default Method    //
      {
            System.out.println(name +" is talking.");
          return "";
      }


}
