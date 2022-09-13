package com.mgp.gfg.prac;

import com.mgp.gfg.prac.gts.Node;

public class ReverseALinkedList {
    public static void main(String[] args) {

        Node n1 = new Node (10);
        n1.next =  new Node(100);
        n1.next.next = new Node(300);


        Node result = reverseALinkedList(n1);
        while(result!= null) {
            System.out.println(result.data);
            result = result.next;
        }
    }

    private static Node reverseALinkedList(Node head) {
        // check for head == null or head.next == null
        if(head == null || head.next == null) {
            return head;
        }

        Node prevNode = head;
        Node curNode = head.next;

        while(curNode != null) {
            Node nextNode = curNode.next;
            curNode.next = prevNode;

            // upddate

            prevNode = curNode;
            curNode = nextNode;

        }

        head.next = prevNode;
        head = prevNode;

        return prevNode;


    }
}
