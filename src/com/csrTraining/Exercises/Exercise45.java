package com.csrTraining.Exercises;
import static com.csrTraining.Exercises.VehicleType.*;
public class Exercise45 {

    public static double calculateToll(VehicleType type) {
        switch (type) {
            case CAR -> {
                return 5.0;
            }
            case MOTORCYCLE -> {
                return 3.0;
            }
            case BUS -> {
                return 10.0;
            }
            case TRUCK -> {
                return 15.0;
            }
        }
        return 0.0; // fallback (optional)
    }

    public static void main(String[] args) {
        System.out.println(calculateToll(CAR));
        System.out.println(calculateToll(MOTORCYCLE));
        System.out.println(calculateToll(BUS));
        System.out.println(calculateToll(TRUCK));
    }

}