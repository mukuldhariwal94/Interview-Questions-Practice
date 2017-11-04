package com.bebetteratjava.datastructures.LinkedList;

import com.sun.javaws.exceptions.InvalidArgumentException;
import org.omg.DynamicAny.NameDynAnyPair;

import java.util.Stack;

/**
 * Created by Praveen Banthia on 11/3/2017.
 */
public class Palindrome {

    public enum Mode{
        Simple,
        SimpleEfficient,
        Stack;
    }

    public static class Node{
        Node next;
        int data;
    }

    public static boolean isListPalindrome(Node head, Mode m){
        boolean isPalindrome = false;
        switch (m){
            case Simple: isPalindrome = listReverseFullCheck(head);
                        break;
            case SimpleEfficient: isPalindrome = listReverseHalfCheck(head);
                        break;
            case Stack: isPalindrome = listCheckStack(head);
        }
        return isPalindrome;
    }

    private static  boolean listReverseFullCheck(Node head){
        Node rHead = reversedList(head);

        Node rCurr = rHead;
        Node curr = head;
        while (rCurr!=null){
            if(curr.data != rCurr.data){
                return  false;
            }
            curr = curr.next;
            rCurr = rCurr.next;
        }
        return true;
    }

    private static boolean listReverseHalfCheck(Node head){
        Node rHead = reversedList(head);

        Node rCurr = rHead;
        Node rRunner = rHead.next;
        Node curr = head;
        while (rRunner != null && rRunner.next != null){
            if(curr.data != rCurr.data){
                return  false;
            }
            curr = curr.next;
            rCurr = rCurr.next;
            rRunner = rRunner.next;
            if(rRunner == null){
                break;
            }else{
                rRunner = rRunner.next;
            }
        }
        return  true;
    }

    private static boolean listCheckStack(Node head){
        Node curr = head;
        Node runner = head;
        Stack<Integer> stack = new Stack<Integer>();
        while (runner != null && runner.next != null){
            stack.push(curr.data);
            runner = runner.next.next;
            curr = curr.next;
        }

        if(runner != null){
            curr = curr.next;
        }

        while (curr != null){
            if(stack.pop() != curr.data){
                return false;
            }
            curr = curr.next;
        }

        return true;


    }

    /**
     * This will create a new Linked list and return its head;
     * @param head
     * @return
     */
    private static Node reversedList(Node head) {
        if(head == null){
            throw new IllegalStateException("Not enough elements to reverse");
        }

        Node curr = head;
        Node prev = null;
        while (curr!=null){
            Node n1 = new Node();
            n1.data = curr.data;
            n1.next = prev;
            prev = n1;
            curr = curr.next;
        }

        return prev;
    }

    /*
    1->2->3->2->1
    1->2->2->1
     */
    public static void main(String args[]){
        Node n1 = new Node();
        Node n2 = new Node();
        Node n3 = new Node();
        Node n4 = new Node();
        Node n5 = new Node();

        n1.data = 1;
        n1.next = n2;

        n2.data = 2;
        n2.next = n3;

        n3.data = 3;
        n3.next = n4;

        n4.data = 2;
        n4.next = n5;

        n5.data = 1;

        if(isListPalindrome(n1,Mode.Stack)){
            System.out.println("This is a palindrome");
        }else{
            System.out.println("This is not a palindrome");
        }
    }

}
