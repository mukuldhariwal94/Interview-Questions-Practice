package com.bebetteratjava.datastructures.trees;

import java.util.Stack;

/**
 * Created by Praveen Banthia on 11/15/2017.
 */
public class LowestCommonAncestor {

    private class Node{
        Node left;
        Node right;
        int data;

        public Node(int data){
            this.data = data;
        }
    }

    Node root;

    public void insertInAsBST(int data){
        if(root == null){
            root = new Node(data);
        }else{
            insertInAsBST(root,data);
        }
    }

    private Node insertInAsBST(Node node,int data) {
        if(node == null){
            node = new Node(data);
            return node;
        }

        if(node.data > data){
            node.left = insertInAsBST(node.left,data);
        }else{
            node.right = insertInAsBST(node.right,data);
        }
        return node;
    }

    public Node lowestCommonAncestor(Node n1,Node n2){
        Stack<Node> n1Stack = nodePath(n1,root);
        Stack<Node> n2Stack = nodePath(n2,root);

        if(n1Stack == null || n2Stack == null){
            return null;
        }

        Node lca = null;

        while (n1Stack.peek().equals(n2Stack.peek())){
            n1Stack.pop();
            lca =  n2Stack.pop();
        }

        return lca;
    }

    public Stack<Node> nodePath(Node node,Node tree){

        if(tree == null){
            return null;
        }

        if(tree.equals(node)){
            Stack<Node> nodeStack = new Stack<Node>();
            nodeStack.push(node);
            return nodeStack;
        }

        Stack<Node> leftPath = nodePath(node,tree.left);
        Stack<Node> rightPath = nodePath(node,tree.right);

        if(leftPath != null){
            leftPath.push(tree);
            return leftPath;
        }

        if(rightPath != null){
            rightPath.push(tree);
            return rightPath;
        }

        return null;
    }

    public static void main(String args[]){
        LowestCommonAncestor lca = new LowestCommonAncestor();
        lca.insertInAsBST(2);
        lca.insertInAsBST(1);
        lca.insertInAsBST(4);
        lca.insertInAsBST(3);
        lca.insertInAsBST(5);

        Node commonAncestor = lca.lowestCommonAncestor(lca.root.right.left,lca.root.right.right);
        System.out.println(commonAncestor.data);

    }
}
