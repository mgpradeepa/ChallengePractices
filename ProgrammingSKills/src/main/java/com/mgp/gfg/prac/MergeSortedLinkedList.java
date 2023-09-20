package com.mgp.gfg.prac;

public class MergeSortedLinkedList {

    public static void main(String[] args) {
        int[] arr1 = new int[] {1, 3, 5, 6};
        int[] arr2 = new int[] {2, 4, 6, 20, 34};
        Nodes  l = new Nodes();
        Nodes list_head1  = l.createLinkedList(arr1);
        System.out.print("Original1: ");
        l.display(list_head1);

        Nodes list_head2  = l.createLinkedList(arr2);
        System.out.print("Original2: ");
        l.display(list_head2);

        System.out.println("Merged");
        Nodes resuktMerged = mergesortLinkedList(list_head1,list_head2);
        l.display(resuktMerged);


    }

    private static Nodes mergesortLinkedList(Nodes head1, Nodes head2)
    {
        if(head1 == null) return head2;
        else if( head2 == null) return head1;


        Nodes mergerHead = null;
        if(head1.data <= head2.data)  {
            mergerHead = head1;
            head1 = head1.next;
        }
        else {
            //https://www.educative.io/m/merge-two-sorted-linked-lists
            mergerHead = head2;
            head2 = head2.next;
        }
        // create a tail for mergerHead
        Nodes mergerTail = mergerHead;

        while(head1 != null && head2 != null) {
            Nodes temp = null;
            if(head1.data <= head2.data) {
                temp = head1;
                head1 = head1.next;

            } else {
                temp = head2;
                head2 = head2.next;
            }
            mergerTail.next = temp;
            mergerTail = temp;

        }
        if(head1 != null)
            mergerTail.next = head1;
        else if (head2 != null)
            mergerTail .next = head2;

        return mergerHead;
    }
}

class Nodes {

    int data;
    Nodes next;
//    Node(int d) {
//        data = d;
//        next = null;
//    }

    public Nodes createLinkedList(int[] a) {
        Nodes root = null;
        for(Integer n : a) {
            root = insert(root, n);

        }
        return root;
    }

    private Nodes insert(Nodes root, Integer n) {
        Nodes temp = new Nodes();
        Nodes pt;
        temp.data  = n;
        temp.next = null;

        if(root == null) {
            root = temp;
        }
        else {
            pt = root;
            while(pt.next != null) {
                pt = pt.next;

            }
            pt.next = temp;
        }
        return root;
    }

    protected void display (Nodes list ) {
        while(list != null ) {
            System.out.println(list.data + " -> ");
            list = list.next;
        }

    }
}