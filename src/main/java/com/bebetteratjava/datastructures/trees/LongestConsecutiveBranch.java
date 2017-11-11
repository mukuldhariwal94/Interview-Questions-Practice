package com.bebetteratjava.datastructures.trees;

import java.util.Map;

/**
 * Created by Praveen Banthia on 11/7/2017.
 */
public class LongestConsecutiveBranch {

    //TODO find the level/height of the tree problem

    //TODO return the integers in the longest consecutive branch

    private static class Node{
        Node left;
        Node right;
        int data;
    }

    public static int longestConBranch(Node root){
        return Math.max(longestConBranch(root.left,root.data,1),longestConBranch(root.right,root.data,1));
    }

    private static int longestConBranch(Node currNode,int parentNodeData,int currLength){
        if(currNode == null){
            return currLength;
        }
        int maxLength=currLength;
        if(currNode.data == parentNodeData+1){
            int leftLength = longestConBranch(currNode.left,currNode.data,currLength+1);
            int rightLength = longestConBranch(currNode.right,currNode.data,currLength+1);
            maxLength = Math.max(leftLength,rightLength);
        }else{
            int newLeftLength = longestConBranch(currNode.left,currNode.data,1);
            int newRightLength = longestConBranch(currNode.right,currNode.data,1);
            int maxOfNewLength = Math.max(newLeftLength,newRightLength);
            maxLength = Math.max(maxLength,maxOfNewLength);
        }
        return maxLength;
    }

    public static void main(String args[]){
        Node n1 = new Node();
        Node n2 = new Node();
        Node n3 = new Node();
        Node n4 = new Node();
        Node n5 = new Node();
        Node n6 = new Node();
        Node n7 = new Node();

        n1.data = 4;
        n1.left = n2;
        n1.right = n3;

        n2.data = 1;
//        n2.left = n4;
//        n2.right = n5;

        n3.data = 2;
        n3.left = n6;
        n3.right = n7;

//        n4.data = 1;
//
//        n5.data = 2;
//
        n6.data = 1;
//
        n7.data = 3;

        int maxConLen = longestConBranch(n1);
        System.out.println("Max Longest Branch:"+maxConLen);
    }
}
;