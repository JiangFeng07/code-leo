package com.leo.leetcode;

/**
 * Created by lionel on 17/12/11.
 */
public class ListNode {
    int val;
    ListNode next;

    public ListNode() {
    }

    public ListNode(int x) {
        val = x;
    }


    public static ListNode buildListFromArray(int[] elements) {
        if (elements.length == 0) {
            return null;
        }
        ListNode root = new ListNode(-1);
        ListNode tmp = root;
        for (int element : elements) {
            ListNode node = new ListNode(element);
            tmp.next = node;
            tmp = node;
        }
        return root.next;
    }

    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }
}
