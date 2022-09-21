package com.mgp.aoip.ISP.pracstring.lc;

import com.mgp.gfg.prac.gts.Node;

public class LinkedListCycle {
    private static boolean hasCycle(Node head) {
        //check of head == null
        if(head == null) {
            return false;

        }
        Node walk = head;
        Node run = head;

        while(run.next != null && run.next.next != null ){
            walk = walk.next;
            run = run.next.next;
            if(walk == run) { //  if there is a cycle some where walk will have to meet run.
                return true;
            }

        }
        return false;
    }

    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        n1.next =n2;
        n2.next = n1;

        System.out.println(hasCycle(n1));
    }
}
