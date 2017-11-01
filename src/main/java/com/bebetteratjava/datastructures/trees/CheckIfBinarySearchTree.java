package com.bebetteratjava.datastructures.trees;

/**
 * Created by Praveen Banthia on 10/31/2017.
 */
public class CheckIfBinarySearchTree {

    public static class TreeNode{
        TreeNode left;
        TreeNode right;
        int data;
    }

    public static boolean isABST(TreeNode root){
        return isABST(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }

    private static boolean isABST(TreeNode node,int leftMin,int rightMax){
        if(node == null) return  true;

        if(node.left !=null && node.left.data > node.data){
            return false;
        }
        if(node.right != null && node.right.data <= node.data){
            return false;
        }

        if(node.data< leftMin || node.data > rightMax){
            return false;
        }

        return isABST(node.left,leftMin,node.data) && isABST(node.right,node.data,rightMax);
    }

    /*
                    4
                  /  \
                 2    5
                / \  / \
               1   3 5  6
     */
    public static void main(String args[]){
        TreeNode n1 = new TreeNode();
        TreeNode n2 = new TreeNode();
        TreeNode n3 = new TreeNode();
        TreeNode n4 = new TreeNode();
        TreeNode n5 = new TreeNode();
        TreeNode n5_2 = new TreeNode();
        TreeNode n6 = new TreeNode();

        n4.data = 4;
        n4.left = n2;
        n4.right = n5;

        n2.data = 2;
        n2.left = n1;
        n2.right = n3;

        n3.data = 3;
        n1.data = 1;

        n5.data = 5;
        n5.left = n5_2;
        n5.right = n6;

        n5_2.data = 5;
        n6.data = 6;

        if(isABST(n4)){
            System.out.println("This is  a BST");
        }else{
            System.out.println("This is not a BST");
        }
    }
}
