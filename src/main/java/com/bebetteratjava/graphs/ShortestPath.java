package com.bebetteratjava.graphs;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by Praveen Banthia on 11/20/2017.
 */
public class ShortestPath {
    public static class  Node{
        LinkedList<Node> connectingNodes = new LinkedList<Node>();
        int data;

    }

    public static LinkedList<Node> shortestPathBetweenNodes(Node n1,Node n2){
        Queue<Node> queue = new LinkedList<Node>();
        HashMap<Node,Node> parentNode = new HashMap<Node, Node>();
        queue.add(n1);
        parentNode.put(n1,null);
        while (!queue.isEmpty()){
            Node currNode = queue.poll();
            if(currNode.equals(n2)){
                break;
            }
            for (Node childNode: currNode.connectingNodes){
                if(!parentNode.containsKey(childNode)) {
                    parentNode.put(childNode, currNode);
                    queue.add(childNode);
                }
            }
        }

        //This prints the path from b to a which is fine but not the best solution
        if(parentNode.containsKey(n2)){
            LinkedList<Node> path = new LinkedList<Node>();
            Node prev = n2;
            while (prev != null){
                path.add(prev);
                prev = parentNode.get(prev);
            }
            return path;
        }

        //This prints path from a to b. Pushing latest element to top always pushes the remaining down in order of entry.
        if(parentNode.containsKey(n2)){
            LinkedList<Node> path = new LinkedList<Node>();
            Node curr = n2;
            while (curr != null){
                path.add(0,curr);
                curr = parentNode.get(curr);
            }
            return path;
        }
        return null;
    }

    public static void main(String args[]){
        Node n1 = new Node();
        Node n2 = new Node();
        Node n3 = new Node();
        Node n4 =  new Node();
        Node n5 = new Node();

        n1.data = 1;
        n1.connectingNodes.add(n2);

        n2.data = 2;
        n2.connectingNodes.add(n5);

        n5.data = 5;
        n5.connectingNodes.add(n4);

        n4.data = 4;
        n4.connectingNodes.add(n1);
        n4.connectingNodes.add(n3);

        n3.data = 3;

        List<Node> shortstPath = shortestPathBetweenNodes(n2,n3);
        for (Node node:shortstPath){
            System.out.println(node.data);
        }
    }
}
