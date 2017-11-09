package com.bebetteratjava.datastructures.StacksAndQueues;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Praveen Banthia on 11/8/2017.
 */
public class StackFromQueue {

    //TODO queue from stack

    Queue<Integer> inputQueueSlowPush;
    Queue<Integer> secondaryQueueSlowPush;

    Queue<Integer> inputQueueSlowPop;
    Queue<Integer> secondaryQueueSlowPop;


    

    public StackFromQueue(){
        inputQueueSlowPush = new LinkedList<Integer>();
        secondaryQueueSlowPush = new LinkedList<Integer>();
        inputQueueSlowPop = new LinkedList<Integer>();
        secondaryQueueSlowPop = new LinkedList<Integer>();
    }

    public void slowPush(int n){
        while (!inputQueueSlowPush.isEmpty()){
            secondaryQueueSlowPush.add(inputQueueSlowPush.poll());
        }
        inputQueueSlowPush.add(n);
        while (!secondaryQueueSlowPush.isEmpty()){
            inputQueueSlowPush.add(secondaryQueueSlowPush.poll());
        }
    }

    public int fastPop(){
        return inputQueueSlowPush.poll();
    }
    
    
    public void fastPush(int n){
        inputQueueSlowPop.add(n);
    }

    public int slowPop(){
        while (inputQueueSlowPop.size() !=1){
            secondaryQueueSlowPop.add(inputQueueSlowPop.poll());
        }
        int data = inputQueueSlowPop.poll();
        Queue<Integer> temp = inputQueueSlowPop;
        inputQueueSlowPop = secondaryQueueSlowPop;
        secondaryQueueSlowPop = temp;
        return data;
    }

    /*
    1->2->3

     */
    public static void main(String args[]){
        StackFromQueue sfq = new StackFromQueue();
        sfq.slowPush(1);
        sfq.slowPush(2);
        sfq.slowPush(3);
        System.out.println(sfq.fastPop());
        sfq.slowPush(4);
        System.out.println(sfq.fastPop());
        System.out.println(sfq.fastPop());
        sfq.slowPush(5);
        sfq.slowPush(6);
        System.out.println(sfq.fastPop());
        System.out.println(sfq.fastPop());
        System.out.println(sfq.fastPop());


        System.out.println("======================================");

        sfq.fastPush(1);
        sfq.fastPush(2);
        sfq.fastPush(3);
        System.out.println(sfq.slowPop());
        sfq.fastPush(4);
        System.out.println(sfq.slowPop());
        System.out.println(sfq.slowPop());
        sfq.fastPush(5);
        sfq.fastPush(6);
        System.out.println(sfq.slowPop());
        System.out.println(sfq.slowPop());
        System.out.println(sfq.slowPop());
    }
}
