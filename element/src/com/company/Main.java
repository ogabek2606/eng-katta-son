package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int[] array = {12, 21, 36, 71, 24, 85, 12, 30, 25};

        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        System.out.println(max);
    }
}
