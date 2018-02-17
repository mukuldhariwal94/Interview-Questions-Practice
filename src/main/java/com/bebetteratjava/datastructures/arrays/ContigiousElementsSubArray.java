package com.bebetteratjava.datastructures.arrays;

import java.util.Arrays;

public class ContigiousElementsSubArray {

    public static int[] contiguosSubSequenceSubArray(int[] input){
        if (input.length <= 1){
            return input;
        }
        int minElement = 0;
        int maxElement = 0;
        int maxSubArraylength = 0;
        int startIdx = 0;
        for (int i=0;i<input.length;i++){
            minElement = input[i];
            maxElement = input[i];
            for (int j=i+1;j<input.length;j++){
                if(input[j]> maxElement){
                    maxElement = input[j];
                }
                if(input[j]<minElement){
                    minElement = input[j];
                }
                if (maxElement - minElement == j-i){
                    if (maxSubArraylength < (j-i+1)){
                        startIdx = i;
                        maxSubArraylength = j-i+1;
                    }
                }
            }
        }
        return Arrays.copyOfRange(input,startIdx,startIdx+maxSubArraylength);
    }

    public static void main (String args[]){
       int[] input = new int[]{10,12,11,94,56,32,34,36,33,35,37};
       int[] output = contiguosSubSequenceSubArray(input);
       System.out.println(Arrays.toString(output));
    }
}
