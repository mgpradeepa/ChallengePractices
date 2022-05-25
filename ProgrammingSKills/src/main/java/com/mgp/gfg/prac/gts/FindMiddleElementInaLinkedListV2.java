package com.mgp.gfg.prac.gts;

import java.util.ArrayList;

public class FindMiddleElementInaLinkedListV2 {
    public static void main(String[] args) {

        Node node = new Node(3);
        node.next =new Node(4);
        node.next.next= new Node(5);
        System.out.println(getMiddle(node));
        System.out.println("runner approach " + getMiddleRunner(node));
    }

    private static int getMiddleRunner(Node head) {
        int result;

        Node fast = head.next.next;
        Node slow = head.next;

        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
result = slow.data;
        return result;
    }

    static  int getMiddle(Node head)
    {
        // Your code here.
        // iterate over the linked list collect the count
        // check for even and odd.
        // adjust the poiinter to traverse thru
        // retraverse till the pointer and get the middle element

        int result ;
        int ind = 0;
        Node inter = head;
        while( inter != null) {
            ind++;
            inter = inter.next;
        }
        System.out.println("indicies " + ind   );

        int mid;
        if(ind % 2 == 0) {
            mid = ind /2 +1;
        }
        else {
            mid = ind /2;
        }

        int reit = 0;
//        Node cur = head;
        while( reit < mid) {
            assert head != null;
            head = head.next;
            reit++;
        }
        result = head.data;

        return result;
    }





}
