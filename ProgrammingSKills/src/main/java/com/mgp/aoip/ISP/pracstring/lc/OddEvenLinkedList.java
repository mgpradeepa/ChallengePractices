package com.mgp.aoip.ISP.pracstring.lc;

public class OddEvenLinkedList {

    public static void main(String[] args) {
        ListNode l5 = new ListNode(5);
        ListNode l4  = new ListNode(4, l5);
        ListNode l3 = new ListNode(3, l4);
        ListNode l2 = new ListNode(2,l3);
        ListNode l1 = new ListNode(1,l2);
        ListNode result = oddEvenList(l1);
        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }

    }

    private static  ListNode oddEvenList(ListNode head) {
        ListNode odd = head;
        ListNode even;
        if(head != null) {
            even = head.next;

        }
        else {
            return head;
        }

        if(even == null) return odd;

        ListNode evenFirst = head.next;
        while(even != null && even.next!= null) {
            odd.next = odd.next.next;
            even.next = even.next.next;
            odd = odd.next;
            even = even.next;

        }
        odd.next = evenFirst;

        return head;
    }
}

 class ListNode {
   int val;
   ListNode next;
   ListNode(int val) { this.val = val; }
   ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
