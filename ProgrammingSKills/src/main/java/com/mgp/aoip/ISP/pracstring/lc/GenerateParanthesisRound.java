package com.mgp.aoip.ISP.pracstring.lc;

import java.util.LinkedList;
import java.util.List;

public class GenerateParanthesisRound {
// example n = 1 => result =  ()
    public static void main(String... args) {
        int n = 5;
        System.out.print("[");
        for (String s:generateParanthesis(n)
             ) {
            System.out.print(s + " ");

        }
        System.out.println("]");
    }
    private static List<String> generateParanthesis(int n) {
        // Consider linkedList
        // use recursive algo to keep populating

        LinkedList<String> resList = new LinkedList<>() ;
        if(n <= 0 ) return resList;

        populateParan(n, 0 , "", resList);
        return resList;

    }

    private static void populateParan(int left, int right, String res, LinkedList<String> lst) {

        if(left == 0 && right == 0) {
            lst.add(res);
            return;
        }
        if(left > 0 ) {
            populateParan(left -1, right +1,res + "(", lst);

        }
        if(right > 0 ){
            populateParan(left, right -1, res+")", lst);
        }

    }
}
