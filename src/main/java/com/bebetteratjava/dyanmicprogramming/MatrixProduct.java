package com.bebetteratjava.dyanmicprogramming;

/**
 * Created by Praveen Banthia on 12/5/2017.
 */
public class MatrixProduct {

    public static long matrixProduct(int[][] input){
        long[][] minProdCache = new long[input.length][input[0].length];
        long[][] maxProdCache = new long[input.length][input[0].length];

        for (int i =0;i<input.length;i++){
            for(int j=0;j<input[i].length;j++){
                if(i==0 && j==0){
                    minProdCache[i][j] = input[i][j];
                }else if(i==0 && j!= 0){
                    minProdCache[i][j] = input[i][j] * minProdCache[i][j-1];
                }else if(j==0 && i!=0){
                    minProdCache[i][j] = input[i][j] * minProdCache[i-1][j];
                }else{
                    minProdCache[i][j] = Math.min( input[i][j] *minProdCache[i-1][j], input[i][j] *minProdCache[i][j-1]);
                }
            }
        }

        for (int i =0;i<input.length;i++){
            for(int j=0;j<input[i].length;j++){
                if(i==0 && j==0){
                    maxProdCache[i][j] = input[i][j];
                }else if(i==0 && j!= 0){
                    maxProdCache[i][j] = input[i][j] * maxProdCache[i][j-1];
                }else if(j==0 && i!= 0){
                    maxProdCache[i][j] = input[i][j] * maxProdCache[i-1][j];
                }else{
                    maxProdCache[i][j] = Math.max( input[i][j] * maxProdCache[i-1][j], input[i][j] * maxProdCache[i][j-1]);
                }
            }
        }

        long minProd = minProdCache[input.length-1][input[input.length-1].length-1];
        long maxProd = maxProdCache[input.length-1][input[input.length-1].length-1];
        return Math.max(minProd,maxProd);
    }

    public static void main(String args[]){
        int[][] input = new int[][]{{-1,2,3},{4,5,-6},{7,8,9}};
        long max = matrixProduct(input);
        System.out.println(max);
    }
}
