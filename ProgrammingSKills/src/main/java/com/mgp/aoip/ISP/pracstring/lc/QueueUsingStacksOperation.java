package com.mgp.aoip.ISP.pracstring.lc;

import java.util.Stack;

public class QueueUsingStacksOperation {
    // class Queue should be implemented such that stack is the underneath implementation of a Queue.
    // operations of stack like, push, pop, isEmpty, peek should be implemented and used.


 static class MyQueue {
     Stack<Integer> inp = new Stack<>();
     Stack<Integer> op = new Stack<>();

     MyQueue() {

     }

     private void push(int x) {
         inp.push(x);
     }

     private int pop() {
         peek();
         return op.pop();
     }

     private int peek() {
         if(op.isEmpty()) {
             while(!inp.isEmpty()) {
                 op.push(inp.pop());
             }
         }
         return op.peek();
     }

     private boolean isEmpty() {
         return inp.isEmpty() && op.isEmpty();
     }


 }

    public static void main(String[] args) {
        MyQueue queue = new MyQueue();
        queue.push(10);
        queue.push(100);
        queue.push(1000);
        System.out.println("peek-->" +queue.peek());
        System.out.println("pop --> "+ queue.pop());
        while(!queue.isEmpty()) {
            System.out.println(queue.pop());
        }

    }
}
