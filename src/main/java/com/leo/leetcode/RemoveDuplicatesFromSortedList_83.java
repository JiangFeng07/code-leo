package com.leo.leetcode;

/**
 * Created by lionel on 17/12/12.
 */
public class RemoveDuplicatesFromSortedList_83 {
    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return head;
        }
        ListNode cur = head.next;
        ListNode prev = head;
        while (true) {
            ListNode next = cur.next;
            if (cur.next == null) {
                if (cur.val == prev.val) {
                    prev.next = null;
                }
                break;
            }
            if (cur.val == prev.val) {
                prev.next = next;
            } else {
                prev = cur;
            }
            cur = cur.next;
        }
        return head;
    }

    public static void main(String[] args) {
        int[] elements = {1, 1};
        ListNode root = ListNode.buildListFromArray(elements);
        System.out.println(root);
        System.out.println(deleteDuplicates(root));
    }
}
