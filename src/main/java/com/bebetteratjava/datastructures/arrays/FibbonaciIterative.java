package com.bebetteratjava.datastructures.arrays;

public class FibbonaciIterative {
    public static int fibbonaciOfNumber(int input){

        if(input<2){
            return input;
        }
        int firstNumInSum = 0;
        int secondNumInSum = 1;
        int finalSum = firstNumInSum+secondNumInSum;
        for (int i=2;i<=input;i++){
            finalSum = firstNumInSum + secondNumInSum;
            firstNumInSum = secondNumInSum;
            secondNumInSum = finalSum;
        }
        return finalSum;
    }

    public static void main(String args[]){
        int result = fibbonaciOfNumber(6);
        System.out.println(result);
    }
}
