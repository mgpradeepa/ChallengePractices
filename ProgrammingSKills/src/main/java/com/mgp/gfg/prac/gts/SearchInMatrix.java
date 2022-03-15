package com.mgp.gfg.prac.gts;

public class SearchInMatrix {
    public static void main(String... args) {

//        //example 1
//        int N = 3, M = 3;
//        int[][] mat = {{3, 30, 38}, {44, 52, 54}, {57, 60, 69}};
//        int X = 62;
         //example 2
         int N = 1, M = 6;
         int[][] mat= {{18, 21 ,27 ,38 ,55 ,67}};
         int X = 55;
        System.out.println(searchX(N, M, mat, X));
        System.out.println(searchXNSearch(N, M, mat, X));
    }

    private static int searchX(int n, int m, int[][] mat, int x) {
        int result = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mat[i][j] == x) {
                    result = 1;
                    break;
                }
            }
        }
        return result;
    }

    private static int searchXNSearch(int n, int m, int[][] mat, int x) {
        int result = 0;
        // Given: Matrix is sorted row-wise and column-wise as well.
        // every row check the last elememt which is likely the nth column.
        // if X is greater than mat[row][nthcolm] move the row else traverse thru left to row

        int row = 0; int column = n-1;
        while(row < m-1) {
            while (column > 0 ) {
                System.out.println(row +"<-- row ::: col --> "+ column  );
                int cur = mat[row][column];
                System.out.println("cur value "+ cur);
                if(cur == x  ) {
                    result = 1; break;
                }
                else if(x >= cur && row != m-1) {
                    row++;
                    System.out.println(row +"<-- row"  );
                }else {
                    column--;
                    System.out.println(column +"<-- column");
                }
            }
        }





        return result;
    }
}
