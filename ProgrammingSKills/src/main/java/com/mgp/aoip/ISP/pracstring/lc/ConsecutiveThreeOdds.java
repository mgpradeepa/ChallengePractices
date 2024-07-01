package com.mgp.aoip.ISP.pracstring.lc;

public class ConsecutiveThreeOdds {

  public static void main (String... args) { 
    int[] arr = {1,3,4,5,7,3,6,0};
    System.out.println(threeConsecutiveOdds(arr));
    
  }
  public boolean threeConsecutiveOdds(int[] arr) {
        
        boolean result  = false;
        for(int i = 2; i < arr.length; i++) {
            if((arr[i] %2 !=0) && (arr[i-1] %2 !=0) && (arr[i-2] %2!=0 )) {
        
                result =true;
                break;

            }
        }
        return result;

    }
}
