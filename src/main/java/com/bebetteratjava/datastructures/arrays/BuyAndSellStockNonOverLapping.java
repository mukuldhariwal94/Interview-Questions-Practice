package com.bebetteratjava.datastructures.arrays;

public class BuyAndSellStockNonOverLapping {
    public static void main(String args[]){
        int[] input = new int[]{100, 80, 120, 130, 70, 60, 100, 125};
        int maxProfit= buySellStockMaxProfit(input);
        System.out.println(maxProfit);
    }

    private static int buySellStockMaxProfit(int[] input) {
        int maxProfit = 0;
        for (int i=1;i<input.length;i++){
            if(input[i-1]<input[i]){
                maxProfit += input[i] - input[i-1];
            }
        }
        return maxProfit;
    }
}
