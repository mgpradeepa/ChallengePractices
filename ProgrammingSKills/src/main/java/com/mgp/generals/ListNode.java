package com.mgp.generals;

public class ListNode {
        public int data;
        public ListNode next;
        public ListNode(int d)  { data = d;  next = null; }

        public int getData() {
                return data;
        }

        public static void printAll(ListNode listNode) {
                while (listNode != null) {
                        System.out.print(listNode.getData() +" -> " );
                        listNode  = listNode.next;
                }
        }
}
