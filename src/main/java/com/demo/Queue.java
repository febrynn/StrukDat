package com.demo;

import com.demo.Node;

public class Queue {
    private Node first;
    private Node last;

    public Queue() {
        this.first = null;
        this.last = null;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void enqueue(int value) {
        Node newNode = new Node(value);
        if (isEmpty()) {
            first = newNode;
            last = newNode;
        } else {
            last.setNext(newNode);
            last = newNode;
        }
    }

    public int dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }

        int dequeuedValue = first.getValue();
        first = first.getNext();


        if (first == null) {
            last = null; // Jika queue kosong setelah dequeue
        }

        return dequeuedValue;
    }

    public void swap(int pos1, int pos2) {
        if (pos1 < 0 || pos2 < 0) {
            System.out.println("Posisi harus positif");
            return;
        }
    
        if (pos1 == pos2) {
            System.out.println("\nPosisi sama sehingga tidak ada perubahan");
            return;
        }
    
        Node prev1 = null;
        Node current1 = first;
        for (int i = 0; i < pos1 && current1 != null; i++) {
            prev1 = current1;
            current1 = current1.getNext();
        }
    
        Node prev2 = null;
        Node current2 = first;
        for (int i = 0; i < pos2 && current2 != null; i++) {
            prev2 = current2;
            current2 = current2.getNext();
        }
        if (current1 == null || current2 == null) {
            throw new IllegalArgumentException("Posisi diluar jumlah index");
        }
    
        // Pertukaran nilai di posisi pertama dan kedua
        if (prev1 != null) {
            prev1.setNext(current2);
        } else {
            first = current2;
        }
    
        if (prev2 != null) {
            prev2.setNext(current1);
        } else {
            first = current1;
        }
    
        Node temp = current1.getNext();
        current1.setNext(current2.getNext());
        current2.setNext(temp);
    }
    
 
}


