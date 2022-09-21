package com.mgp.aoip.ISP.pracstring.lc;

import com.mgp.gfg.prac.gts.Node;

public class RemoveElementFromLinkedList {
    private static Node removeElement(Node head, int val) {
        if(head == null ) return null;

        head.next = removeElement(head.next,val); // current will be evaluated with next
        return head.data == val? head.next: head; // data of the current will be checked to that of the head.
        // recursively goes with the next elements if not found.
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        Node result = removeElement(head, 2);
        while(result != null) {
            System.out.println(result.data);
            result = result.next;
        }
    }
}
