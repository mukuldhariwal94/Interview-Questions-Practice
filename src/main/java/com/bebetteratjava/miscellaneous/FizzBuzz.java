package com.bebetteratjava.miscellaneous;

import com.sun.javaws.exceptions.InvalidArgumentException;

/**
 * Created by Praveen Banthia on 10/29/2017.
 */
public class FizzBuzz {

    public static void printFizBuzz(int x){
        if(x <= 0) {
            throw new IllegalArgumentException("Input not in expected range please enter a number between 0 & "+Integer.MAX_VALUE);
        }

        for(int i=1;i<=x;i++){
            if(i%3==0 && i%5==0)System.out.println("FizzBuzz");
            else if(i%5 ==0) System.out.println("Buzz");
            else if(i%3 == 0) System.out.println("Fizz");
            else System.out.println(i);
        }
    }

    public static void main(String args[]){
        printFizBuzz(15);
    }
}
