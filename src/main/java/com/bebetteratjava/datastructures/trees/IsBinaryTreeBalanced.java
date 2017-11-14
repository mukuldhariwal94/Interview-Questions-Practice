package com.bebetteratjava.datastructures.trees;

import org.omg.CORBA.INTERNAL;

/**
 * Created by Praveen Banthia on 11/5/2017.
 */
public class IsBinaryTreeBalanced {

    private static class Node{
        Node left;
        Node right;
        int data;
    }

    public static boolean isBinaryTreeBalanced(Node root){
        int heightOfRoot = balancedHeightOfNode(root);
        return heightOfRoot > 0;
    }

    private static int heightOfNode(Node n){
        if(n == null) return -1;
        int leftSubTreeHeight = heightOfNode(n.left);
        int rightSubTree = heightOfNode(n.right);

        if(leftSubTreeHeight > rightSubTree){
            return  leftSubTreeHeight + 1;
        }else{
            return rightSubTree + 1;
        }
    }

    private static int balancedHeightOfNode(Node n){
        if(n == null) return -1;
        int leftSubTreeHeight = balancedHeightOfNode(n.left);
        int rightSubTree = balancedHeightOfNode(n.right);

        if(leftSubTreeHeight ==  Integer.MIN_VALUE || rightSubTree == Integer.MIN_VALUE || Math.abs(leftSubTreeHeight-rightSubTree) > 1){
            return  Integer.MIN_VALUE;
        }

        if(leftSubTreeHeight > rightSubTree){
            return  leftSubTreeHeight+1;
        }else{
            return rightSubTree+1;
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
        Node n10 = new Node();
        Node n11 = new Node();
        Node n12 = new Node();
        Node n13 = new Node();

        n1.data = 1;
        n1.left = n2;
        n1.right = n3;

        n2.data = 2;
        n2.left = n4;
        n2.right = n5;

        n4.data = 4;
        n4.right = n8;

        n8.data = 8;

        n5.data = 5;

        n3.data = 3;
        n3.left = n6;
        n3.right = n7;

        n6.data = 6;
        n6.left = n9;

        n7.data = 7;

        n9.data =  9;
        n9.left = n13;

        n13.data= 13;


        if(isBinaryTreeBalanced(n1)){
            System.out.println("Tree is balanced");
        }else{
            System.out.println("Tree is not balanced");
        }
    }
}
