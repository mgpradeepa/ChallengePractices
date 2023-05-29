package com.mgp.gfg.prac;

import com.mgp.generals.ListNode;

public class SwapNodesInPairs {

    // Swap the first - second, third - forth nodes.

     // 1 -> 2 -> 3 -> 4
    // result = 2 -> 1 -> 4 -> 3

    public static ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }

        ListNode second = head.next;
        ListNode third = second.next;

        second.next = head;
        head.next = swapPairs(third);
        return second;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);


        ListNode result = swapPairs(head);

        System.out.println("Original -> " );
        ListNode.printAll(head);

        System.out.println("AFter swap -> " );
        ListNode.printAll(result);



    }

}
