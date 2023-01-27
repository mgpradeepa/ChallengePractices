package com.mgp.gfg.prac;

import javax.sound.sampled.Line;

public class PreviousNumberInOneSwap {

    public static void main(String[] args) {
//        String S = "12435";
        String S = "12345";
        System.out.println(previousNumber(S));

    }

    static String previousNumber(String S) {

        char[] arr = S.toCharArray();
        int n = arr.length;
        int iprev = -1;
        int inxt = -1;

        for(int i  = n-1; i > 0; i--) {
            char pre = arr[i-1];
            char cur = arr[i];
            if(pre > cur ) {
                iprev = i - 1 ;
                break;

            }
        }
        if(iprev == -1) {
            return "-1";

        }

        for(int i = n-1; i >0; i--){
            if(arr[i] < arr[iprev]) {
                inxt =i;
                break;

            }
        }

        char repeated = arr[inxt];

        for(int i = inxt - 1; i > 0 ; i--) {
            if(arr[i] != repeated) {
                inxt = i+ 1;
                break;
            }
        }

        if(iprev ==0 && arr[inxt] == '0')
        {
            return "-1";
        }
        swap(iprev, inxt , arr);
        return new String(arr);
    }
    static void swap(int a, int b, char[] ch) {
        char temp = ch[a];
        ch[a] = ch[b];
        ch[b] = temp;

    }


}
