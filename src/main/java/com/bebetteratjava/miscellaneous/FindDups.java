package com.bebetteratjava.miscellaneous;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Praveen Banthia on 12/4/2017.
 */
public class FindDups {

    public static ArrayList<Integer> findDups(int[] input){
        Set<Integer> dups =  new HashSet<Integer>();
        for (int i=1;i<input.length;i++){
           int index = Math.abs(input[i]) - 1;
           if(input[index] < 0){
               dups.add(Math.abs(input[i]));
           }else {
               input[index] = input[index] * -1;
           }
        }

        for(int i: input){
           i = Math.abs(i);
        }

        return new ArrayList<Integer>(dups);

    }

    public static void main(String args[]){
        int[] input = new int[]{2,1,2,3,2,1};
        ArrayList<Integer> dups = findDups(input);
        for (int i: dups){
            System.out.println(i);
        }
    }
}
