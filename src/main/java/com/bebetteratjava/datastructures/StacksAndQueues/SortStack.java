package com.bebetteratjava.datastructures.StacksAndQueues;

import java.util.Stack;

/**
 * Created by Praveen Banthia on 11/10/2017.
 */
public class SortStack {

    public static void main(String args[]){
        Stack<Integer> input = new Stack<Integer>();
        input.push(0);
        input.push(2);
        input.push(19);
        input.push(1);
        
//        Stack<Integer> output = sortStackWithMaxOnTop(input);

        modifyExistingStackWithMinOnTop(input);

//        System.out.println("Max Element in input is:"+output.peek());
        System.out.println("Min Element in input is:"+input.peek());
        while (!input.isEmpty()){
            System.out.println(input.pop());
        }
    }

    private static Stack<Integer> sortStackWithMaxOnTop(Stack<Integer> input) {
        Stack<Integer> tempStack = new Stack<Integer>();
        int temp;
        tempStack.push(input.pop());
        while (!input.isEmpty()) {
            temp = input.pop();
            while ( !tempStack.isEmpty() && temp < tempStack.peek()) {
                input.push(tempStack.pop());
            }
            tempStack.push(temp);
        }
        return tempStack;
    }

    private static void modifyExistingStackWithMinOnTop(Stack<Integer> input){
        Stack<Integer> tempStack = new Stack<Integer>();
        int temp;
        while (!input.isEmpty()){
            tempStack.push(input.pop());
        }
        input.push(tempStack.pop());
        while (!tempStack.isEmpty()){
            temp = tempStack.pop();
            while (!input.isEmpty() && temp > input.peek()){
                tempStack.push(input.pop());
            }
            input.push(temp);
        }
    }
}
