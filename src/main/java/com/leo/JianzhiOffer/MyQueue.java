package com.leo.JianzhiOffer;

import java.util.Stack;

/**
 * Created by lionel on 18/2/9.
 */
public class MyQueue<T> {
    public static int evalRPN(String[] tokens) {
        if (tokens == null || tokens.length <= 0) {
            return 0;
        }

        Stack<String> stack = new Stack<String>();
        for (String token : tokens) {
            if (!"+".equals(token) && !"-".equals(token) &&
                    !"*".equals(token) && !"/".equals(token)) {
                stack.push(token);
            } else {
                int val1 = Integer.valueOf(stack.pop());
                int val2 = Integer.valueOf(stack.pop());
                if ("+".equals(token)) {
                    stack.push(String.valueOf(val1 + val2));
                }
                if ("-".equals(token)) {
                    stack.push(String.valueOf(val2 - val1));
                }
                if ("*".equals(token)) {
                    stack.push(String.valueOf(val1 * val2));
                }
                if ("/".equals(token)) {
                    stack.push(String.valueOf(val1 / val2));
                }
            }
        }

        return Integer.valueOf(stack.pop());
    }
}
