package com.bebetteratjava.datastructures.arrays;

import java.util.Arrays;

public class RotateArray {

    public static int[] rotateArray(int[] input,int noOfRotations){
        if(noOfRotations < 0){
            throw new IllegalArgumentException("Number cannot be negative");
        }

        if(noOfRotations > input.length){
            noOfRotations = noOfRotations%input.length;
        }

        reverseArray(input,0,noOfRotations-1);
        reverseArray(input,noOfRotations,input.length-1);
        reverseArray(input,0,input.length-1);

        return input;
    }

    private static void reverseArray(int[] input, int start, int end) {
        while (start<end){
            int temp = input[start];
            input[start] = input[end];
            input [end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String args[]){
        int[] input = new int[]{1,2,3,4,5};
        int[] result = rotateArray(input,1);
        System.out.println(Arrays.toString(result));
    }
}
