package com.bebetteratjava.datastructures.arrays;

public class RotatedSortedPivot {


    public static int pivotElement(int[] input){
        int result=Integer.MAX_VALUE;
        int start=0;
        int end = input.length - 1 ;
        while (start<=end){
            int mid = (start+end)/2;
            if(input[mid]<input[mid+1] && input[mid]< input[mid -1]){
                return input[mid];
            }
            if(input[start]>input[end]){
                start = mid+1;
            }else {
                end = mid - 1;
            }
        }
        return result;
    }

    public static void main(String args[]){
        int[] input = new int[]{4,5,6,7,1,2,3};
        int result = pivotElement(input);
        System.out.println(result);
    }
}
