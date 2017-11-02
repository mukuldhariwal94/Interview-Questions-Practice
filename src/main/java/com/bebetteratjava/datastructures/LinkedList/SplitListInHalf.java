package com.bebetteratjava.datastructures.LinkedList;

import com.sun.javaws.exceptions.InvalidArgumentException;

/**
 * Created by Praveen Banthia on 11/1/2017.
 */
public class SplitListInHalf {
    public static class Node{
        Node next;
        int data;
    }

    public static Node listInHalf(Node head){
        if(head == null || head.next ==null){
            throw new IllegalArgumentException("List not big enough to split");
        }
        Node follower = head;
        Node runner = head.next;
        while (runner!=null && runner.next != null){
            follower = follower.next;
            runner = runner.next;
            if(runner == null){
                break;
            }
            runner = runner.next;
        }

        Node newHead = follower.next;
        follower.next = null;

        return newHead;
    }

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
        n4.data = 4;
        n4.next = n5;
        n5.data = 5;

        Node newHead = listInHalf(n1);
        Node curr = newHead;
        while (curr!=null){
            System.out.print(curr.data);
            curr=curr.next;
            if(curr!=null){
                System.out.print("->");
            }
        }
    }
}
