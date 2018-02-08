package com.bebetteratjava.datastructures.arrays;

import java.util.Arrays;

public class DistributeChocolateProblem {
    public static void main(String args[]){
        int[] chocolatePackets = {12, 4, 7, 9, 2, 23, 25, 41 , 30, 40, 28, 42, 30, 44, 48, 43, 50};
        int[] chocolatesToDistribute = distributeChocolates(chocolatePackets, 7);
        System.out.println(Arrays.toString(chocolatesToDistribute));
    }

    private static int[] distributeChocolates(int[] chocolatePackets, int noOfStudents) {
        Arrays.sort(chocolatePackets);
        int packetLen = chocolatePackets.length;
        if(packetLen < noOfStudents){
            System.out.println("Not enought Chocaltes to go around");
            return new int[]{};
        }
        int start = 0;
        int end = packetLen -1;
        int minDiff = Integer.MAX_VALUE;

        for(int i=0;i+noOfStudents-1<packetLen;i++){
           int diff = chocolatePackets[i+noOfStudents-1]-chocolatePackets[i];
           if(diff<minDiff){
               start = i;
               end = i+noOfStudents-1;
               minDiff=diff;
           }
        }

        System.out.println("Chocolate First:"+chocolatePackets[start]+" Chocolate End:"+chocolatePackets[end]);
        int[] result = Arrays.copyOfRange(chocolatePackets,start,end+1);
        return result;
    }
}
