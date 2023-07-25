package com.mgp.aoip.ISP.pracstring.lc;

import java.io.IOException;
import java.util.Arrays;

public class CountNegativesInMatrix {
    // Row wise and column wise non-incrreasing numbers
    // provide the total negative numbers.

    public static int countNegatives(int [][] grid) {
        int r = grid.length;
        int c = grid[0].length;

        int result = 0;
        int lastNeagtive = c - 1;

        for (int[] ints : grid) {
            if (ints[0] < 0) {
                result += c;
                continue;
            }
            if (grid[0][c - 1] > 0) {
                continue;
            }

            // binary search algo
            int l = 0, rr = lastNeagtive;
            ;

            while (l < rr) {
                int mid = l + (rr - 1) / 2;
                if (grid[rr][mid] < 0) {
                    rr = mid - 1;
                } else {
                    l = mid + 1;

                }
            }
            result += (c - l);
            lastNeagtive = l;
        }
        return result;

    }

    public static void main(String[] args) throws IOException {

        int[][] grid = new int[2][2];
        System.out.println("Input to matrix");
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0 ; j < grid[0].length; j++) {
                grid[i][j] = System.in.read();
            }
        }
        System.out.println("Output of original matrix");
        for(int[] items : grid) {
            System.out.println(items[0]);
        }

        System.out.println(countNegatives(grid));
    }
}
