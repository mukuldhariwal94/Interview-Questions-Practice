package com.bebetteratjava.datastructures.arrays;

import java.util.HashMap;

/**
 * Created by Praveen Banthia on 11/4/2017.
 */
public class ZeroSumSubArray {


    public static int[] doesZeroSubArrayExist(int[] n){

        HashMap<Integer,Integer> sumAtIndex = new HashMap<Integer, Integer>();
        int sum = 0;
        int[] subArray = null;
        for(int i=0;i<=n.length;i++){
            if(!sumAtIndex.containsKey(sum)){
                sumAtIndex.put(sum,i);
                sum += n[i];
            }else{
                int startIndex = sumAtIndex.get(sum);
                int subArraySize = i-startIndex;
                subArray = new int[subArraySize];
                for(int j=0;j<subArraySize;j++){
                    subArray[j] = n[startIndex];
                    startIndex++;
                }
                break;
            }

        }
        return subArray;
    }

    /*
       1,2,-5,1,2,-1
     */
    public static void main(String args[]){
        int[] input = new int[]{1,2,-5,1,2,-1};
        for(int arrayElements:doesZeroSubArrayExist(input)){
            System.out.print(arrayElements+"->");
        }
    }
}
