package com.bebetteratjava.datastructures.arrays;

public class findPeakElement {

    public static int peakElements(int[] input){
        int start = 1;
        int end = input.length-1;
        while (start<=end){
            int mid = (start+end)/2;
            if(mid>0 & mid < input.length-1) {
                if (input[mid] >= input[mid + 1] && input[mid] >= input[mid - 1]) {
                    return input[mid];
                }
            }else if(mid == 0){
                if(input[mid]>=input[mid+1]){
                    return input[mid];
                }
            }else {
                if(input[mid]>=input[mid-1]){
                    return input[mid];
                }
            }
            if(input[mid]<input[mid-1]){
                end=mid-1;
            }else{
                start = mid+1;
            }
        }
        return -1;
    }

    public static void main (String args[]){
        int[] input = new int[]{1,4,3,6,7,5};
        int[] input1  = new int[]{1,2,3,4,5,6,7,8};
        int peakElement = peakElements(input1);
        System.out.println(peakElement);
    }
}
