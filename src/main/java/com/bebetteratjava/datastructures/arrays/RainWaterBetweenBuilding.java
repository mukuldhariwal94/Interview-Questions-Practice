package com.bebetteratjava.datastructures.arrays;

public class RainWaterBetweenBuilding {

    public static void main(String args[]){
       int[] input = new int[]{1,5,2,3,1,7,2,4};
       int totalWater = rainwaterOnTowers(input);
       System.out.println(totalWater);
    }

    private static int rainwaterOnTowers(int[] input) {

        int maxSeenFromRight = 0;
        int maxRight[] = new int[input.length];
        int maxOnLeft = input[0];
        int totalWaterOnRoofs = 0;

        for (int i=input.length-1;i>=0;i--){
            if (input[i]>maxSeenFromRight){
                maxSeenFromRight = input[i];
                maxRight[i] = maxSeenFromRight;
            }else{
                maxRight[i] = maxSeenFromRight;
            }
        }

        for (int i=1;i<input.length-1;i++){
            if (input[i]> maxOnLeft){
                maxOnLeft = input[i];
                continue;
            }
//            int maxOnRight = maxOnRight(i,input);
            if (input[i]<maxOnLeft && input[i]<maxRight[i]){
                totalWaterOnRoofs += Math.min(maxOnLeft,maxRight[i]) - input[i];
            }
        }
        return totalWaterOnRoofs;
    }

    @Deprecated
    private static int maxOnRight(int currIndex,int[] input) {
        int maxOnRight = input[currIndex];
        for (int i=currIndex+1;i<input.length;i++){
            if(input[i]>maxOnRight){
                maxOnRight = input[i];
            }
        }
        return maxOnRight;
    }
}
