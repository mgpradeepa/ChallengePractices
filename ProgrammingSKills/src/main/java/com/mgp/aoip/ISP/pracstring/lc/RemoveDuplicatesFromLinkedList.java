package com.mgp.aoip.ISP.pracstring.lc;

import com.mgp.generals.ListNode;

public class RemoveDuplicatesFromLinkedList {
    private static ListNode removeDuplicates(ListNode head) {
        if(head == null || head.next == null) return head;

        head.next = removeDuplicates(head.next);
        return head.data == head.next.data ? head.next : head;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(2);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        ListNode result = removeDuplicates(head);
        while(result != null) {
            System.out.println(result.data);
            result = result.next;
        }
    }
}
