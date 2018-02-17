package com.bebetteratjava.datastructures.arrays;

import java.util.Arrays;

public class MergeSort {

    public static void mergeSort(int[] input){
        mergeSort(input,0,input.length-1);
    }

    public static void mergeSort(int[] input,int start,int end){
        if (start<end){
            int mid = (start + end)/2;
            mergeSort(input,start,mid);
            mergeSort(input,mid+1,end);
            mergeSortHelper(input,start,mid,end);
        }
    }

    private static void mergeSortHelper(int[] input, int start,int mid, int end) {
        System.out.println("Start:"+start+"Mid:"+mid+"ENd:"+end);
        int[] temp1 = new int[mid-start+1];
        int[] temp2 = new int[end-mid];
        int x  = 0;
        int y = 0;
        for (int i=0;i<temp1.length;i++){
            temp1[i] = input[start+i];
        }

        for (int j=0;j<temp2.length;j++){
            temp2[j] = input[mid+j+1];
        }

        int inputIdx = start;
        while (x<temp1.length && y<temp2.length){
            if(temp1[x]<=temp2[y]){
                input[inputIdx] = temp1[x];
                x++;
            }else {
                input[inputIdx] = temp2[y];
                y++;
            }
            inputIdx++;
        }

        if(y<temp2.length){
            input[inputIdx] = temp2[y];
            y++;
            inputIdx++;
        }

        if(x<temp1.length){
            input[inputIdx]  = temp1[x];
            x++;
            inputIdx++;
        }
    }

    public static void main(String args[]){
        int[] input = new int[]{10,12,11,94};
        mergeSort(input);
        System.out.println(Arrays.toString(input));
    }
}
