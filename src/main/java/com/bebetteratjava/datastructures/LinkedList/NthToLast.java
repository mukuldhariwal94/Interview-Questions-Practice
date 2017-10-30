package com.bebetteratjava.datastructures.LinkedList;

/**
 * Created by Praveen Banthia on 10/29/2017.
 */
public class NthToLast {
    public static class Node{
        int data;
        Node next;
    }

    public static Node nthToLastElement(Node head,int pos){
        if(head == null) throw new NullPointerException("The List is empty");
       Node follower = head;
       Node runner = head;
       for (int i=0;i<pos;i++){
            runner = runner.next;
            if(runner == null){
                throw new IllegalArgumentException("The Pos is out of bounds of the list");
            }
       }

       while (runner.next != null){
           follower = follower.next;
           runner = runner.next;
       }

        return follower;
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
        n5.next = null;

        Node nthToLastNode = nthToLastElement(n1,1);

        System.out.println(nthToLastNode.data);
    }
}
