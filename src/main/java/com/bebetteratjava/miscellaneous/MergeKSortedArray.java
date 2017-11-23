package com.bebetteratjava.miscellaneous;

import java.util.PriorityQueue;

/**
 * Created by Praveen Banthia on 11/15/2017.
 */
public class MergeKSortedArray {

    //TODO merge sort

    private class QueueNode implements Comparable<QueueNode>{

        int arrayPos;
        int index;
        int val;

        public QueueNode(int arrayPos,int index,int val){
            this.arrayPos = arrayPos;
            this.index = index;
            this.val = val;
        }

        public int compareTo(QueueNode queueNode) {
            if(this.val > queueNode.val) return 1;
            else if(this.val<queueNode.val) return  -1;
            return  0;
        }
    }

    public int[] mergeKSortedArrays(int[][] arrays){
        PriorityQueue<QueueNode> pq = new PriorityQueue<QueueNode>();
        int size = 0;
        for(int i=0;i<arrays.length;i++){
            size+=arrays[i].length;
            if(arrays[i].length > 0) {
                pq.add(new QueueNode(i, 0, arrays[i][0]));
            }
        }
        int[] results = new int[size];
        for(int i=0;!pq.isEmpty();i++){
            QueueNode minElement = pq.poll();
            results[i] = minElement.val;
            int nextIndex = minElement.index + 1;
            if(nextIndex <arrays[minElement.arrayPos].length){
                pq.add(new QueueNode(minElement.arrayPos,nextIndex,arrays[minElement.arrayPos][nextIndex]));
            }
        }
        return results;
    }

    public static void main(String args[]){
        int[][] input = new int[][]{{1,4,7},{2,5,8},{3,6,9}};
        MergeKSortedArray mks = new MergeKSortedArray();
        int[] output = mks.mergeKSortedArrays(input);
        for(int i : output){
            System.out.println(i);
        }
    }
}
