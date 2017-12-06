package com.bebetteratjava.miscellaneous;

/**
 * Created by Praveen Banthia on 12/3/2017.
 */
public class RomanNumerals {

    private static final int[] values =           {1000,900,500,400,100,90,50,40,10,9,5,4,1};

    private static final String[] romanNumerals =  {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

    private static String integerToRomans(int number){
         if(number<0 || number > 3999){
             throw new IllegalArgumentException("Invalid number range");
         }
         StringBuilder sb = new StringBuilder();
         int i = 0;
         while (number > 0){
             if (number - values[i] > 0){
                 sb.append(romanNumerals[i]);
                 number = number - values[i];
             }else{
                 i++;
             }
         }
         return sb.toString();
    }

}
