package com.leo.leetcode;

/**
 * @Author: lionel
 * @Date: 2019/3/26 00:27
 * @Version 1.0
 */
public class ReorderList {
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) {
            return;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode right = slow.next;

        slow.next = null;

        ListNode reverseRightNode = reverseNode(right);
        ListNode tmp;
        ListNode p = head;
        while (p != null && reverseRightNode != null) {
            tmp = p.next;
            p.next = reverseRightNode;
            p = tmp;
            tmp = reverseRightNode.next;
            reverseRightNode.next = p;
            reverseRightNode = tmp;
        }
    }


    private ListNode reverseNode(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode reverseHead = null;
        ListNode prevNode = null;
        ListNode cur = head;
        while (cur != null) {
            ListNode next = cur.next;
            if (next == null) {
                reverseHead = cur;
            }
            cur.next = prevNode;
            prevNode = cur;
            cur = next;
        }
        return reverseHead;
    }

    public static void main(String[] args) {
        ReorderList reorderList = new ReorderList();
        ListNode head = new ListNode(1);
        ListNode one = new ListNode(2);
        ListNode two = new ListNode(3);
        ListNode three = new ListNode(4);
        head.next = one;
        one.next = two;
        two.next = three;
        three.next = null;
        reorderList.reorderList(head);
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }


}
