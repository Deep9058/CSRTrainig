package com.csrTraining.Exercises;

public class Exercise41 {

    public static <T> T[] swap(T[] array, int index1, int index2) {
        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
        return array;
    }

    public static void main(String[] args) {

        Integer[] arr = {1, 2, 3};

        swap(arr, 0, 1);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
