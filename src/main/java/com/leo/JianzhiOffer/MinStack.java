package com.leo.JianzhiOffer;

import java.util.Iterator;
import java.util.Stack;

/**
 * Created by lionel on 18/2/11.
 */
public class MinStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(5);
        System.out.println(stack.get(2));

        Iterator<Integer> iterator = stack.iterator();
        int min = Integer.MAX_VALUE;
        while (iterator.hasNext()) {
            int tmp = iterator.next();
            if (tmp < min) {
                min = tmp;
            }
        }
        System.out.println(min);
    }
}
