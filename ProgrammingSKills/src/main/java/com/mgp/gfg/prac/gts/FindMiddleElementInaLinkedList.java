package com.mgp.gfg.prac.gts;

import java.util.ArrayList;

public class FindMiddleElementInaLinkedList {

    public static void main(String[] args) {

        Node node = new Node(3);
        node.next =new Node(4);
        node.next.next= new Node(5);
        System.out.println(getMiddle(node));
    }
    static  int getMiddle(Node head)
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
class Node {
    int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}