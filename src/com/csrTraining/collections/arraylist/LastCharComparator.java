package com.csrTraining.collections.arraylist;

import java.util.Comparator;

public class LastCharComparator implements Comparator<String> {
    static void main() {

    }

    @Override
    public int compare(String o1, String o2) {
        char lastchar1=o1.charAt(0);
        char lastchar2=o2.charAt(0);

        return Character.compare(lastchar1,lastchar2);
    }
}
