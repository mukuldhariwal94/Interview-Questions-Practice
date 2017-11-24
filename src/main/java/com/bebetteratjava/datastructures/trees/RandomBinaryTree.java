package com.bebetteratjava.datastructures.trees;

import java.util.Stack;

/**
 * Created by Praveen Banthia on 11/23/2017.
 */
public class RandomBinaryTree {
    private class Node{
        Node left;
        Node right;
        int data;
        int noOfChildren;

        public Node(int data){
            this.data = data;
        }
    }

    Node root;
    int size;

    public void insertNode(int data){
        if(root == null){
            root = new Node(data);
        }else{
            insertNode(root,data);
        }
        size++;
    }

    public Node insertNode(Node node,int data){
        if(node == null){
            return new Node(data);
        }
        if(data > node.data){
            node.right = insertNode(node.right,data);
        }else{
            node.left = insertNode(node.left,data);
        }
        node.noOfChildren++;
        return node;
    }

    public int getRandomNodeDFS(int count){
        if(count > size || count <=0) throw  new IllegalArgumentException("Count greater than or lesser than size of tree ");
        Stack<Node> dfs = new Stack<Node>();
        dfs.push(root);
        int tempCount = 0;
        Node randNode = null;
        while (tempCount!= count){
            randNode = dfs.pop();
            tempCount++;
            if(randNode.right != null) {
                dfs.push(randNode.right);
            }
            if(randNode.left!=null) {
                dfs.push(randNode.left);
            }
        }
        return randNode.data;
    }

    public int getRandomNodeUsingChildren(int count){
        if(count >= size || count <=0) throw  new IllegalArgumentException("Count greater than or lesser than size of tree ");
        return getRandomNodeUsingChildren(root,count).data;
    }

    public Node getRandomNodeUsingChildren(Node n,int count){
        int curIndexPos = currIndex(n.left);
        if(count == curIndexPos){
            return n;
        }
        if(count < curIndexPos){
            return getRandomNodeUsingChildren(n.left,count);
        }else {
            return getRandomNodeUsingChildren(n.right,count - curIndexPos - 1);
        }
    }

    public int currIndex(Node n){
        if (n == null) return 0;
        return n.noOfChildren+1;
    }

    public static void main(String args[]){
        RandomBinaryTree rbt = new RandomBinaryTree();
        rbt.insertNode(4);
        rbt.insertNode(2);
        rbt.insertNode(6);
        rbt.insertNode(1);
        rbt.insertNode(3);
        rbt.insertNode(5);
        rbt.insertNode(7);

        System.out.println(rbt.getRandomNodeDFS(7));
        System.out.println(rbt.getRandomNodeUsingChildren(6));

    }
}
