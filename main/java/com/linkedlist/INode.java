package com.linkedlist;

public interface INode<K extends Comparable<K>>{
    K getKey();
    public void setKey(K key);

    INode getNext();
    void setNext(INode next);

    int compareTo(INode<K> myNode);
}
