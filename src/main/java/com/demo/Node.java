package com.demo;

public class Node{
    protected int value;
    protected Node next;
    protected Node prev;

    public Node(int value){
        this.value=value;
        this.next=null;
        this.prev=null;
    }
    public void setNext(Node next){
        this.next = next;
    }

    public void setPrev(Node prev){
        this.prev = prev;
    }

    public Node getNext(){
        return next;
    }

    public Node getPrev(){
        return prev;
    }

    public int getValue(){
        return value;
    }
}