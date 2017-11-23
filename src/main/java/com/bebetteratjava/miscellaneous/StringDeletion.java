package com.bebetteratjava.miscellaneous;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

/**
 * Created by Praveen Banthia on 11/15/2017.
 */
public class StringDeletion {

    public int minStringDeletion(String input,HashSet<String> dictionary){
        Queue<String> inputPerm = new LinkedList<String>();
        Set<String> queueElements = new HashSet<String>();
        inputPerm.add(input);
        queueElements.add(input);

        while (!inputPerm.isEmpty()){
            String currString = inputPerm.remove();
            queueElements.remove(currString);
            if(dictionary.contains(currString)){
                return input.length() - currString.length();
            }
            for(int i=0;i<input.length();i++){
                String out = currString.substring(0,i)+currString.substring(i+1,input.length());
                inputPerm.add(out);
                queueElements.add(out);
            }
        }
        return -1;
    }

    public static void main(String args[]){
        String input = "abc";
        HashSet<String> dictionary = new HashSet<String>();
        dictionary.add("a");
        dictionary.add("aa");
        dictionary.add("aaa");

    }
}
