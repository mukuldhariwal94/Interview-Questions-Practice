package com.bebetteratjava.datastructures.arrays;

import com.sun.javaws.exceptions.InvalidArgumentException;

/**
 * Created by Praveen Banthia on 11/3/2017.
 */
public class NStacks {
    private int[] arrayNStacks;
    private int[] topOfStacks;
    private int[] nextIndex;
    private int nextAvailable;


    public NStacks(int arraySize,int noOfStacks){
        topOfStacks = new int[noOfStacks];
        //setting all to -1
        for(int i=0;i<topOfStacks.length;i++){
            topOfStacks[i] = -1;
        }

        arrayNStacks = new int[arraySize];

        nextIndex = new int[arraySize];
        for(int i=0;i<arraySize-1;i++){
            nextIndex[i] = i+1;
        }
        nextIndex[arraySize-1] = -1;
        nextAvailable = 0;
    }

    public void pushToNStacks(int data,int stackNo){
        if(stackNo >= topOfStacks.length){
            throw new IndexOutOfBoundsException("Stack No. is not valid");
        }

        if(nextAvailable < 0){
            throw new IndexOutOfBoundsException("Array is full cannot push to stack");
        }


        int currIndex = nextAvailable;
        arrayNStacks[currIndex] = data;
        nextAvailable = nextIndex[currIndex];
        nextIndex[currIndex] = topOfStacks[stackNo];
        topOfStacks[stackNo]=currIndex;

    }


    public int popFromNStack(int stackNo){
        if(stackNo >= topOfStacks.length){
            throw new IndexOutOfBoundsException("Stack No. is not valid");
        }
        if(topOfStacks[stackNo] < 0){
            throw new IndexOutOfBoundsException("Stack is empty nothing to pop");
        }
        int curIndex = topOfStacks[stackNo];
        topOfStacks[stackNo] = nextIndex[curIndex];
        nextIndex[curIndex] = nextAvailable;
        nextAvailable = curIndex;

        return  arrayNStacks[curIndex];
    }

    public static void main(String args[]){
        NStacks nStacks = new NStacks(6,3);
        nStacks.pushToNStacks(5,0);
        nStacks.pushToNStacks(6,0);
        System.out.println(nStacks.popFromNStack(0));
        System.out.println(nStacks.popFromNStack(0));
        System.out.println(nStacks.popFromNStack(0));

    }
}


