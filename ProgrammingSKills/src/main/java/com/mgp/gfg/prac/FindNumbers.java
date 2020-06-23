package com.mgp.gfg.prac;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class FindNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //testcase
        int T = sc.nextInt();
        int[] integ = null;
        Set<Integer> integSet = new TreeSet<>();

        for (int i = 0; i < T; i++) {
            // value of N
            int N = sc.nextInt();

            integ = new int[2 * N + 2];

            for (int j = 0; j < 2 * N + 2; j++) {
                integ[j] = sc.nextInt();
                //check in to SET if the number already present then it gives false then remove from the set
                if (!integSet.add(integ[j])) integSet.remove(integ[j]);

            }

            if (integSet.size() > 0)
                for (Integer s : integSet)
                    System.out.print(s + " ");
            System.out.println();

            integSet.clear();
        }


    }
}
