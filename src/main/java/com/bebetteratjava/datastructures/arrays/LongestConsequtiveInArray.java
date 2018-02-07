package com.bebetteratjava.datastructures.arrays;

import java.util.HashSet;
import java.util.LinkedList;

public class LongestConsequtiveInArray {


    public static int[] getLongestConsequtive(int[] input){
        HashSet<Integer> cache = new HashSet<Integer>();

        int currentNum = 0;
        int currLength = Integer.MIN_VALUE;
        int maxLength =  Integer.MIN_VALUE;
        int maxConsequtiveEnd = Integer.MIN_VALUE;

        for(int i=0;i<input.length;i++){
            cache.add(input[i]);
        }

        for(int i=0;i<input.length;i++){
            if(cache.contains(input[i]-1)){
                continue;
            }else{
                currentNum = input[i];
                currLength = 1;
                while (cache.contains(currentNum +1)){
                    currLength++;
                    currentNum++;
                }
                if(currLength >  maxLength){
                    maxLength = currLength;
                    maxConsequtiveEnd = currentNum ;
                }
            }

        }

        int[] result = new int[maxLength];

        int currIndex = 0;
        for (int i= maxConsequtiveEnd;i>maxConsequtiveEnd-maxLength;i--){
            result[currIndex] = i;
            currIndex++;
        }

        return result;
    }



    public static void main(String args[]){
        int[] input1 = new int[]{1,3,8,14,4,10,2,11};
        int[] longestSeq = getLongestConsequtive(input1);
        for (int num:longestSeq){
            System.out.println(num);
        }
    }
}
