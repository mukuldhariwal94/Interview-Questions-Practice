package com.bebetteratjava.miscellaneous;

/**
 * Created by Praveen Banthia on 10/31/2017.
 */
public class Anagrams {

    private static int ALLCHARSSIZE = 256;

    private static boolean isAnagram(String s1,String s2){
        if(s1.length() != s2.length()){
            return false;
        }

        int[] letters = new int[ALLCHARSSIZE];
//        int[] letters = new int[1<<8];

        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        for(char charIns1 : s1.toCharArray()){
            int charPos = charIns1;
            letters[charPos]++;
        }

        for(char charsIns2:s2.toCharArray()){
            int charPos = charsIns2;
            letters[charPos]--;
        }

        for(int letter: letters){
            if(letter != 0){
                return false;
            }
        }

        return true;
    }
    public static void main(String args[]){
        if(isAnagram("Banana","NANAba")){
            System.out.println("Inputs are anagram");
        }else
            System.out.println("Inputs are not anagram");
    }
}
