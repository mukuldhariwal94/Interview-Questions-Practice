package com.bebetteratjava.datastructures.arrays;

import com.sun.javaws.exceptions.InvalidArgumentException;

/**
 * Created by Praveen Banthia on 11/5/2017.
 */
public class MergeArrays {

    public static void mergeArrays(int[] a,int[] b,int aElementsSize,int bElementsSize){
        if(aElementsSize+bElementsSize > a.length){
            throw new IllegalArgumentException("Array a is not large enough to hold merged result");
        }

        int aCompIndex = aElementsSize-1;
        int bCompIndex = bElementsSize -1;

        int currIndex = a.length-1;
        while (bCompIndex != -1 && aCompIndex != -1){
            if(a[aCompIndex]>b[bCompIndex]){
                a[currIndex] = a[aCompIndex];
                aCompIndex--;
            }else{
                a[currIndex] = b[bCompIndex];
                bCompIndex--;
            }
            currIndex--;
        }

        while(bCompIndex != -1){
            a[currIndex] = b[bCompIndex];
            bCompIndex--;
            currIndex--;
        }
    }

    public static void main(String args[]){
        int[] a = new int[]{4,5,6,0,0,0};
        int [] b = new int[]{1,2,3};
        mergeArrays(a,b,3,3);
        for(int aElement:a){
            System.out.print(aElement);
        }
    }
}
