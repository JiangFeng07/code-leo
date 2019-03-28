package com.leo.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: lionel
 * @Date: 2019/3/23 17:34
 * @Version 1.0
 */
public class SortList {
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode mid = getMid(head);
        ListNode rightSortList = sortList(mid.next);
        mid.next = null;
        ListNode leftSortList = sortList(head);
        return mergeSortList(leftSortList, rightSortList);
    }

    private ListNode mergeSortList(ListNode head, ListNode head2) {
        if (head == null) {
            return head2;
        }
        if (head2 == null) {
            return head;
        }

        ListNode node = new ListNode(-1);
        ListNode cur = node;
        while (head != null && head2 != null) {
            if (head.val > head2.val) {
                cur.next = head2;
                head2 = head2.next;
            } else {
                cur.next = head;
                head = head.next;
            }
            cur = cur.next;
        }
        if (head != null) {
            cur.next = head;
        }
        if (head2 != null) {
            cur.next = head2;
        }
        return node.next;
    }

    private ListNode getMid(ListNode head) {
        ListNode p1 = head;
        ListNode p2 = head.next;
        while (p2 != null && p2.next != null) {
            p1 = p1.next;
            p2 = p2.next.next;
        }
        return p1;
    }

    public static void main(String[] args) {
        SortList sortList = new SortList();
        ListNode head = new ListNode(1);
        ListNode one = new ListNode(2);
        head.next = one;
        one.next = null;
        ListNode result = sortList.sortList(head);
        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }
}
