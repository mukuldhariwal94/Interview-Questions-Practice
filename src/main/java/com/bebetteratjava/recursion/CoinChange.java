package com.bebetteratjava.recursion;

/**
 * Created by Praveen Banthia on 10/30/2017.
 */
public class CoinChange {

    static int [] coinage = {1,2,5,10,20,50,100}; // US coinage example

    /*
      money = 1 coins = 1 [1,1]
      money = 2 coins = 1 [2]
      money = 3 coins = 2 [1,2]
     */
    public static int minNoOfCoins(int[] coinage,int money) {
        int[] calcValues = new int[money+1];// to consider 0 and the max val both;
        for(int i =0;i<=money;i++){
            calcValues[i] = -1;
        }
        return minNoOfCoins(coinage,money,calcValues);
    }

    public static int minNoOfCoins(int[] coinage,int money,int[] calcValues){
        //boundary condition
        if(money == 0){
            return 0;
        }
        int minNoOfCoins = Integer.MAX_VALUE;
        for (int value : coinage) {
            if (money - value >= 0) {
                int coinCount;
                if(calcValues[money - value] > -1){
                    coinCount = calcValues[money - value];
                }else {
                    coinCount = minNoOfCoins(coinage, money - value,calcValues);
                    calcValues[money - value] = coinCount;
                }
                if(coinCount+1 < minNoOfCoins) {
                    minNoOfCoins = coinCount + 1;
                }
            }
        }
        return minNoOfCoins;
    }

    public static void main(String args[]){
        int minNoOfCoins = minNoOfCoins(coinage,49);
        System.out.println(minNoOfCoins);
    }
}
