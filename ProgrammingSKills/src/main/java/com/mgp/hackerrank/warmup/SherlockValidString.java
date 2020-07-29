package com.mgp.hackerrank.warmup;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class SherlockValidString {
    public static void main(String[] args) {
        String inpu = "aabbccddeefghi";
        System.out.println(isValid(inpu));
    }

    // Complete the isValid function below.
    static String isValid(String s) {

        int[] c = new int[256];

        for (int i = 0; i < s.length(); i++) {
            int ch = s.charAt(i);
            c[ch] = c[ch] + 1;

        }
        for (int i = 97 ; i < 133 ;i++) {
            System.out.println(c[i] +" ");
        }

        // check for frequency
        int f1 = 0;
        int f2 = 0;
        int f3 = 0;
        Map<Integer, Integer> myMap = new HashMap<>(3);
        int[] freqCatcher = new int[3];
        int j = 0;
        int countOChars = 0;
        for (int i = 97; i < 133; i++) {
            if (c[i] > 0) {

//                f1 = c[i];
//
//                    if(f1 == c[i]) {f1 = c[i]; countOChars++;}
//                    else  if(f2 == c[i]) { f2 = c[i]; countOChars++;}
//                    else {
//                        return "NO";
//                    }


//                freqCatcher[i]
                if(myMap.size() ==0 || myMap.get(c[i]) == null) {
                    int k = 0;
                    myMap.put(c[i] , j+1);
                }
                else {

                    int mapVal = myMap.get(c[i]);
                    System.out.println(  "mapVal  --> " + mapVal);
                    int temp = mapVal  == 0 ? 1 : mapVal+1;
                    System.out.println("Input To map "+  c[i] +" --> " +  temp );
                    myMap.put(c[i],temp);
                }
            }

        }
        myMap.values().iterator().forEachRemaining(System.out::println);
//        if(Math.abs(f1-f2) == 1) {
//            return "YES";
//        }
        if (myMap.size() >= 3) {
            return "NO";
        }
        if (myMap.size() == 1) return "YES";
        Iterator<Integer> iter = myMap.keySet().iterator();
        int l = 0;
        int res1 = 0;
        int res2 = 0;
        while (iter.hasNext()) {
            int v = iter.next();
            if (l == 0) {
                res1 = v;
                l = res1;
            } else res2 = v;

        }

        if (Math.abs(res1 - res2) == 1) {
            return "YES";
        }


//        if(f1 == 1 || f2 ==1) {
//            return "YES";
//        }


        return null;
    }
}
