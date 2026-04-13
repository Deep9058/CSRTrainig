package com.csrTraining.collections.arraylist;

import java.util.ArrayList;
import java.util.Comparator;

public class Countries {
    static void main() {
        ArrayList<String> countries = new ArrayList<>();
        countries.add("India");
        countries.add("USA");
        countries.add("Japan");
        countries.add("China");
        countries.add("Koria");
        countries.add("Canada");
        System.out.println(countries);
        System.out.println();


        countries.sort(Comparator.naturalOrder());
        System.out.println("In ascending order: ");
        System.out.println(countries);
        System.out.println();


        countries.sort(Comparator.reverseOrder());
        System.out.println("In descending order: ");
        System.out.println(countries);



        ArrayList<String> names = new ArrayList<>();
        names.add("Deep");
        names.add("Ayush");
        names.add("Abhishek");
        names.add("Rohit");
        names.add("Nitin");
        names.add("Gaurav");
        names.sort(new LastCharComparator().reversed());
        System.out.println(names);
    }
}
