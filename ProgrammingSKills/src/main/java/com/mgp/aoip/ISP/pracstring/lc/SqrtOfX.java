package com.mgp.aoip.ISP.pracstring.lc;

public class SqrtOfX{
 
  public static int sqrt(int x) {
    if( x == 0) return 0;
    
    long inter = x;
    while (inter > x/inter) {
      inter = ( inter  + x / inter) /2;
    }
    return (int) inter;
  }
    
  public static void main(String... args) {
    int x = 4;
    System.out.println(sqrt(x));
  }
}
