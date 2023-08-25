package com.demo;

import com.demo.Node;
import com.demo.Queue;
import com.demo.Stack;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Stack stack=new Stack();
        Queue queue=new Queue();
        System.out.println("tescase1: melihat stack kosong atau tidak");
        System.out.println(stack.hasPop());
        System.out.println("tascase2: pop value");
        System.out.println(stack.pop());
        stack.hasPop();
        stack.push(0);
        stack.pop();
        


    }
}