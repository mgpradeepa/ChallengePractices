package com.mgp.aoip.ISP.pracstring.lc;

import com.mgp.gfg.prac.gts.Node;

public class MergSortedLinkedLists {
    private static Node mergeLists(Node list1, Node list2) {
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
        Node list1 = new Node(1);
        Node l12 = new Node(2);
        Node l13 = new Node(3);
        Node l20 = new Node(2);
        Node l21 = new Node(5);

        list1.next = l12;
        l12.next = l13;
        l13.next = null;
        l20.next = l21;
        l21.next = null;
        Node result = mergeLists(list1, l20);
        while(result != null ) {
            System.out.println(result.data);
            result  = result.next;
        }
    }
}
