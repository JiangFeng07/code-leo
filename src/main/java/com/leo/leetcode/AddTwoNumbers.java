package com.leo.leetcode;

/**
 * Created by lionel on 2018/10/30.
 */
public class AddTwoNumbers {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        ListNode res = new ListNode(-1);
        ListNode p = res;
        int bit = 0;
        int value3 = 0;
        while (l1 != null && l2 != null) {
            value3 = (l1.val + l2.val + bit) % 10;
            bit = (l1.val + l2.val + bit) / 10;
            p.next = new ListNode(value3);
            p = p.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        while (l1 != null) {
            value3 = (l1.val + bit) % 10;
            bit = (l1.val + bit) / 10;
            p.next = new ListNode(value3);
            p = p.next;
            l1 = l1.next;
        }
        while (l2 != null) {
            value3 = (l2.val + bit) % 10;
            bit = (l2.val + bit) / 10;
            p.next = new ListNode(value3);
            p = p.next;
            l2 = l2.next;
        }
        if (bit!=0) {
            p.next=new ListNode(bit);
        }
        return res.next;
    }

    public static void main(String[] args) {
        int[] nums = {5};
        int[] nums2 = {5};
        ListNode l1 = ListNode.buildListFromArray(nums);
        ListNode l2 = ListNode.buildListFromArray(nums2);
        ListNode res = addTwoNumbers(l1, l2);
        System.out.println(res);
    }
}
