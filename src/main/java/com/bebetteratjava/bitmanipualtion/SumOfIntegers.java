package com.bebetteratjava.bitmanipualtion;

/**
 * Created by Praveen Banthia on 11/14/2017.
 */
public class SumOfIntegers {


    public static int sumOfInts(int a,int b){
        if(b == 0){
            return a;
        }
        int partialSum = a ^ b;
        int carryOver = a & b;
        carryOver = carryOver << 1;
        return sumOfInts(partialSum,carryOver);
    }

    public static int nonRecursiveSumOfInts(int a,int b){
        int partialSum = a ^ b;
        int carryover = (a & b)<<1;
        while (carryover > 0){
            int tempCarryOver = (partialSum & carryover) << 1;
            partialSum = partialSum ^ carryover;
            carryover = tempCarryOver;
        }
        return partialSum;
    }

    public static void main(String args[]){
//        int sum = sumOfInts(13,15);
        int sum = nonRecursiveSumOfInts(4,5);
        System.out.println(sum);
    }
}
