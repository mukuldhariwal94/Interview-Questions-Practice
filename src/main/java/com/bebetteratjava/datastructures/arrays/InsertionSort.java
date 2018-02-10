package com.bebetteratjava.datastructures.arrays;

import java.util.Arrays;

public class InsertionSort {

    public static int[] insertionSort(int[] input){

        for (int i=0;i<input.length;i++){
            for (int j=i;j>0;j--){
                if (input[j]<input[j-1]){
                    int temp = input[j];
                    input[j] = input[j-1];
                    input[j-1] = temp;
                }
            }
        }
        return input;
    }

    public static void main(String args[]){
        int[] input = new int[]{12, 35, 87, 26, 9, 28, 7};
        insertionSort(input);
        System.out.println(Arrays.toString(input));
    }
}
