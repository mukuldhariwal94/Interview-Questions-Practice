package com.bebetteratjava.miscellaneous;

/**
 * Created by Praveen Banthia on 10/31/2017.
 */
public class StringCompression {

    public static String compressedString(String s1){
        StringBuilder sb = new StringBuilder();
        int charCount = 1;
        for(int i =1;i< s1.length();i++){
            if(s1.charAt(i-1) != s1.charAt(i)){
                sb.append(s1.charAt(i-1));
                sb.append(charCount);
                charCount = 1;
            }else{
                charCount++;
            }
        }
        sb.append(s1.charAt(s1.length()-1));
        sb.append(charCount);
        return s1.length() > sb.toString().length()?sb.toString():s1;
    }

    public static void main(String args[]){
        //a3b2c2d1a1
        String compressedString = compressedString("aaabbbbbbccda");
        System.out.println("Shorter String is :"+compressedString);
    }
}
