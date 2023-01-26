package com.mgp.gfg.prac;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubArrayWithGivenSum {

    // still incomplete solution
    public static void main(String[] args) {
        int arra[] = {1,2,3,7,5};
        int n = 5; int s = 10;
//        System.out.println(subArraySum(arra,n,s));
        ArrayList<Integer > resArray = subArraySum(arra,n,s);
        resArray.forEach(System.out::println);


    }
    static ArrayList<Integer> subArraySum (int a[], int n, int s ) {
        int l = 0, r = 1;
        int cursum = 0;
        ArrayList<Integer> ind = new ArrayList<>();
        cursum += a[l] + a[r];
        while(  l < n) {
//            cursum += a[l] + a[r];
            if(cursum == s ){
                ind .add(l+1);
                ind.add(r);
                break;

            }
            else if( cursum < s) {
                if( r >1)
                     cursum = cursum + a[r];
                r+=1;

            }
            else {
                cursum = cursum - a[l];
                l+=1;
            }
        }
        return ind;
    }

}
