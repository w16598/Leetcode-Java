package com.inuker.solution;

/**
 * Created by dingjikerbo on 2016/11/22.
 */

public class TrieNode {

    public TrieNode[] nodes;

    public String word;

    public TrieNode() {
        nodes = new TrieNode[26];
    }
}