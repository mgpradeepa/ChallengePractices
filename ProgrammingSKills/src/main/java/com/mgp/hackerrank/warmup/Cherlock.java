package com.mgp.hackerrank.warmup;

import java.util.*;

public class Cherlock {


    public static void main(String[] args) {
        String inpu = "abcdefghhgfedecba";
        System.out.println(isValid(inpu));
    }

    // Complete the isValid function below.
    static String isValid(String s) {

        final Integer CHRS = 26;
        String res = null;
        int[] c = new int[26];
        Map<Integer, Integer> myMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            int ch = s.charAt(i) - 'a';
            c[ch] = c[ch] + 1;

        }
        int j = 0;

        for (int i = 0; i < CHRS; i++) {
            if (c[i] > 0) {
                myMap.put(c[i], j++);
            }

        }
        Set<Integer> set = new HashSet<>();

        if (myMap.size() >= 3) {
            res = "NO";
            return res;
        }
        if (myMap.size() == 1) {
            res = "YES";
            return res;
        }
        else{
                int initij = 0;
                Iterator<Integer> it = myMap.keySet().iterator();
                int f1 = 0;
                int f2 = 0;
                int v = 0;
                while (it.hasNext()) {

                    if (initij == 0) {


                        v = it.next();
                        initij++;
                        f1 = v;
                        System.out.println("InitJ" + initij);

                    } else {
                        v = it.next();
                        f2 = v;
                    }
                }


                System.out.println("respective values of " + f1 + "   " + f2);

                if (Math.abs(f1 - f2) == 1) {
                    System.out.println("YES");
                    res = "YES";
                } else {
                    System.out.println("MOMO");
                }

            }

            return res;

        }
    }
