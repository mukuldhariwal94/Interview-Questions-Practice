package com.bebetteratjava.graphs;

import java.util.*;

/**
 * Created by Praveen Banthia on 11/24/2017.
 */
public class BuildOrder {

    //TODO practice and understand what topological sort is

    public static List<Integer> findBuildOrder(int[][]  processes){
        Set<Integer> tempMarker = new HashSet<Integer>();
        Set<Integer> permMarker = new HashSet<Integer>();
        List<Integer> result = new LinkedList<Integer>();

        for(int i=0;i<processes.length;i++){
            if(!permMarker.contains(i)){
                visit(i,processes,tempMarker,permMarker,result);
            }
        }

        return result;
    }

    private static void visit(int i, int[][] processes, Set<Integer> tempMarker, Set<Integer> permMarker, List<Integer> result) {
        if(tempMarker.contains(i)){
            throw  new RuntimeException("There is cycle in this build invalid BUILD ORDER");
        }
        if(!permMarker.contains(i)) {
            tempMarker.add(i);
            for (int parents : processes[i]) {
                visit(parents, processes, tempMarker, permMarker, result);
            }
            tempMarker.remove(i);
            permMarker.add(i);
            result.add(i);
        }
    }

    public static void main(String args[]){
            int[][] input = new int[][]{{}, {0}, {0}, {1, 2},{3}};
            List<Integer> result  = findBuildOrder(input);
            for(int i:result){
                System.out.println(i);
            }
    }
}
