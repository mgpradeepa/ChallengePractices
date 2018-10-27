package com.mgp.codility.af;

import java.util.*;

/**
 * Created by mgpradeepa on 20/10/18.
 */
public class ABMaxApple {


    public static void main(String[] args) {
//        int A [] = {6,1,4,6,3,2,7,4};
//        int K = 3;
//        int L = 2;

        int A [] ={10,19,15};
        int K = 2;
        int L = 2;
        ABMaxApple abMaxApple = new ABMaxApple();

        System.out.println(abMaxApple.solution(A,K,L));
    }
    public int solution(int[] A, int K, int L) {
        // write your code in Java SE 8

        List<Alice> aliceList = new ArrayList<>();
        List<Bob>bobList = new ArrayList<>();


        for(int i = 0; i < A.length-K ; i++) {
            int sum = 0;
            int kalias = K;
            StringBuilder sbf = new StringBuilder();
            int j =i;
            while (kalias-- > 0) {
                sum += A[++j];
                sbf.append(j);
            } aliceList.add(new Alice(sum,sbf.toString()));


        }

        for(int i = 0; i < A.length - L; i++) {
            int sum = 0;
            StringBuilder sbf = new StringBuilder();
            int lalias = L;
            StringBuilder sbsf = new StringBuilder();
            int j =i;
            while (lalias-- > 0) {
                sum += A[++j];
                sbf.append(j);
            } bobList.add(new Bob(sum,sbf.toString()));

        }

        aliceList.sort((o1, o2) -> o2.getSum() - o1.getSum());

        bobList.sort((o1, o2) -> o2.getSum() - o1.getSum());

//        aliceList.forEach(System.out::println);
//        bobList.forEach(System.out::println);

        String toMactchIndexesFromAlice  = aliceList.get(0).getIndexes();
        int maxApples = -1;
//        System.out.println(toMactchIndexesFromAlice);
        for (Bob b: bobList
             ) {
           if(twoStrings(toMactchIndexesFromAlice, b.getIndexes())) {
               maxApples = b.getSum() + aliceList.get(0).getSum();
               break;
           }

        }


        return maxApples;
    }
    private boolean twoStrings(String s1, String s2)
    {
        char[] s1Array = s1.toCharArray();
        char [] s2Array = s2.toCharArray();


        Set<Character>s1CharSet = new HashSet<Character>();
        Set<Character>s2CharSet = new HashSet<Character>();

        for(char c:s1Array){
            s1CharSet.add(c);
        }

        for(char c: s2Array){
            s2CharSet.add(c);
        }

        s1CharSet.retainAll(s2CharSet);

        return s1CharSet.size() == 0;


    }
    }


class Alice {
    int sum;
    String indexes;

    public Alice(int sum, String indexes) {
        this.sum = sum;
        this.indexes = indexes;
    }

    public int getSum() {
        return sum;
    }

    public String getIndexes() {
        return indexes;
    }

    @Override
    public String toString() {
        return "Alice{" +
                "sum=" + sum +
                ", indexes='" + indexes + '\'' +
                '}';
    }
}

class Bob {
    int sum;
    String indexes;

    public Bob(int sum, String indexes) {
        this.sum = sum;
        this.indexes = indexes;
    }

    public int getSum() {
        return sum;
    }

    public String getIndexes() {
        return indexes;
    }

    @Override
    public String toString() {
        return "Bob{" +
                "sum=" + sum +
                ", indexes='" + indexes + '\'' +
                '}';
    }
}