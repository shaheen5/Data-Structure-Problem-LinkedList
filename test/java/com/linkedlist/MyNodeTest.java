package com.linkedlist;

import org.junit.Assert;
import org.junit.Test;

public class MyNodeTest {
    @Test
    public void given3Numbers_WhenLinked_ShouldPassLinkedListTest(){
        MyNode<Integer> myFirstNode=new MyNode<>(56);
        MyNode<Integer> mySecondNode=new MyNode<>(30);
        MyNode<Integer> myThirdNode=new MyNode<>(70);
        myFirstNode.setNext(mySecondNode);
        mySecondNode.setNext(myThirdNode);
        boolean result = myFirstNode.getNext().equals(mySecondNode) &&
                         mySecondNode.getNext().equals(myThirdNode);
        Assert.assertTrue(result);
    }
    @Test
    public void given3Numbers_WhenAddedToLinkedList_ShouldBeAddedToTop(){
        MyNode<Integer> myFirstNode=new MyNode<>(70);
        MyNode<Integer> mySecondNode=new MyNode<>(30);
        MyNode<Integer> myThirdNode=new MyNode<>(56);
        MyLinkedList myLinkedList=new MyLinkedList();
        myLinkedList.add(myFirstNode);
        myLinkedList.add(mySecondNode);
        myLinkedList.add(myThirdNode);
        myLinkedList.printMyNodes();
        boolean result = myLinkedList.head.equals(myThirdNode) &&
                         myLinkedList.head.getNext().equals(mySecondNode) &&
                         myLinkedList.tail.equals(myFirstNode);
        Assert.assertTrue(result);
    }
    @Test
    public void given3Numbers_WhenAppended_ShouldBeAddedToLast() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        MyLinkedList myLinkedList=new MyLinkedList();
        myLinkedList.add(myFirstNode);
        myLinkedList.append(mySecondNode);
        myLinkedList.append(myThirdNode);
        myLinkedList.printMyNodes();
        boolean result = myLinkedList.head.equals(myFirstNode) &&
                         myLinkedList.head.getNext().equals(mySecondNode) &&
                         myLinkedList.tail.equals(myThirdNode);
        Assert.assertTrue(result);
    }
    @Test
    public void given3Numbers_WhenInsertingSecondInBetween_ShouldPassLinkedLinkedResult() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        MyLinkedList myLinkedList=new MyLinkedList();
        myLinkedList.add(myFirstNode);
        myLinkedList.append(myThirdNode);
        myLinkedList.insert(myFirstNode,mySecondNode);
        myLinkedList.printMyNodes();
        boolean result = myLinkedList.head.equals(myFirstNode) &&
                         myLinkedList.head.getNext().equals(mySecondNode) &&
                         myLinkedList.tail.equals(myThirdNode);
        Assert.assertTrue(result);
    }
    @Test
    public void givenFirstElement_WhenDeleted_ShouldPassLinkedLinkedResult() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        MyLinkedList myLinkedList=new MyLinkedList();
        myLinkedList.add(myFirstNode);
        myLinkedList.append(mySecondNode);
        myLinkedList.append(myThirdNode);
        INode poppedNode = myLinkedList.pop();
        myLinkedList.printMyNodes();
        boolean result = poppedNode.equals(myFirstNode) &&
                         myLinkedList.head.equals(mySecondNode) &&
                         myLinkedList.tail.equals(myThirdNode);
        Assert.assertTrue(result);
    }
    @Test
    public void givenLastElement_WhenDeleted_ShouldPassLinkedLinkedResult() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        MyLinkedList myLinkedList=new MyLinkedList();
        myLinkedList.add(myFirstNode);
        myLinkedList.append(mySecondNode);
        myLinkedList.append(myThirdNode);
        INode poppedNode = myLinkedList.popLast();
        myLinkedList.printMyNodes();
        boolean result = poppedNode.equals(myThirdNode) &&
                         myLinkedList.head.equals(myFirstNode) &&
                         myLinkedList.tail.equals(mySecondNode);
        Assert.assertTrue(result);
    }
    @Test
    public void givenKey_WhenSearched_ShouldReturnNode_HavingSameKey() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        MyLinkedList myLinkedList=new MyLinkedList();
        myLinkedList.add(myFirstNode);
        myLinkedList.append(mySecondNode);
        myLinkedList.append(myThirdNode);
        INode searchedNode = myLinkedList.search(30);
        myLinkedList.printMyNodes();
        boolean result = myLinkedList.head.equals(myFirstNode) &&
                         myLinkedList.head.getNext().equals(mySecondNode) &&
                         myLinkedList.tail.equals(myThirdNode) &&
                         searchedNode.equals(mySecondNode);
        Assert.assertTrue(result);
    }
    @Test
    public void givenKey_WhenSearched_ShouldInsertNodeAfterIt() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        MyNode<Integer> myFourthNode = new MyNode<>(40);
        MyLinkedList myLinkedList=new MyLinkedList();
        myLinkedList.add(myFirstNode);
        myLinkedList.append(mySecondNode);
        myLinkedList.append(myThirdNode);
        INode searchedNode = myLinkedList.search(30);
        myLinkedList.insert(searchedNode,myFourthNode);
        myLinkedList.printMyNodes();
        boolean result = myLinkedList.head.equals(myFirstNode) &&
                         myLinkedList.head.getNext().equals(mySecondNode) &&
                         mySecondNode.getNext().equals(myFourthNode) &&
                         myLinkedList.tail.equals(myThirdNode);
        Assert.assertTrue(result);
    }
    @Test
    public void givenKey_WhenSearched_ShouldDeleteNodeHavingKey_AndReturnListSize() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(40);
        MyNode<Integer> myFourthNode = new MyNode<>(70);
        MyLinkedList myLinkedList=new MyLinkedList();
        myLinkedList.add(myFirstNode);
        myLinkedList.append(mySecondNode);
        myLinkedList.append(myThirdNode);
        myLinkedList.append(myFourthNode);
        myLinkedList.delete(40);
        myLinkedList.printMyNodes();
        int listSize = myLinkedList.size();
        Assert.assertEquals(3,listSize);
    }
    @Test
    public void given4Numbers_WhenAddedToList_ShouldAddNodes_InAscendingOrder(){
        MyNode<Integer> myFirstNode=new MyNode<>(56);
        MyNode<Integer> mySecondNode=new MyNode<>(30);
        MyNode<Integer> myThirdNode=new MyNode<>(40);
        MyNode<Integer> myFourthNode=new MyNode<>(70);
        SortedLinkedList sortedLinkedList = new SortedLinkedList();
        sortedLinkedList.add(myFirstNode);
        sortedLinkedList.add(mySecondNode);
        sortedLinkedList.add(myThirdNode);
        sortedLinkedList.add(myFourthNode);
        sortedLinkedList.displayNodesInList();
        boolean result = sortedLinkedList.head.equals(mySecondNode) &&
                         sortedLinkedList.head.getNext().equals(myThirdNode) &&
                         myThirdNode.getNext().equals(myFirstNode) &&
                         myFirstNode.getNext().equals(myFourthNode);
        Assert.assertTrue(result);
    }
}