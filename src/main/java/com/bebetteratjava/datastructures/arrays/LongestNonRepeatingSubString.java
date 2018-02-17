package com.bebetteratjava.datastructures.arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class LongestNonRepeatingSubString {
    public static String longestNonRepString(String input){
        int[] cache =  new int[1<<8];
        cache[input.charAt(0)]=0;
        int startIndex = 0;
        int maxLenght = 1;
        int currLength = 1;
        for (int i=1;i<input.length();i++){
            int pIndex = cache[input.charAt(i)];
            if(pIndex == -1 || i-currLength>pIndex){
                currLength++;
            }else {
                if(maxLenght<currLength){
                    maxLenght = currLength;
                    startIndex = i-maxLenght;
                }
                currLength = i - pIndex;
            }
            cache[input.charAt(i)] = i;
        }
        return input.substring(startIndex,startIndex+maxLenght);
    }

    public static void main(String args[]){
        String input = "ABCDABDEFGCABD";
        String output = longestNonRepString(input);
        System.out.println(output);
    }
}
