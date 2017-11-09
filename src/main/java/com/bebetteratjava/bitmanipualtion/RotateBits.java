package com.bebetteratjava.bitmanipualtion;

/**
 * Created by Praveen Banthia on 11/4/2017.
 */
public class RotateBits {


    private static final int BITS_IN_INTEGER = 32;

    public static int rotateBitsRight(int n,int rotateBits){
        if(rotateBits<0 || rotateBits > BITS_IN_INTEGER){
            throw new IllegalArgumentException("rotate size is out of bounds");
        }
        int rightSubPart  = n>>rotateBits;
        int leftSubPart   = n<<(BITS_IN_INTEGER-rotateBits);
        System.out.println(BITS_IN_INTEGER-rotateBits);
        return  (rightSubPart|leftSubPart);
    }

    /*
         00001000 ~ 8 >> 5
         1X0000000 ~ 2^31
     */
    public static void main(String args[]){
        int rotatedInt = rotateBitsRight(8,4);
        System.out.println(rotatedInt);
        System.out.println(Integer.MAX_VALUE);
    }
}



