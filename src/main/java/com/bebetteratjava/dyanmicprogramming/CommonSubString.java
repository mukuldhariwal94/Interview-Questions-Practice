package com.bebetteratjava.dyanmicprogramming;

/**
 * Created by Praveen Banthia on 11/6/2017.
 */
public class CommonSubString {

    public static String longestCommonSubString(String s1,String s2){

        int[][] cacheMatrix = new int[s1.length()][s2.length()];

        String out = "";

        for(int i=0;i<s1.length();i++){
            for(int j=0;j<s2.length();j++){
                if(s1.charAt(i) == s2.charAt(j)){
                    if(i==0 || j == 0){
                        cacheMatrix[i][j] = 1;
                    }else{
                        cacheMatrix[i][j] = 1 + cacheMatrix[i-1][j-1];
                    }
                }
                if(cacheMatrix[i][j]>out.length()){
                    out = s1.substring(i-cacheMatrix[i][j]+1,i+1);
                }
            }
        }
        System.out.println("Max Length common substring  is :"+out);
        return  null;
    }

    public static void main(String args[]){
        String s1 = "AB";
        String s2 = "BA";
        longestCommonSubString(s1,s2);
    }
}
