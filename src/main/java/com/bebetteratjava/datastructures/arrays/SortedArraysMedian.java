package com.bebetteratjava.datastructures.arrays;

public class SortedArraysMedian {

    public static double medianOfSorted(int[] input1,int[] input2){
        int totalmid = (input1.length+input2.length+1)/2;
        int mid1 = input1.length/2;
        int mid2 = totalmid - mid1;
        while (mid1>=0 && mid1<input1.length){
            if(input1[mid1-1]<input2[mid2] && input2[mid2-1]<input2[mid2]){
                if( (input1.length+input2.length) %2 == 0){
                    return Math.max(input1[mid1-1],input2[mid2-1]);
                }else{
                    double median = ( Math.max(input1[mid1-1],input2[mid2-1])+Math.min(input1[mid1],input2[mid2]))/2;
                    return median;
                }
            }
            if(input1[mid1-1]> input2[mid2]){
                mid1--;
                mid2++;
            }else{
                mid1++;
                mid2--;
            }
        }
        return Double.MIN_VALUE;
    }

    public static void main(String args[]){
        int[] input1 = new int[]{3,7,12,15,18,21,25};
        int[] input2 = new int[]{4,6,8,10,11,18};
        double result = medianOfSorted(input1,input2);
        System.out.println(result);
    }
}
