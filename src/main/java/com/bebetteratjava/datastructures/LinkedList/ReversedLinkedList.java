package com.bebetteratjava.datastructures.LinkedList;

/**
 * Created by Praveen Banthia on 11/10/2017.
 */
public class ReversedLinkedList
{
    private static class Node{
        Node next;
        int data;
    }

    /**
     * This  will reverse the existing list and return the new head
     * @param head
     * @return
     */
    private static Node reversingExistingList(Node head){
        Node curr = head;
        Node prev = null;
        Node next = null;
        while (curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    /**
     * This will create a new reversed linked list without affecting the existing list
     * @param head
     * @return
     */
    private static Node newReversedList(Node head){
        Node curr = head;
        Node prev = null;
        Node next = null;
        while (curr != null){
            next = curr.next;
            Node newNode = new Node();
            newNode.data = curr.data;
            newNode.next = prev;
            prev = newNode;
            curr = next;
        }
        return prev;
    }

    /**
     * This will use recursion to print elements in reverse
     * @param n
     */
    private static void recursiveReversePrinting(Node n){
        if(n== null) return;
        recursiveReversePrinting(n.next);
        System.out.println(n.data);
    }

    public static void main (String args[]){
        Node n1 = new Node();
        Node n2 = new Node();
        Node n3 = new Node();
        Node n4 = new Node();

        n1.data = 1;
        n1.next = n2;

        n2.data = 2;
        n2.next = n3;

        n3.data = 3;
        n3.next = n4;

        n4.data = 4;

        recursiveReversePrinting(n1);

        Node newReversedHead = newReversedList(n1);

        while (newReversedHead!= null){
            System.out.println(newReversedHead.data);
            newReversedHead = newReversedHead.next;
        }

        Node reversedHead = reversingExistingList(n1);
        while (reversedHead!=null){
            System.out.println(reversedHead.data);
            reversedHead = reversedHead.next;
        }

    }

}
