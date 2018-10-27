package com.mgp.aoip.ISP.pracstring;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * A is an array having n elements find the minimum(d(i,j)) such tht ai = aj and
 * i <> j
 * 
 * 
 * 
 * @author mgpradeepa
 *
 */
public class MinimumDistance {

	/***
	 * 6 </br>
	 * 7 1 3 4 1 7
	 * 
	 * outpu = 3
	 * 
	 * a1 and a4 = 1 ==> | 1-4 | = 3 a0 and a5 = 7 ==> | 0-5 | = 5 min(3,5) ==>
	 * 3
	 */

	public static void main(String[] args) {
		System.out.println("Enter");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int A[] = new int[n];
		for (int A_i = 0; A_i < n; A_i++) {
			A[A_i] = in.nextInt();
		}
		in.close();
		// specification:

		// read the array and the element would be the key and index would be
		// the value.
		// if there exists such key obtain the value which is the previously
		// entered index.
		// perform the" absolute difference value of both" and store the new
		// value.
		// once all the elements in the array is parsed,
		// traverse through the map keys and values and find which ever is the
		// minimum value

		Map<Integer, Integer> indexElemMap = new HashMap<Integer, Integer>(n);
		Map<Integer, Integer> absIndexElemMap = new HashMap<Integer, Integer>(n);
		for (int i = 0; i < n; i++) {
			if (!indexElemMap.containsKey(A[i])) {
				indexElemMap.put(A[i], i);
			} else if (indexElemMap.containsKey(A[i])) {
				int oldindex = indexElemMap.get(A[i]);
				int newAbsValue = Math.abs(oldindex - i);
				absIndexElemMap.put(A[i], newAbsValue);
			}
		}
		int min = 9999;
		if (absIndexElemMap.size() == 0) {
			System.out.println(-1);
		} else {

			for (Map.Entry<Integer, Integer> e : absIndexElemMap.entrySet()) {
				min = Math.min(min, e.getValue());
			}
			System.out.println(min);
		}
	}
}
