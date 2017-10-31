package com.bebetteratjava.datastructures.StacksAndQueues;

/**
 * Created by Praveen Banthia on 10/30/2017.
 * Implement a stack with push,pop & max function all of which run in O(1)
 */
public class MaxStack {

    private class Node{
        Node next;
        Node prevMax;
        int data;

        public Node(int n){
            this.data = n;
        }
    }

    /*
       3->5->2->6->1
       ^  ^  ^  ^  ^
       N  3  N  5  N

       top = 3
       max = 6

     */

    private  Node top;
    private  Node max;

    public void push(int n){
        Node newNode = new Node(n);
        newNode.next = top;
        top = newNode;

        if(max==null || max.data < newNode.data){
            newNode.prevMax = max;
            max = newNode;
        }
    }

    public int pop(){
        if(top == null){
            throw new NullPointerException("Stack is empty");
        }
        int data = top.data;
        if(top == max){
            max = top.prevMax;
        }
        top = top.next;
        return data;
    }

    public int maxNode(){
        if(max == null){
            throw new NullPointerException("Stack is empty no max present");
        }
        return max.data;
    }


    public void printStack(){
        Node curr = top;
        while (curr != null){
            System.out.print(curr.data);
            curr = curr.next;
            if(curr != null) {
                System.out.print("->");
            }
        }
    }

    public static void main(String args[]){
        MaxStack maxStack = new MaxStack();
        maxStack.push(3);
        maxStack.push(5);
        maxStack.push(8);
        System.out.println(maxStack.maxNode());
        maxStack.pop();
        System.out.println(maxStack.maxNode());
        maxStack.pop();
        System.out.println(maxStack.maxNode());
        maxStack.pop();


    }
}
