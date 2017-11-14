package com.bebetteratjava.miscellaneous;

/**
 * Created by Praveen Banthia on 11/12/2017.
 */
public class ClockAngle {

    private static final float MINSINCLOCK = 60;
    private static final float DEGREEPERMIN = 360/MINSINCLOCK;
    private static final float DEGREEPERHOUR = 360/12;

    public static double angleBetweenHands(int hourHand,int minHand){
        float minAngle = minHand * DEGREEPERMIN;
        float hourAngle = hourHand * DEGREEPERHOUR + ((minHand/MINSINCLOCK) * DEGREEPERHOUR);
        float diffBetweenHands = Math.abs(minAngle - hourAngle);
        if(diffBetweenHands > 180){
            return  360 - diffBetweenHands;
        }
        return  diffBetweenHands;
    }

    public static void main(String args[]){
        System.out.println(angleBetweenHands(11,10));
    }

}


