package com.mgp.gfg.prac;

import com.mgp.gfg.prac.gts.Node;

public class SumofNumberinLinkedList {
    public static void main(String[] args) {
        Node n1 = new Node(2);
        Node n12 = new Node(4);
        Node n13 = new Node(3);
        n1.next = n12;
        n12.next = n13;


        Node n2 = new Node(5);
        Node n22 = new Node(6);
        Node n23 = new Node(4);
        n2.next = n22;
        n22.next = n23;

       Node resul =  addTwoNumber (n1, n2);

       while (resul != null ) {
           System.out.println(resul.data);
           resul = resul.next;

       }

    }

    private static Node addTwoNumber(Node n1, Node n2) {
        Node head  = null;

        Node temp = null;

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
            Node node = new Node(sum % 10);

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
            temp.next = new Node(carry);
        }

        return head;

    }
}
