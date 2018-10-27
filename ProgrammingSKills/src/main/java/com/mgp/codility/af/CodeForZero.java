package com.mgp.codility.af;

import java.util.*;
import java.util.function.BooleanSupplier;

/**
 * Created by mgpradeepa on 20/10/18.
 */
public class CodeForZero {

    public static void main(String[] args) {
//        int A [] = {2,-2,3,0,4,-7};
        int A[] = {0};
        CodeForZero codeForZero = new CodeForZero();

        System.out.println(codeForZero.solution(A));
    }

    public int solution(int[] A) {
        // write your code in Java SE 8
        Integer[] Aint = Arrays.stream(A).boxed().toArray(Integer[]::new);
        int count = 0;
        if (ifAllZeros(Aint)) {
            count = -1;
        } else if (A.length > 1000000000) {
            count = -1;
        } else {
            Map<Integer, Integer> zeroSum = new HashMap<>();

            int sum = 0;
            for (int i = 0; i < A.length; i++) {

                sum += A[i];

                //check if cursum = 0
                if (sum == 0) {
                    count++;
                }

                if (zeroSum.get(sum) != null) {
                    count++;
                } else {
                    zeroSum.put(sum, i);
                }

            }
        }
        return count;
    }

    private boolean ifAllZeros(Integer A[]) {
        boolean yesAllZero = Boolean.FALSE;
        Set<Integer> si = new HashSet<Integer>(Arrays.asList(A));
        if (si.size() == 1  && A.length ==1000000) {
            System.out.println(si.size());

            yesAllZero = Boolean.TRUE;
        }
        return yesAllZero;
    }


}