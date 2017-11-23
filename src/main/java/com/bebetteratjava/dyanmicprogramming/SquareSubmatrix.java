package com.bebetteratjava.dyanmicprogramming;

/**
 * Created by Praveen Banthia on 11/20/2017.
 */
public class SquareSubmatrix {

    public static int sideOfMaxSquare(int[][] input){
        int x = input.length;
        if(x == 0) return 0;
        // we need to check if x == 0 here
        int y = input[0].length;
        if(y == 0) return  0;

        int maxlenght = Integer.MIN_VALUE;
        int[][] cache = new int[x][y];
        for(int i = 0; i <input.length; i++){
            for(int j=0;j<input.length;j++){
                if(input[i][j] == 1){
                    if( i == 0 || j == 0){
                        cache[i][j] = input[i][j];
                    }else{
                        if(input[i-1][j] == 1 && input[i][j-1] == 1 && input[i-1][j-1] == 1){
                            cache[i][j] = cache[i-1][j-1] + 1;
                        }
                    }
                }
                if(cache[i][j] > maxlenght){
                    maxlenght = cache[i][j];
                }
            }
        }
        return  maxlenght;
    }

    public static void main(String args[]){
        int[][] input = new int[][]{{1,1,1,0},{1,1,1,0},{1,1,1,0},{0,0,0,0}};
        int maxSquareside = sideOfMaxSquare(input);
        System.out.println(maxSquareside);
    }
}
