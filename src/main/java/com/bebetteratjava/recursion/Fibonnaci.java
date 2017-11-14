package com.bebetteratjava.recursion;

/**
 * Created by Praveen Banthia on 11/14/2017.
 */
public class Fibonnaci {


    public static int fibonacciOfNum(int n){
        if(n< 0){
            throw new IllegalArgumentException("Not a valid number for fibonacci");
        }
        if(n<2){
            return  n;
        }
        //n+1 to cache from 0 to n
        int[] cache = new int[n+1];
        for(int i=0;i<=n;i++){
            cache[i] = -1;
        }
        cache[0] = 0;
        cache [1] = 1;
        return fibonacciOfNum(n,cache);
    }

    private static int fibonacciOfNum(int n, int[] cache) {
        if(cache[n] ==-1){
            cache[n] = fibonacciOfNum(n-1,cache)+fibonacciOfNum(n-2,cache);
        }
        return cache[n];
    }

    public static void main(String args[]){
        int result = fibonacciOfNum(8);
        System.out.println(result);
    }
}
