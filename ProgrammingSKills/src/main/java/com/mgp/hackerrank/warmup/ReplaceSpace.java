package com.mgp.hackerrank.warmup;

public class ReplaceSpace {
    public static void main(String[] args) {
        String inp = "I am Pradeep";
        char[] chars = inp.toCharArray();
        char[] op = new char[inp.length() * 3];
        String rep = "%20";
        char[] repC = rep.toCharArray();
        char c1 = repC[0];
        char c2 = repC[1];
        char c3 = repC[2];
        System.out.println("char3 " + c3);
        int k = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ' ') {
                op[k + 1] = c1;
                op[k + 2] = c2;
                op[k + 3] = c3;
                k = k + 3;
                ++i;

            }
            op[++k] = chars[i];


        }
        System.out.println("length " + k);
        for (int j = 0; j <= k; j++) {
            System.out.print(op[j]);
        }
    }
}
