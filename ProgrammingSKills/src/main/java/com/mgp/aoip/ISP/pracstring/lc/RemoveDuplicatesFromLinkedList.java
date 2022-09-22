package com.mgp.aoip.ISP.pracstring.lc;

import com.mgp.gfg.prac.gts.Node;

public class RemoveDuplicatesFromLinkedList {
    private static Node removeDuplicates(Node head) {
        if(head == null || head.next == null) return head;

        head.next = removeDuplicates(head.next);
        return head.data == head.next.data ? head.next : head;
    }

    public static void main(String[] args) {
        Node head = new Node(2);
        head.next = new Node(2);
        head.next.next = new Node(3);
        Node result = removeDuplicates(head);
        while(result != null) {
            System.out.println(result.data);
            result = result.next;
        }
    }
}
