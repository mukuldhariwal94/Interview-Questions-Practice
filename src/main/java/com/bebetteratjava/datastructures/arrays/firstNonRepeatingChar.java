package com.bebetteratjava.datastructures.arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class firstNonRepeatingChar {

    public static char firstNonRepeatingOptimized(String input){
        int[] cache = new int[1<<8];
        Arrays.fill(cache,-1);
        for (int i=0;i<input.length();i++){
            if (cache[input.charAt(i)] == -1){
                cache[input.charAt(i)] = i;
            }else{
                cache[input.charAt(i)] = -2;
            }
        }
        int minIndex = Integer.MAX_VALUE;
        for (int nonRepIndex :cache ){
            if (nonRepIndex> 0 && minIndex>nonRepIndex){
                minIndex = nonRepIndex;
            }
        }

        return input.charAt(minIndex);
    }

    public static Character firstNonRepeatingLinear(String input){
        int[] cache = new int[1<<8];
        for (int i=0;i<input.length();i++){
            cache[input.charAt(i)]++;
        }

        for (char letter:input.toCharArray()){
            if(cache[letter] == 1){
                return letter;
            }
        }
        return null;
    }

    public static void main(String args[]){
        String input = "ADBCGHIEFKJLADTVDERFSWVGHQWCNOPENSMSJWIERTFB";
//        char output = firstNonRepeatingOptimized(input);
        char output2 = firstNonRepeatingLinear(input);
        System.out.println(output2);
    }
}
