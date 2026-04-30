package com.csrTraining.Exercises;

public class Exercise25 {

    public static String funnyFoodDecision(boolean isHungry, boolean hasPizza,
                                           boolean hasBurger)
    {
        if (isHungry && hasPizza && hasBurger){
            System.out.println("I'm hungry and I have both pizza and burger! Let's feast!");

        }
        else if (isHungry && hasPizza && !hasBurger){
            System.out.println("I'm hungry and I have pizza! Let's enjoy some slices!");

        }
        else if (isHungry && !hasPizza && hasBurger){
            System.out.println("I'm hungry and I have a burger! Let's munch on it!");

        }
        else if (!isHungry) {
            System.out.println("I'm not hungry. Let's wait for the next mealtime!");

        }
        else
            System.out.println("invalid output");
        return "";
    }

    static void main() {
        funnyFoodDecision(true,true,false);
    }
}
