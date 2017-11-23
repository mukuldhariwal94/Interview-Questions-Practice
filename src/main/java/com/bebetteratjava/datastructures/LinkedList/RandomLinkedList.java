package com.bebetteratjava.datastructures.LinkedList;

/**
 * Created by Praveen Banthia on 11/20/2017.
 */
public class RandomLinkedList {
    public static class Node{
        int data;
        Node next;
        Node random;
    }

    public static Node createDuplicateList(Node head){
        Node curr = head;
        //create  a copy of node with random pointing to null;
        while (curr!=null){
            Node newCurr = new Node();
            newCurr.data = curr.data;
            newCurr.next = curr.next;
            curr.next = newCurr;
            curr = newCurr.next;
        }

        curr = head;
        //assign the random node to new Node and jump over them
        while (curr!=null){
            Node curRand = curr.random;
            curr.next.random = curRand.next;
            curr = curr.next.next;
        }

        curr = head;
        Node newHead = head.next;
        while (curr!=null){
            Node dupCurr = curr.next;
            curr.next = dupCurr.next;
            if(curr.next!=null) {
                dupCurr.next = curr.next.next;
            }
            curr = curr.next;
        }

        return newHead;
    }

    public static void main(String args[]){
        Node n1 = new Node();
        Node n2 = new Node();
        Node n3 = new Node();
        Node n4 = new Node();

        n1.data = 1;
        n1.next = n2;
        n1.random = n3;

        n2.data = 2;
        n2.next = n3;
        n2.random = n1;

        n3.data = 3;
        n3.next = n4;
        n3.random = n3;

        n4.data = 4;
        n4.random = n2;

        Node dupList = createDuplicateList(n1);

        Node currOriginal = n1;
        while (currOriginal != null){
            System.out.println(currOriginal);
            System.out.println(currOriginal.data);
            currOriginal = currOriginal.next;
        }


        while (dupList != null){
            System.out.println(dupList);
            System.out.println(dupList.data);
            dupList = dupList.next;
        }
    }
}
