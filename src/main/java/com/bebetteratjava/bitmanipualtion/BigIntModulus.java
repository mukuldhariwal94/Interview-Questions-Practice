package com.bebetteratjava.bitmanipualtion;

/**
 * Created by Praveen Banthia on 11/18/2017.
 */
public class BigIntModulus {

    public static int mod(char[] a, int b) {
        // If input is null, let's just return 0
        if (a == null) return 0;
        int m = 0;
        // Start with modding the most significant byte, then repeatedly shift
        // left. This way our value never gets larger than an int
        for (int i = 0; i < a.length; i++) {
            m <<= 8;
            m += (a[i] & 0xFF);
            m %= b;
        }
        return m;
    }


    public static void main(String args[]){
        char[] bits = new char[]{0x03,0xED};
        System.out.println(mod(bits,10));

    }
}
