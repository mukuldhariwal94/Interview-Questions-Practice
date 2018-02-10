package com.bebetteratjava.datastructures.arrays;

import java.util.Arrays;

public class SelectionSort {

    public static int[] selectionSort(int[] input){

        for (int i=0;i<input.length-1;i++){
            int minIndex = i;
            for(int j=i+1;j<input.length;j++){
                if(input[minIndex] > input[j]){
                    minIndex = j;
                }
            }
            if(minIndex != i){
                int temp = input[i];
                input[i] = input[minIndex];
                input[minIndex] = temp;
            }
        }

        return input;
    }

    public static void main(String args[]){
        int[] input = new int[]{12, 35, 87, 26, 9, 28, 7};
        selectionSort(input);
        System.out.println(Arrays.toString(input));
    }
}
