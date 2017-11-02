package com.bebetteratjava.datastructures.trees;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Praveen Banthia on 11/2/2017.
 */
public class LevelOrderTree
{
    public static class Node{
        Node left;
        Node right;
        int data;
    }


    public static void printInLevelOrder(Node root){
        if(root == null) throw new NullPointerException("Tree is empty");

        Queue<Node> nodeQueue = new LinkedList<Node>();
        nodeQueue.add(root);
        while (!nodeQueue.isEmpty()){
            Node curr = nodeQueue.poll();
            System.out.print(curr.data);
            if(curr.left!=null)nodeQueue.add(curr.left);
            if(curr.right!=null)nodeQueue.add(curr.right);
            if(!nodeQueue.isEmpty()){
                System.out.print("->");
            }
        }
    }

    /*
                1
               / \
              2   3
             / \ / \
            4  5 6  7
     */
    public static void main(String args[]){
        Node n1 = new Node();
        Node n2 = new Node();
        Node n3 = new Node();
        Node n4  = new Node();
        Node n5  = new Node();
        Node n6 = new Node();
        Node n7 = new Node();

        n1.data = 1;
        n1.left = n2;
        n1.right = n3;

        n2.data = 2;
        n2.left = n4;
        n2.right = n5;

        n4.data = 4;
        n5.data = 5;

        n3.data = 3;
        n3.left = n6;
        n3.right= n7;

        n6.data = 6;
        n7.data = 7;

        printInLevelOrder(n1);
    }
}
