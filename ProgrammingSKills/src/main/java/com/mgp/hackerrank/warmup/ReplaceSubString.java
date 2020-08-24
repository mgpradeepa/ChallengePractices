package com.mgp.hackerrank.warmup;

import java.util.ArrayList;
import java.util.List;

public class ReplaceSubString {
    public static void main(String[] args) {
        String input = "Hello world!";
        List<Replacement> r = new ArrayList<>(2);
        Replacement r1 = new Replacement(0,"Hello","Morning");
        Replacement r2 = new Replacement(6,"world","Bye");
        r.add(r1);
        r.add(r2);

        String op = replace(input, r);
        System.out.println(op);

    }

    private static String replace(String str, List<Replacement> r) {
        int n = r.size();

        int offset = 0;
        for(int i = 0 ; i < n; i++) {
            System.out.println("Iter " + i);
            int ind = Math.abs(offset - r.get(i).getIndex());
            String b = r.get(i).getBefore();
            String a = r.get(i).getAfter();

            StringBuilder sbr = new StringBuilder(str);
            // replace

            int repIndex = ind + b.length();
            if(sbr.substring(ind,repIndex).equals(b)) {
                sbr.replace(ind, repIndex, a);
                offset = b.length() - a.length();
                str = sbr.toString();
                System.out.println("Itervise -> "+ str);
            }else {
                return str;
            }
        }

        return str;
    }


}
class Replacement {
    private int index;
    private String before;
    private String after;

    Replacement(int index, String before, String after) {
        this.index = index;
        this.before = before;
        this.after = after;
    }

    int getIndex() {
        return index;
    }


    String getAfter() {
        return after;
    }


    String getBefore() {
        return before;
    }

}
