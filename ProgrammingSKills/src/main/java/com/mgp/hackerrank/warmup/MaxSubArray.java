package com.mgp.hackerrank.warmup;

import java.util.*;

public class MaxSubArray {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
//       ArrayList<Integer> op = maxSet(new ArrayList<Integer>);
    }
    public ArrayList<Integer> maxset(ArrayList<Integer> a){
        Map<ArrayList<Integer>, Integer> subListSum =  new HashMap<>();
        ArrayList<Integer> result = new ArrayList<> () ;
        int asize = a.size();
        int sum =0;

        for(int i = 0 ; i < asize;  ){
            while(i < asize){
                ArrayList<Integer> temp = new ArrayList<>();
                if(a.get(i) > 0) {

                    temp.add(a.get(i));
                    sum += a.get(i);
                    i++;;
                }
                else
                {
                    if(temp.size() >0) {
                        subListSum.put(temp, sum);
                    }
                    i++;
                    sum = 0 ;
                    break;
                }
            }
        }

        // iterate over the map and which ever has max sum we can

        Map.Entry<ArrayList<Integer>, Integer> maxEntry = null;
        for (Map.Entry<ArrayList<Integer>, Integer> entry : subListSum.entrySet()) {
            if (maxEntry == null || entry.getValue()
                    .compareTo(maxEntry.getValue()) > 0) {
                maxEntry = entry;
            }
        }
        return maxEntry.getKey();



    }
}
