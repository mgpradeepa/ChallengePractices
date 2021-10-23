package com.mgp.gfg.prac.gts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateFromSortedArray {
    public static void main(String[] args) {
        int[] a = {1, 3, 4, 5, 6, 12, 13, 17, 19, 22, 23, 25, 27,
                28, 28, 35, 36, 37, 39, 43, 46, 48, 54, 59, 62, 63,
                65, 68, 68, 70, 70, 72, 79, 82, 83, 92, 92, 93, 95, 96, 96, 100};
        int n = 42;

        System.out.println(remove_duplicate(a,n));



    }

    static int remove_duplicate(int A[], int N) {
        // code here
        int index = 1;
        List<Integer> aList = new ArrayList< >(N);


        int i = 0;
//        int j = i + 1;

        for (i = 0; i < N - 1; i++) {
            if (A[i] != A[i+1]) {
                A[index++]  = A[i+1];

                aList.add(A[i+1]);
            }
        }

        aList.forEach(System.out::println);

        aList = Arrays.stream(A).distinct().boxed().collect(Collectors.toList());

        System.out.println("Streamed AList " );
        aList.forEach(System.out::print);

        int[] aL = Arrays.stream(A).distinct().toArray();

        System.out.println("Print list ");
        for(int k = 0 ; k < aL.length; k++)
            System.out.print( aL[k] + " ");

        System.out.println("Index " + index);


        return index;
    }
}

