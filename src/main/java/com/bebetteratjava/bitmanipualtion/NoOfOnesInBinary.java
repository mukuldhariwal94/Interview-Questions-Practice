package com.bebetteratjava.bitmanipualtion;

/**
 * Created by Praveen Banthia on 10/30/2017.
 */
public class NoOfOnesInBinary {

    public static int noOfOnes(int n){

        int countOfOnes = 0;
        while (n > 0){
            if((n & 1) == 1){
                countOfOnes++;
            }
            n = n >> 1;
        }
        return  countOfOnes;
    }

    public static void main(String args[]){
       int anwsOfOnes =  noOfOnes(15);
        System.out.println(anwsOfOnes);
    }
}
