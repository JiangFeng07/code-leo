package com.leo.JianzhiOffer;

import java.util.Stack;

/**
 * Created by lionel on 18/2/9.
 */
public class MyQueue<T> {
    Stack<T> stack = new Stack<>();
    Stack<T> helpStack = new Stack<>();

    public void appendTail(T t) {
        stack.add(t);
    }

    public T deleteHead() {
        if (helpStack.size() > 0) {
            return helpStack.pop();
        }
        if (stack.size() <= 0) {
            return null;
        }
        while (stack.size() > 0) {
            helpStack.add(stack.pop());
        }
        return helpStack.pop();
    }

    public static void main(String[] args) {
        MyQueue<String> myQueue = new MyQueue<>();
        myQueue.appendTail("a");
        System.out.println(myQueue.deleteHead());

        myQueue.appendTail("b");
        myQueue.appendTail("c");
        System.out.println(myQueue.deleteHead());
        System.out.println(myQueue.deleteHead());
    }
}
