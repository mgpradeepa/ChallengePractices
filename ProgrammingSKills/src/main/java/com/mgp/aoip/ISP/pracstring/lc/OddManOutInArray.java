package com.mgp.aoip.ISP.pracstring.lc;

public class OddManOutInArray {
    public static void main(String[] args) {
        int A[] = {9, 3, 9, 3, 9, 7, 9};
        System.out.println(sol(A));

    }
    private static int sol(int[] A) {
        int result = 0;
        java.util.Map<Integer, Integer> eoMap = new java.util.HashMap<>();
        for(int i = 0 ; i < A.length; i++) {
            eoMap.merge(A[i], 1, Integer::sum);

        }
        for(java.util.Map.Entry<Integer, Integer> entry : eoMap.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
            if(entry.getValue() == 1){
                result = entry.getKey();
            }

        }
        return result;
    }
}
