package com.bebetteratjava.datastructures.arrays;

/**
 * Boyer Moore Vote Algorithm
 * //TODO last minute reads
 */
public class MajorityElementArray {


    public static int majorityElement(int[] input){

        int count = 0;
        int currElement = 0;
        for (int i=0;i<input.length;i++){
            if(count == 0){
                currElement = input[i];
                count++;
            }else{
                if(input[i] == currElement){
                    count++;
                }else {
                    count--;
                }
            }
        }

        int occurences = 0;
        for(int number:input){
            if(number == currElement){
                occurences++;
            }
        }

        if(occurences>=input.length/2){
            return currElement;
        }

        return -1;
    }

    public static void main(String args[]){
        int[] input = new int[]{4,7,4,4,7,4,4,9,4,3};
        int[] input2 = new int[]{1,2,3,4,5,6,7,8,9};
        int majorityElement = majorityElement(input2);
        System.out.println(majorityElement);
    }

}
