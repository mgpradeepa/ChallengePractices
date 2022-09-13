package com.mgp.gfg.prac.gts;

import java.util.*;

public class PrimeRangeQueryM3 {

    public static void main(String[] args) {
        int[][] Query = {{1,5},{3,3}, {2,3}};
        int [] A = {2,4,6,1,9};
        int N = 5;
        int Q = 3;

        solve(N,A, Q, Query).forEach(System.out::println);
    }

    static List<Integer> fillPrimeNumbers(int n) {
        return java.util.stream.IntStream.rangeClosed(2, n)
                .filter(x -> isPrime(x))
                .boxed()
                .collect(java.util.stream.Collectors.toList());

    }

    static boolean isPrime(int n) {
        return java.util.stream.IntStream.rangeClosed(2, (int) (Math.sqrt(n)))
                .allMatch(y -> n % y != 0);
    }

    static List<Integer> solve(int N, int A[], int Q, int Query[][]) {
        // code here

        // for each of Query[][]
        // fetchthe array
        // find the list of prime numbers for each of the number
        // add it to a set.

        // iterate over each list and see whether each of the number is divisible by the prime numbers list

        // if yes, put only those to the result list
        List<Integer> result = new ArrayList<>();

        for (int q1 = 0; q1 < Q; q1++) {
            int qs = Query[q1][0] - 1;
            int qe = Query[q1][1];
            int[] quay = new int[qe - qs];
            Set<Integer> primes = new HashSet<>();
            for (int i = qs, ind = 0; i < qe; i++, ind++) {
                quay[ind] = A[i];
                primes.addAll(fillPrimeNumbers(quay[ind]));


            }

            int count = 0;
            System.out.println("Items in prime *** ");
            primes.forEach(x -> System.out.println("primeLists" + x));

            System.out.println("Items in quay array");
            Arrays.stream(quay).forEach(System.out::println);

            for (Integer num : primes) {
//                List<Integer> prList = new ArrayList<>();
                int acc = 0;
                for (int j : quay) {
                    System.out.println("j-> " + j + " :: num -> " + num + " :: divsbl --> "+ j%num);
                    if (j % num == 0) {
                        acc++;


//                        count++;
//                        if (count == quay.length) {
//                            result.add(count);
//                        } else{
//                            count = 0;
//                        }
                    }


                }

                if(acc == quay.length) {
                    count = count+acc;
                    result.add((count));
                }
                if(acc== 0) {
                    result.add(0);
                }

                System.out.println("count "+ count );

//                result.addAll(prList);
                result.forEach(System.out::println);
            }



//                for (int j : quay) {
//                    for (Integer num : primes) {
//                    System.out.println("j-> " + j + " :: num -> " + num + " :: divsbl --> "+ j%num);
//                    if (j % num == 0) {
//                        count++;
//                        if (count == ) {
//                            result.add(count);
//                        } else{
//                            count = 0;
//                        }
//                    }
//
//
//                }
//                System.out.println("count "+ count);
//
//            }

        }
        System.out.println("***");
        return result;

    }
}
