package com.csrTraining.polymorphism;

public class Dynampoly extends FirstClass {
    static void main() {
        Dynampoly dn=new Dynampoly();
        dn.walk();
    }

    @Override
    public String walk () {
        super.walk();
        System.out.println("We are Walking on the road");
        return "";
    }
}
