package com.mgp.gfg.prac;

public class LeftRotArrayEffiecient {

    // array = [1,2,3,4]
    // index to rotate = 2
    // op = [3,4,1,2]

    public static void main(String[] args) {
        int[] ar = {1, 2, 3, 4, 5, 6, 8};
        int d = 6;
        rotateLeft(ar, d);

    }

    private static void rotateLeft(int[] a, int d) {
// technique --> instead of doing the left rotation, we keep moving the indecies doing the right rotation
        // new_indices can be found by the formula
        // oldindex + ( n - d) % n

        int res[] = new int[a.length];
        int n = a.length;
        for( int oldIndex = 0; oldIndex< n; oldIndex++) {
            int newIndex = (oldIndex + n-d) % n;
            res[newIndex] = a[oldIndex];
        }
        displayArray(res);

    }

    private static void displayArray(int[] res) {
        for(int i = 0; i < res.length; i++){
            System.out.print(res[i]+ " ");
        }
    }
}
