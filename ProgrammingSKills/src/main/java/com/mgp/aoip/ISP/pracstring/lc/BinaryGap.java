package com.mgp.aoip.ISP.pracstring.lc;

import jdk.dynalink.beans.StaticClass;

import java.util.Stack;

public class BinaryGap {
    public static void main(String[] args) {

        System.out.println(binaryGap(1162));
    }
    private static  int binaryGap(int N){
        String binaryFormat = Integer.toBinaryString(N);
        System.out.println(binaryFormat);
        char[] binc = binaryFormat.toCharArray();
        if(!binaryFormat.contains("0")) {
            return 0;
        }
        int gapC = 0 ;
        int maxi = Integer.MIN_VALUE;
        for(int i = 1 ; i < binc.length; i++) {
//            int gapC = 0 ;
            if(binc[i] == '0') {
                gapC++;
            }if(binc[i] == '1') {
                System.out.println(gapC);
                maxi = Math.max(maxi, gapC);
                gapC = 0;
            }if(binc[binc
                    .length -1] != '1'){
                int j =binc.length -1 ;
                while(j > 0 && binc[j--] != '1') {
                    if(binc[j--] == '0'){
                        gapC--;
                    }
                }
            }
        }



//        Stack<Character> st = new Stack<>();
//        for (char c : binc ) {
//            st.push(c);
//        }
//        while
return maxi;

    }
}
