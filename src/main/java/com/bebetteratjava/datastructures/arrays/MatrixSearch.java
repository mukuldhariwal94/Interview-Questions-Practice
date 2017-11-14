package com.bebetteratjava.datastructures.arrays;

/**
 * Created by Praveen Banthia on 11/12/2017.
 */
public class MatrixSearch {

    //TODO write  a program to find the first occurence of num based on row/col preference

    private static boolean isNumInSortedMatrix(int[][] input,int noToFind){
        int searchPointer;
        for(int i=0;i<input.length;i++){
            searchPointer = input[i].length-1;
            if(input[i][searchPointer] < noToFind){
                continue;
            }else {
                for(int j=0;j<input[i].length;j++){
                    if(input[i][searchPointer] == noToFind){
                        return true;
                    }else{
                        searchPointer--;
                    }
                }
            }
        }

        return false;
    }

    public static void main(String args[]){
        int[][] input = new int[][]{{0,1,2,3},
                                    {4,5,6},
                                    {10,11,12,13},
                                    {14,15,16,17}};

        if(isNumInSortedMatrix(input,5)){
            System.out.println("Number found in sorted matrix");
        }else{
            System.out.println("Number not found");
        }
    }
}
