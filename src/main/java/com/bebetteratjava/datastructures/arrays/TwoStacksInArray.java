package com.bebetteratjava.datastructures.arrays;

/**
 * Created by Praveen Banthia on 11/3/2017.
 */
public class TwoStacksInArray {

    private int[] array2Stacks = new int[3];

    private int n1Index = -1;
    private int n2Index = array2Stacks.length;

    public boolean pushTo2StacksInArray(int data,int stack){
        if(stack != 1 && stack != 2){
            throw new IllegalArgumentException("Invalid Stack Number");
        }else if(stack == 1){
            n1Index++;
        }else{
            n2Index--;
        }
        if(n1Index >= n2Index){
            throw new IllegalStateException("No space in array to push data in");
        }
        if(stack == 1){
            array2Stacks[n1Index] = data;
            return true;
        }else{
            array2Stacks[n2Index] =  data;
            return true;
        }
    }

    public int popFrom2StacksInArray(int stack){
        if(stack != 1 && stack != 2){
            throw new IllegalArgumentException("Invalid Stack Number");
        }
        if(stack == 1 && n1Index < 0){
            throw new IllegalStateException("Stack is empty nothing to pop");
        }else if(stack == 2 && n2Index >= array2Stacks.length){
            throw new IllegalStateException("Stack is empty nothing to pop");
        }

        int data;
        if(stack == 1){
            data = array2Stacks[n1Index];
            n1Index--;
        }else{
            data = array2Stacks[n2Index];
            n2Index++;
        }
        return data;
    }

    public static void main(String args[]){
//        NStacks nStacks = new NStacks();
//        nStacks.pushTo2StacksInArray(1,2);
//        nStacks.pushTo2StacksInArray(2,2);
////        nStacks.pushTo2StacksInArray(3,2);
////        nStacks.pushTo2StacksInArray(4,1);
//        nStacks.pushTo2StacksInArray(4,1);
////        nStacks.pushTo2StacksInArray(4,1);
//        nStacks.popFrom2StacksInArray(2);
//        nStacks.popFrom2StacksInArray(2);
//        nStacks.popFrom2StacksInArray(1);


    }
}
