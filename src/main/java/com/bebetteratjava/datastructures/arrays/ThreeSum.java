package com.bebetteratjava.datastructures.arrays;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Praveen Banthia on 11/4/2017.
 */
public class ThreeSum {


    public static ArrayList<int[]> threeSum(int[] input){
        Arrays.sort(input);
        ArrayList<int[]> threeSumList = new ArrayList<int[]>();
        for(int i=0;i<input.length-3;i++){
            if(i==0 || input[i-1] != input[i] || input[i]<=0){
                int startIndex = i+1;
                int endIndex = input.length-1;
                while (startIndex<endIndex){
                    int threeSum = input[i]+input[startIndex]+input[endIndex];
                    if(threeSum == 0){
                        threeSumList.add(new int[]{input[i],input[startIndex],input[endIndex]});
                    }
                    if(threeSum>0){
                        int curEnd = input[endIndex];
                        //this will skip duplicates
                        while (curEnd == input[endIndex]) {
                            endIndex--;
                        }
                    }else{
                        int curStart =  input[startIndex];
                        while (curStart == input[startIndex]) {
                            startIndex++;
                        }
                    }
                }
            }

        }
        return threeSumList;
    }

    /*
     -4,-3,-3,-1,0,1,2,4,5

     [-4,-1,5]
     [-4,0,4]
     [-3,-1,4]
     [-3,1,2]
     [-1,0,1]

     */
    public static void main(String args[]){
        int[] input = new int[]{-1,0,1,2,-1,-4};

        for(int[] subSet:threeSum(input)){
            for(int subSetElement:subSet){
                System.out.print(subSetElement+"->");
            }
            System.out.println();
        }

    }
}
