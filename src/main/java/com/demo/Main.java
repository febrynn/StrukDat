package com.demo;

import com.demo.Node;
import com.demo.Queue;
import com.demo.Stack;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Stack stack = new Stack();
        Queue queue = new Queue();
        System.out.println("Test Case 1: Melihat stack kosong atau tidak.");
        System.out.println(stack.hasPop());
        // System.out.println("Test Case 2: Pop value saat stack kosong, output throw
        // exception.");
        // System.out.println(stack.pop());
        System.out.println("Test Case 3: Push value 3 value ke stack.");
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(8);
        System.out.println("Values in stack: " + stackToString(stack));

        System.out.println("Test Case 4: Swap stack berdasar index.");
        stack.swap(0, 2);
        System.out.println(stack.toString());

        System.out.println("Test Case 5: Pop value dari stack sampai habis.");
        while (stack.hasPop()) {
            System.out.println("Sisa value: " + stackToString(stack));
            stack.pop();
            System.out.println("Masih bisa di pop?" + stack.hasPop());
            if (!stack.hasPop()) {
                System.out.println("Sudah habis");
            }
        }
    }

    public static String stackToString(Stack stack) {
        StringBuilder sb = new StringBuilder("[");
        Node current = stack.getFirst();
        while (current != null) {
            sb.append(current.getValue());
            current = current.getNext();
            if (current != null) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

}
