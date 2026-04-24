package com.csrTraining.Exercises;

import java.time.LocalDate;
import java.util.function.Supplier;

public class Exercise56 {
    public static String getCurrentDayNameSupplier() {
        Supplier<String> supplier=()-> String.valueOf(LocalDate.now().getDayOfWeek());
        System.out.println(supplier.get());

        return "";
    }

    static void main(String[] args) {
        getCurrentDayNameSupplier();
    }
}
