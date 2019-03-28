package com.leo.JianzhiOffer;

import java.util.Stack;

/**
 * Created by lionel on 18/1/19.
 */
public class StackPushPop {
    public static boolean IsPopOrder(int[] pushA, int[] popA) {
        Stack<Integer> stack = new Stack<Integer>();
        int i = 0;
        int j = 0;
        stack.push(pushA[i++]);
        while (j < popA.length) {
            while (popA[j] != stack.peek()) {
                if (i == pushA.length) {
                    return false;
                }
                stack.push(pushA[i++]);
            }
            j++;
            stack.pop();
        }
        return true;
    }

    public static void main(String[] args) {
        int[] pushA = new int[]{1, 2, 3, 4, 5};
        int[] popA = new int[]{4, 5, 3, 2, 1};
        int[] popB = new int[]{4, 3, 5, 1, 2};
        int[] popC = new int[]{3, 5, 4, 1, 2};
        System.out.println(IsPopOrder(pushA, popA));
        System.out.println(IsPopOrder(pushA, popB));
        System.out.println(IsPopOrder(pushA, popC));
    }
}
