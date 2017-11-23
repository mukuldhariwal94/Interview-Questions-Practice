package com.bebetteratjava.miscellaneous;

/**
 * Created by Praveen Banthia on 11/23/2017.
 */
public class TwoMissingNumber
{

    public static int oneMissing(int[] input){
        int totXor = 0;
        int arrXor = 0;

        // + 1 since the input is missing one element
        for(int i=1;i<=input.length+1;i++){
            totXor ^= 1;
        }

        for(int i=0;i<input.length;i++){
            arrXor ^= input[i];
        }

        return totXor ^ arrXor;

    }


    public static int[] twoMissing(int[] input){
        long idealSum = 0;
        long inputSum = 0;
        long missingSum = 0;

        for(int i=1;i<=input.length+2;i++){
            idealSum += i;
        }

        for(int i:input){
            inputSum += i;
        }

        missingSum = idealSum - inputSum;

        int subIdealXOR = 0;
        int subInputXOR = 0;
        for(int i=1;i<missingSum/2;i++){
            subIdealXOR ^= i;
        }

        for(int i=0;i<input.length;i++){
            if(input[i]>= (missingSum/2)){
                break;
            }
            subInputXOR ^= input[i];
        }



        int[] output = new int[2];
        output[0] = subIdealXOR ^ subInputXOR;
        output[1] = (int)missingSum-output[0];
        return output;
    }
    public static void main(String args[]){
        int[] input = new int[]{1,2,3,5};
        int[] output = twoMissing(input);
        for(int i:output){
            System.out.println(i);
        }
    }
}
