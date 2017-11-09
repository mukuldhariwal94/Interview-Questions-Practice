package com.bebetteratjava.bitmanipualtion;

/**
 * Created by Praveen Banthia on 11/9/2017.
 */
public class GrayNumber {

    public static boolean areGreyNumbers(int a,int b){
        int noOfDiffBits = a ^ b;
        while (noOfDiffBits>0){
            if(noOfDiffBits%2 == 1 && noOfDiffBits>>1 > 0){
                return false;
            }
        }
        return true;
    }

    public static boolean areGreyNumbersFaster(int a,int b){
        int noOfDiffBits = a ^ b;
        return  (noOfDiffBits & (noOfDiffBits - 1)) == 0;
    }


    public static void main(String args[]){

    }
}
