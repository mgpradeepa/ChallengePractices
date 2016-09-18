package com.mgp.hackerrank.ISP.onmobile;

public class PowerOf5 {

	public static void main(String[] args) {
		String s = "101101101";
		System.out.println(getMin(s));
		
		

	}
	static int getMin(String s){
		int minCount = 0;
		//int val = getNum(s);
		if(getNum(s)% 5 ==0) return minCount++;
		 
		int i = 1;
		// specification
		// take the string 
		
		
		
		
		return minCount;
	}
	
static  Integer getNum(String n){
	return Integer.parseInt(n, 2);
}
}
