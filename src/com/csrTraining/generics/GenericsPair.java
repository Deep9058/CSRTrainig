package com.csrTraining.generics;

public class GenericsPair<T,U> {
    private T first;
    private U second;

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public U getSecond() {
        return second;
    }

    public void setSecond(U second) {
        this.second = second;
    }

    public GenericsPair(T first, U second) {
        this.first = first;
        this.second = second;
    }
}
