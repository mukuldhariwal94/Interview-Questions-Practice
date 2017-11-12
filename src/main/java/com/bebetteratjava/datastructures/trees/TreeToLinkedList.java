package com.bebetteratjava.datastructures.trees;

/**
 * Created by Praveen Banthia on 11/12/2017.
 */
public class TreeToLinkedList {
    public static class Node{
        Node leftNode;
        Node rightNode;
        int data;
    }

    /*
      <-4->  <-2->
     */
    private static Node combineTwoNodes(Node nodeA, Node nodeB) {
        if(nodeA == null) return nodeB;
        if(nodeB == null) return nodeA;
        if(nodeA == nodeB) return nodeA;

        //since this is circular left of curr node should point to right
        Node aRightEnd = nodeA.leftNode;
        Node bRightEnd = nodeB.leftNode;

        aRightEnd.rightNode = nodeB;
        nodeB.leftNode = aRightEnd;
        nodeA.leftNode = bRightEnd;
        bRightEnd.rightNode = nodeA;

        return nodeA;
    }
    /*
    n = 4;
     */
    public static Node convertToDLinkedList(Node node){
        if(node == null) return null;
        Node leftSubTree = convertToDLinkedList(node.leftNode);
        Node rightSubTree = convertToDLinkedList(node.rightNode);
        node.leftNode = node;
        node.rightNode = node;

        Node midNode = combineTwoNodes(leftSubTree,node);
        Node combinedNode = combineTwoNodes(midNode,rightSubTree);

        return combinedNode;
    }




    public static void main(String args[]){
        Node n1 = new Node();
        Node n2 = new Node();
        Node n3 = new Node();
        Node n4 = new Node();
        Node n5 = new Node();
        Node n6 = new Node();
        Node n7 = new Node();

        n1.data = 1;
        n1.leftNode = n2;
        n1.rightNode = n3;

        n2.data = 2;
        n2.leftNode = n4;
        n2.rightNode = n5;

        n4.data = 4;
        n5.data = 5;


        n3.data = 3;
        n3.leftNode = n6;
        n3.rightNode = n7;

        n6.data = 6;
        n7.data = 7;




        convertToDLinkedList(n1);

        Node currNode = n4;
        do{
            System.out.println(currNode.data);
            currNode = currNode.rightNode;
        }while (currNode != n4);

    }
}
