package com.mgp.gfg.prac;

import com.mgp.generals.ListNode;

public class SumofNumberinLinkedList {
    public static void main(String[] args) {
        ListNode n1 = new ListNode(2);
        ListNode n12 = new ListNode(4);
        ListNode n13 = new ListNode(3);
        n1.next = n12;
        n12.next = n13;


        ListNode n2 = new ListNode(5);
        ListNode n22 = new ListNode(6);
        ListNode n23 = new ListNode(4);
        n2.next = n22;
        n22.next = n23;

       ListNode resul =  addTwoNumber (n1, n2);

       while (resul != null ) {
           System.out.println(resul.data);
           resul = resul.next;

       }

    }

    private static ListNode addTwoNumber(ListNode n1, ListNode n2) {
        ListNode head  = null;

        ListNode temp = null;

        // Carry

        int carry = 0 ;

        // iterate over each and perform sum
        while((n1 != null) || (n2 != null)) {

            int sum = carry;

            // sum may be unequal so validate individually

            if( n1 != null) {
                sum += n1.data;
                n1 = n1.next;
            }
            if(n2 != null) {
                sum += n2.data;
                n2 = n2.next;
            }

            // sum it up and get the mod 10 value to store
            ListNode node = new ListNode(sum % 10);

            carry = sum / 10;

            if (temp == null){
                temp = head = node;

            }
            else {
                temp.next = node;
                temp = temp.next;
            }
        }
        if (carry > 0 ) {
            temp.next = new ListNode(carry);
        }

        return head;

    }
}
