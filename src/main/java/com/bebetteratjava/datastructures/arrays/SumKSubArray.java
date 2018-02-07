package com.bebetteratjava.datastructures.arrays;

import com.sun.deploy.util.ArrayUtil;
import org.omg.PortableInterceptor.INACTIVE;

import java.util.Arrays;

public class SumKSubArray {


    public static int[] minLengthSubArray(int[] input,int eSum){
        int subArrayStart = -1;
        int subArrayEnd = -1;
        int minLength = Integer.MAX_VALUE;

        for(int i=0;i<input.length;i++){
            int sum = input[i];
            for (int j=i+1;j<input.length;j++){
                sum += input[j];
                if (sum > eSum){
                    break;
                }

                if(sum == eSum){
                    if(minLength> (j - i + 1)) {
                        subArrayStart = i;
                        subArrayEnd = j;
                        minLength = subArrayEnd - subArrayStart + 1;
                    }
                    break;
                }
            }
        }

        //TODO note this in readme
        return Arrays.copyOfRange(input,subArrayStart,subArrayEnd+1);
    }

    public static void main(String args[]){
        int[] input = new int[]{2,3,1,1,-1,6,4,3,8};
        int k = 7;
        int[] result = minLengthSubArray(input,k);
        //TODO note this in readme
        System.out.println(Arrays.toString(result));
    }
}
