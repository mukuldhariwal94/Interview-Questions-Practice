package com.bebetteratjava.miscellaneous;

import java.util.*;

/**
 * Created by Praveen Banthia on 11/1/2017.
 */
public class KthFrequentWords
{
    public static String kthMostFreqWord(String[] string,int k){
        Map<String,Integer> wordCount = new HashMap<String,Integer>();
        for(String word: string){
            if(!wordCount.containsKey(word)){
                wordCount.put(word,1);
            }else{
                wordCount.put(word,wordCount.get(word)+1);
            }
        }

        List<Map.Entry> freqList = new ArrayList<Map.Entry>(wordCount.entrySet());

        Collections.sort(freqList, new Comparator<Map.Entry>() {
            public int compare(Map.Entry e1, Map.Entry e2) {
                Integer v1 = (Integer) e1.getValue();
                Integer v2 = (Integer) e2.getValue();
                return -1*v1.compareTo(v2);
            }
        });

        if(freqList.size() > k){
            return (String) freqList.get(k).getKey();
        }

        return null;
    }

    public static void main(String args[]){
        String[] s1 = {"I","AM","AM","SAM","SAM","SAM","WHY","DO"};

        String output = kthMostFreqWord(s1,4);
        System.out.println(output);
    }
}
