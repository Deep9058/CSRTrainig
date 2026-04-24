package com.csrTraining.lambda.predefineMethods;

import java.time.LocalDate;
import java.util.function.Supplier;

public class SupplierDemo {
    static void main(String[] args) {
        Supplier<String> supplier=()-> String.valueOf(LocalDate.now().getDayOfWeek());
        System.out.println(supplier.get());
    }
}
