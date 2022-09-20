package com.mgp.aoip.ISP.pracstring.lc;

import java.util.ArrayList;
import java.util.List;

public class PascalIntegerTriangle {
    private static List<List<Integer>> pascalTriangle(int numRows) {

        List<List<Integer>> result = new ArrayList<>();
        for(int i = 0 ; i < numRows; i ++) {
            List<Integer> list = new ArrayList<>();
            for(int j = 0 ; j< i+1 ; j++ ){
                if(j == 0 ||  j  == i) {
                    list.add(1);
                }
                else {
                    int x = result.get(i -1).get(j-1) ;
                    int y = result.get(i-1).get(j);
                    list.add(x +y);
                }
            }
            result.add(list);
        }
        return result;
    }

    public static void main(String[] args) {
        int numRows = 5;
        List<List<Integer>> result = pascalTriangle(numRows);
        result.forEach(innerList -> {
            innerList.forEach(System.out::println);
            String line = String.join(", " + innerList);
            System.out.println(line);
        });
    }
}
