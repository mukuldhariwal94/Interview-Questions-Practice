package com.bebetteratjava.miscellaneous;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * Created by Praveen Banthia on 12/3/2017.
 */
public class AutoComplete {

    private class TrieNode{
        private boolean isWord;
        HashMap<Character,TrieNode> children;
        private String currWord;

        public TrieNode(String prefix){
            this.currWord = prefix;
            this.children = new HashMap<Character, TrieNode>();
        }
    }


    private TrieNode trie;


    public AutoComplete(String[] dict){
        trie = new TrieNode("");
        for(String s: dict){
            insertWord(s);
        }
    }

    private void insertWord(String s) {
        TrieNode curr = trie;
        for (int i=0;i<s.length();i++){
            if(!curr.children.containsKey(s.charAt(i))){
                //i +1 since substring is exclusive of last char
                curr.children.put(s.charAt(i), new TrieNode(s.substring(0,i+1)));
            }
            curr = curr.children.get(s.charAt(i));
            if(i == s.length() - 1){
                curr.isWord = true;
            }
        }
    }

    public List<String> getWordsForPrefix(String pre){
        List<String> result = new LinkedList<String>();

        TrieNode curr = trie;
        //this will propogate tree till we reach the prefix node if it cannot reach it returns null;
        for(char c: pre.toCharArray()){
            if(curr.children.containsKey(c)){
                curr =  curr.children.get(c);
            }else {
                return  result;
            }
        }

        findAllChildWords(curr,result);
        return result;
    }

    private void findAllChildWords(TrieNode curr, List<String> result) {
        if (curr.isWord){
            result.add(curr.currWord);
        }
        for (Character c : curr.children.keySet()){
            findAllChildWords(curr.children.get(c),result);
        }
    }

}
