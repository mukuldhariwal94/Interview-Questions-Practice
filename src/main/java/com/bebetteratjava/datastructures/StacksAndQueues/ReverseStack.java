package com.bebetteratjava.datastructures.StacksAndQueues;

import java.util.Stack;

/**
 * Created by Praveen Banthia on 11/13/2017.
 */
public class ReverseStack {


    public static void reverseStack(Stack<Integer> input){
        if(input.isEmpty()){
            return;
        }
        int currElement = input.pop();
        reverseStack(input);
        addToBottomOfStack(input,currElement);
    }

    private static void addToBottomOfStack(Stack<Integer> stack,int data){
        if(stack.isEmpty()){
            stack.push(data);
            return;
        }
        int currElement = stack.pop();
        addToBottomOfStack(stack,data);
        stack.push(currElement);
    }



    public static void main(String args[]){
        Stack<Integer> input = new Stack<Integer>();
        input.push(1);
        input.push(2);
        input.push(3);
        input.push(4);

        reverseStack(input);

        System.out.println(input.pop());
        System.out.println(input.pop());
        System.out.println(input.pop());
        System.out.println(input.pop());
    }
}
