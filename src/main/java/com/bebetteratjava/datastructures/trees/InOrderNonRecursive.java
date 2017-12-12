package com.bebetteratjava.datastructures.trees;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * Created by Praveen Banthia on 12/5/2017.
 */
public class InOrderNonRecursive {
    public static class Node{
        Node left;
        Node right;
        int data;
    }

    public static List<Integer> inOrderNoRecursion(Node head){
        Stack<Node> stack = new Stack<Node>();
        LinkedList<Integer> result = new LinkedList<Integer>();
        pushAllNodesInLeftBranch(head,stack);
        while (!stack.isEmpty()){
            Node left = stack.pop();
            result.add(left.data);
            if(!stack.isEmpty()) {
                Node root = stack.pop();
                result.add(root.data);
                pushAllNodesInLeftBranch(root.right, stack);
            }
        }
        return result;
    }

    public static void InOrderTraversalRecursion(Node node){
        if(node == null){
            return;
        }
        InOrderTraversalRecursion(node.left);
        System.out.println(node.data);
        InOrderTraversalRecursion(node.right);
    }

    private static void pushAllNodesInLeftBranch(Node node,Stack<Node> stack) {
        Node curr = node;
        while (curr != null){
            stack.push(curr);
            curr = curr.left;
        }
    }

    public static void main(String args[]){
        Node n1 = new Node();
        Node n2 = new Node();
        Node n3 = new Node();
        Node n4 = new Node();
        Node n5 = new Node();
        Node n6 = new Node();
        Node n7 = new Node();
        Node n8 = new Node();
        Node n9 = new Node();

        n6.data = 6;
        n6.left = n5;
        n6.right = n8;

        n5.data = 5;
        n5.left = n4;
        n5.right = n2;

        n4.data = 4;

        n2.data = 2;
        n2.left = n1;
        n2.right = n3;

        n1.data = 1;
        n3.data = 3;

        n8.data = 8;
        n8.left = n7;
        n8.right = n9;

        n7.data = 7;
        n9.data = 9;

        List<Integer> result = inOrderNoRecursion(n6);
        for (int i: result){
            System.out.println(i);
        }

        InOrderTraversalRecursion(n6);
    }
}
