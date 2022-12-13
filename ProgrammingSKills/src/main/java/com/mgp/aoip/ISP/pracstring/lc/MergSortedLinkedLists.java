package com.mgp.aoip.ISP.pracstring.lc;

import com.mgp.generals.ListNode;

public class MergSortedLinkedLists {
    private static ListNode mergeLists(ListNode list1, ListNode list2) {
        if(list1 == null) return list2;
        if(list2 == null) return list1;
        if(list1.data < list2.data) {
            list1.next = mergeLists(list1.next, list2);
            return list1;
        }
        else {
            list2.next = mergeLists(list1, list2.next);
            return list2;
        }
    }
    public static void main (String... args) {
        ListNode list1 = new ListNode(1);
        ListNode l12 = new ListNode(2);
        ListNode l13 = new ListNode(3);
        ListNode l20 = new ListNode(2);
        ListNode l21 = new ListNode(5);

        list1.next = l12;
        l12.next = l13;
        l13.next = null;
        l20.next = l21;
        l21.next = null;
        ListNode result = mergeLists(list1, l20);
        while(result != null ) {
            System.out.println(result.data);
            result  = result.next;
        }
    }
}
