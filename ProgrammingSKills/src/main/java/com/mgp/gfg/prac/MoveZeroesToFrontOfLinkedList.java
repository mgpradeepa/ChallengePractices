package com.mgp.gfg.prac;

public class MoveZeroesToFrontOfLinkedList {
    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(3);
        Node n3 = new Node(0);
        n1.next = n2;
        n2.next = n3;
        n3.next = null;

        Node head = n1;

        Node res = moveZeroes(head);

        


    }
    public static Node moveZeroes(Node head){
        //Your Code here.

        Node cur = head;

        while(cur != null  && head.next != null){
            if(cur.data == 0) {
                Node newhead = cur;
                newhead.next = cur.next;

                cur = cur.next;

            }

            cur = cur.next;

        }
        return cur;
    }
//     return cur;
}






class Node{
    int data;
    Node next;
    Node(int d){
        data=d;
        next=null;
    }
}

