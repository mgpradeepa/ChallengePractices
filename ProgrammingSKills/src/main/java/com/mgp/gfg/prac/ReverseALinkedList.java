package com.mgp.gfg.prac;

import com.mgp.generals.ListNode;

public class ReverseALinkedList {
    public static void main(String[] args) {

        ListNode n1 = new ListNode(10);
        n1.next =  new ListNode(100);
        n1.next.next = new ListNode(300);


//        Node result = reverseALinkedList(n1);
        ListNode result = reversListRecursive(n1);
        while(result!= null) {
            System.out.println(result.data);
            result = result.next;
        }
    }

    private static ListNode reverseALinkedList(ListNode head) {
        // check for head == null or head.next == null
        if(head == null || head.next == null) {
            return head;
        }

        ListNode prevNode = head;
        ListNode curNode = head.next;

        while(curNode != null) {
            ListNode nextNode = curNode.next;
            curNode.next = prevNode;

            // upddate

            prevNode = curNode;
            curNode = nextNode;

        }

        head.next = prevNode;
        head = prevNode;

        return prevNode;


    }

    private static ListNode reversListRecursive(ListNode head) {
        if(head == null || head.next == null)
            return head;
        ListNode res = reversListRecursive(head.next);
        head.next.next = head;
        head.next = null;

        return res;

    }
}
