package com.bebetteratjava.miscellaneous;

import java.util.Arrays;

/**
 * Created by Praveen Banthia on 12/10/2017.
 */
public class MedianOfSortedArrays {

    public static double sortedMedian(int[] array1,int[] array2){
        if(array1.length > array2.length){
            //this ensures that the first array is always of smaller length.
            sortedMedian(array2,array1);
        }

        int x = array1.length;
        int y = array2.length;
        int low = 0;
        int high = x;
        while (low<=high) {
            int partitionOfX  = (low+high)/2;
            int partitionOfY = (x+y+1)/2 - partitionOfX;

            int maxLeftX = partitionOfX == 0?Integer.MIN_VALUE:array1[partitionOfX-1];
            int minRightX = partitionOfX == x?Integer.MAX_VALUE:array1[partitionOfX];

            int maxLeftY = partitionOfY == 0?Integer.MIN_VALUE:array2[partitionOfY-1];
            int minRightY = partitionOfY == y?Integer.MAX_VALUE:array2[partitionOfY];

            if(maxLeftX <= minRightY && maxLeftY <= minRightY){
                if((x+y)%2 == 0){
                    return (double)(Math.max(maxLeftX,maxLeftY)+Math.min(minRightX,minRightY))/2;
                }else
                    return Math.max(maxLeftX,maxLeftY);
            }else if(maxLeftX > minRightY){
                high = partitionOfX -1;
            }else{
                low = partitionOfX -1;
            }

        }
        throw new IllegalArgumentException();
    }

    public static void main(String args[]){
        int[] sortedArray1 = new int[]{1,3,5};
        int[] sortedArray2 = new int[]{2,4,6};
        double result = sortedMedian(sortedArray1,sortedArray2);
        System.out.println(result);
    }
}
