package com.mgp.aoip.ISP.pracstring.lc;

import com.mgp.generals.ListNode;

public class LinkedListCycle {
    private static boolean hasCycle(ListNode head) {
        //check of head == null
        if(head == null) {
            return false;

        }
        ListNode walk = head;
        ListNode run = head;

        while(run.next != null && run.next.next != null ){
            walk = walk.next;
            run = run.next.next;
            if(walk == run) { //  if there is a cycle some where walk will have to meet run.
                return true;
            }

        }
        return false;
    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        n1.next =n2;
        n2.next = n1;

        System.out.println(hasCycle(n1));
    }
}
