package com.bebetteratjava.datastructures.LinkedList;

import java.util.HashSet;

/**
 * Created by Praveen Banthia on 11/15/2017.
 */
public class DeDupLinkedList {

    public static class Node{
        Node next;
        int data;
    }

    public static void removeDupsUsingSet(Node head){
        // logic to check if head is null
        HashSet<Integer> elementsInList = new HashSet<Integer>();
        Node prev = null;
        Node curr = head;
        while (curr != null){
            if(!elementsInList.contains(curr.data)){
                elementsInList.add(curr.data);
                prev = curr;
            }else{
                prev.next = curr.next;
            }
            curr = curr.next;
        }
    }

    public static void removeDupsUsingSetWithoutPrev(Node head){
        // logic to check if head is null
        HashSet<Integer> elementsInList = new HashSet<Integer>();
        elementsInList.add(head.data);
        Node curr = head;
        while (curr.next != null){
            if(!elementsInList.contains(curr.next.data)){
                elementsInList.add(curr.next.data);
                curr = curr.next;
            }else{
                curr.next = curr.next.next;
            }
        }
    }

    public static void removeDupsWithoutDS(Node head){
        // logic to check if head is null
        Node currNode = head;

        while (currNode != null){
            Node runner = currNode.next;
            Node prev = currNode;
            while (runner != null){
                if(currNode.data == runner.data){
                    prev.next = runner.next;
                }else {
                    prev = runner;
                }
                runner = runner.next;
            }
            currNode = currNode.next;
        }
    }

    /**
     * This is similar to what I thought of but without the use of prev variable
     * @param head
     */
    public static void removeDupsWithoutDSWithoutPrev(Node head){
        // logic to check if head is null
        Node currNode = head;

        while (currNode != null){
            Node runner = currNode;
            while (runner.next != null){
                if(currNode.data == runner.next.data){
                    runner.next = runner.next.next;
                }else {
                    runner = runner.next;
                }
            }
            currNode = currNode.next;
        }
    }

    public static void main(String args[]){
        Node n1 = new Node();
        Node n2 = new Node();
        Node n3 = new Node();
        Node n4  = new Node();
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

//        removeDupsUsingSet(n1);
        removeDupsUsingSetWithoutPrev(n1);

//        removeDupsWithoutDS(n1);
//        removeDupsWithoutDSWithoutPrev(n1);
        Node curr = n1;

        while (curr != null){
            System.out.println(curr.data);
            curr = curr.next;
        }


    }
}
