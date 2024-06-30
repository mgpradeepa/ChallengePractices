package com.mgp.aoip.ISP.pracstring.lc;

// count the number of bits in each i.
//input : n = 2
// output = [0,1,1]

public class CountBits {
  public static void main(String... args) {
    int n = 2;
    int[] ans = countBits(n);
    for(Integer i : ans) {
      System.out.println(i);
    }
    
  }
  private static int[] countBits(int n) {
    int[] ans = new int[n+1];

    for(int i = 1; i <= n; i++) {
      ans[i] = ans[i>>1] + (i&1);
    }
    return ans;
  }
}
