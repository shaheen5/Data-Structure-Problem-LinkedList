package com.linkedlist;

public class MyLinkedList {
    public INode head;
    public INode tail;

    public void MyLinkedList(){
        this.head=null;
        this.tail=null;
    }
    //method to add new node to linked list
    public void add(INode newNode) {
        if(this.tail == null) {
            this.tail=newNode;
        }
        if(this.head == null) {
            this.head=newNode;
        }
        else{
            INode tempNode = this.head;
            this.head=newNode;
            this.head.setNext(tempNode);
        }
    }
    // method to display node data
    public void printMyNodes() {
        StringBuffer myNodes = new StringBuffer("My Nodes : ");
        INode tempNode = head;
        while(tempNode.getNext() != null){
            myNodes.append(tempNode.getKey());
            if(!tempNode.equals(tail))
                myNodes.append("->");
            tempNode = tempNode.getNext();
        }
        myNodes.append(tempNode.getKey());
        System.out.println(myNodes);
    }

    //method to append node at end
    public void append(INode newNode) {
        if(this.head == null) {
            this.head=newNode;
        }
        if(this.tail == null) {
            this.tail=newNode;
        }
        else{
            this.tail.setNext(newNode);
            this.tail = newNode ;
        }
    }

    //method to insert node between two nodes
    public void insert(INode myNode, INode newNode) {
        INode tempNode = myNode.getNext();
        myNode.setNext(newNode);
        newNode.setNext(tempNode);
    }
    //method to delete(pop) first element from the list
    public INode pop() {
        INode tempNode=this.head;
        this.head=head.getNext();
        return tempNode;
    }
    //method to delete last element 
    public INode popLast() {
        INode tempNode=this.head;
        while(!tempNode.getNext().equals(tail)){
            tempNode=tempNode.getNext();
        }
        this.tail=tempNode;
        tempNode=tempNode.getNext();
        return tempNode;
    }
    //method to search a node having given key value
    public INode search(Integer key) {
        INode tempNode=head;
        INode searchedNode = null;
        while(tempNode != null && tempNode.getNext() != null){
            if(tempNode.getKey().equals(key))
                searchedNode=tempNode;
            tempNode=tempNode.getNext();
        }
        return searchedNode;
    }
    //method to delete a node having given key value
    public void delete(Integer key) {
        INode currentNode=this.head;
        INode previousNode=this.head;
        if(currentNode.getKey() == key) {
            this.head = currentNode.getNext();
            return;
        }
        while(!(currentNode.getKey() == key)){
            previousNode=currentNode;
            currentNode=currentNode.getNext();
        }
        previousNode.setNext(currentNode.getNext());
    }
    //method to find size of linked list
    public int size() {
        INode tempNode = this.head;
        int count = 0;
        while(tempNode != null){
            tempNode=tempNode.getNext();
            count++;
        }
        return count;
    }
}