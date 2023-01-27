package com.mgp.gfg.prac.gts;

import com.mgp.generals.ListNode;

import java.util.ArrayList;

public class FindMiddleElementInaLinkedList {

    public static void main(String[] args) {

        ListNode node = new ListNode(3);
        node.next =new ListNode(4);
        node.next.next= new ListNode(5);
        System.out.println(getMiddle(node));
    }
    static  int getMiddle(ListNode head)
    {
        // Your code here.
        // store each number in array and check the size and return appropriate

        // create an arry
        int result;
        ArrayList<Integer> ist = new ArrayList<>() ;

        while (head != null ) {
            ist.add(head.data);
            head = head.next;
        }

        int size = ist.size();

        result = ist.get(size/2);

        return result;
    }

}
