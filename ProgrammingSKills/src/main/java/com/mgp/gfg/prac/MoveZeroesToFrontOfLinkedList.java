package com.mgp.gfg.prac;

import com.mgp.generals.ListNode;
public class MoveZeroesToFrontOfLinkedList {
    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(3);
        ListNode n3 = new ListNode(0);
        n1.next = n2;
        n2.next = n3;
        n3.next = null;

        ListNode head = n1;

        ListNode res = moveZeroes(head);

        


    }
    public static ListNode moveZeroes(ListNode head){
        //Your Code here.

        ListNode cur = head;

        while(cur != null  && head.next != null){
            if(cur.data == 0) {
                ListNode newhead = cur;
                newhead.next = cur.next;

                cur = cur.next;

            }

            cur = cur.next;

        }
        return cur;
    }
//     return cur;
}








