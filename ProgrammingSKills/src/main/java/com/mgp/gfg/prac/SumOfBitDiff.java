package com.mgp.gfg.prac;

public class SumOfBitDiff {

    public static void main(String[] args) {
        int[] a = {1, 3, 5};
        int n = a.length;;
        System.out.println(sumBitDiff(a, n));
    }

    private static int sumBitDiff(int[] a, int n) {
        int finalAns = 0;

        for (int i = 0; i < 32; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if ((a[j] & (1 << i)) == 0)
                    count++;
            }
            finalAns += (count * (n - count) * 2);
        }

        return finalAns;
    }

}
