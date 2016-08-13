package com.mgp.hackerrank.ISP.arraysds;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SparseTreeOccuranceOfStringCheck {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String far[] = new String [n];
		for(int i = 0 ; i < n; i++) {
			far[i] = sc.next();
			
		}
		int q = sc.nextInt();
		String qar [] = new String[q];
		for(int i = 0; i < q; i ++) {
			qar[i] = sc.next();
			
		}
		Map<String, Integer> ma = new HashMap<>();
		for(int i = 0; i < q;i++){
			int k =0;
			for (int j = 0; j < n; j++){
				
				if(qar[i].equalsIgnoreCase(far[j])){
					ma.put(qar[i], ++k);
				}else ma.put(qar[i],k);
				
			}
			System.out.println(ma.get(qar[i]));
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		String[] str = new String[n];
//
//		Map<String, Integer> strMap = new HashMap<>();
//
//		for (int i = 0; i < n; i++) {
//			strMap.put(sc.next(), 0);
//			// str[i] = sc.nextLine();
//
//		}
//		int q = sc.nextInt();
//		String query[] = new String[q];
//
//		String qq = null;
//		for (int i = 0; i < q; i++) {
//			qq = sc.next();
//			query[i] = qq;
//			if (strMap.containsKey(q)) {
//				strMap.put(qq, strMap.get(qq) + 1);
//
//			}
//
//		}
//		for (String qp : query) {
//			System.out.println(strMap.get(qp));
//		}
//
//		// query[i] = sc.nextLine();
//
//		sc.close();
//	}
}
