package com.mgp.gfg.prac.gts;

public class CountZeroesInMatrix {
    public static void main(String... args) {
        int n = 3;
        int[][] A = {{0, 0, 0}, {0, 0, 1}, {0, 1, 1}};
        System.out.println(countZeroesInMatrix(A, n));

    }

    private static int countZeroesInMatrix(int[][] A, int N) {
        int count = 0;
        for (int i = 0; i < N; i++) {
            int j = 0;
            while (j < N) {
                if (A[i][j] == 0) {
                    count++;
                }
                j++;
            }

        }
        return count;
    }
}
