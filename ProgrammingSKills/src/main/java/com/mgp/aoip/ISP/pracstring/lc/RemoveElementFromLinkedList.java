package com.mgp.aoip.ISP.pracstring.lc;

import com.mgp.generals.ListNode;

public class RemoveElementFromLinkedList {
    private static ListNode removeElement(ListNode head, int val) {
        if(head == null ) return null;

        head.next = removeElement(head.next,val); // current will be evaluated with next
        return head.data == val? head.next: head; // data of the current will be checked to that of the head.
        // recursively goes with the next elements if not found.
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        ListNode result = removeElement(head, 2);
        while(result != null) {
            System.out.println(result.data);
            result = result.next;
        }
    }
}
