package com.demo;
// Source code is decompiled from a .class file using FernFlower decompiler.
public class LinkedList {
    private Node first = null;
    private Node last = null;
 
    public LinkedList() {
    }
 
    public void add(int var1) {
       Node var2 = new Node(var1);
       if (this.first == null) {
          this.first = var2;
          this.last = var2;
       } else {
          this.last.setNext(var2);
          var2.setPrev(this.last);
          this.last = var2;
       }
 
    }
 
    public void insert(int var1, int var2) {
       Node var3 = new Node(var1);
       if (var2 == 0) {
          var3.setNext(this.first);
          this.first.setPrev(var3);
          this.first = var3;
       } else {
          Node var4 = this.getNodeAtIndex(var2);
          Node var5 = var4.getPrev();
          var5.setNext(var3);
          var3.setPrev(var5);
          var3.setNext(var4);
          var4.setPrev(var3);
       }
 
    }
 
    public void remove(int var1) {
       Node var2 = this.getNodeAtIndex(var1);
       Node var3 = var2.getPrev();
       Node var4 = var2.getNext();
       if (var3 != null) {
          var3.setNext(var4);
       } else {
          this.first = var4;
       }
 
       if (var4 != null) {
          var4.setPrev(var3);
       } else {
          this.last = var3;
       }
 
    }
 
    public void swap(int var1, int var2) {
       Node var3 = this.getNodeAtIndex(var1);
       Node var4 = this.getNodeAtIndex(var2);
       int var5 = var3.getValue();
       var3.value = var4.getValue();
       var4.value = var5;
    }
 
    public int get(int var1) {
       Node var2 = this.getNodeAtIndex(var1);
       return var2.getValue();
    }
 
    private Node getNodeAtIndex(int var1) {
       Node var2 = this.first;
 
       for(int var3 = 0; var3 < var1; ++var3) {
          if (var2 == null) {
             throw new IndexOutOfBoundsException("IOOB");
          }
 
          var2 = var2.getNext();
       }
 
       if (var2 == null) {
          throw new IndexOutOfBoundsException("IOOB");
       } else {
          return var2;
       }
    }
 }
 