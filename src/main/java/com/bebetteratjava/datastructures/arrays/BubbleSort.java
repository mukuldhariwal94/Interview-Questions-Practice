package com.bebetteratjava.datastructures.arrays;

import java.util.Arrays;

public class BubbleSort {

    //TODO optimization to stop when an iteration goes by when nothing is swapped.
    public static int[] bubbleSort(int[] input){
        int chkEnd = input.length-1;

        for (int i=input.length-1;i>=0;i--){
            for (int j=0;j<i;j++){
                if (input[j]>input[j+1]){
                    int temp = input[j];
                    input[j] = input[j+1];
                    input[j+1] = temp;
                }
            }
        }
        return input;
    }

    public static void main(String args[]){
        int[] input = new int[]{12, 35, 87, 26, 9, 28, 7};
        bubbleSort(input);
        System.out.println(Arrays.toString(input));
    }
}
