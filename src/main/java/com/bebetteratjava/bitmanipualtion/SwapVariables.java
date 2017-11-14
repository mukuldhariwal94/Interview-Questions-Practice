package com.bebetteratjava.bitmanipualtion;

/**
 * Created by Praveen Banthia on 11/12/2017.
 */
public class SwapVariables {

    private static void swapNumbersWithXOR(int a, int b){
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("Swapped variables are:"+ a+"|"+ b);
    }

    public static void main(String args[]){
        swapNumbersWithXOR(10,12);
    }
}
