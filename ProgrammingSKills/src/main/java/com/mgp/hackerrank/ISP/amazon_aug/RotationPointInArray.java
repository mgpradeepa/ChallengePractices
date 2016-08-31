package com.mgp.hackerrank.ISP.amazon_aug;

public class RotationPointInArray {
	// given a sorted array with some rotations already done on the array. Find
	// how many rotations has been done
	public static void main(String[] args) {
		// int arr[] = { 1, 2, 3, 4, 5 };
		int arr[] = { 4, 5, 1, 2, 3 };

		int size = arr.length;
		System.out.println(checkNumRotations(arr, 0, size));

	}

	private static int checkNumRotations(int[] a, int s, int e) {
		// TODO Auto-generated method stub
		int low = s;
		int high = e - 1;
		while (low <= high) {

			if (a[low] <= a[high])
				return low;

			int mid = (low + high) / 2;
			int next = (mid + 1) % e;
			int prev = (mid + e - 1) % e;
			if (a[mid] <= a[next] && a[mid] <= a[prev])
				return mid;
			else if (a[mid] <= a[high])
				high = mid - 1;
			else if (a[mid] >= a[low])
				low = mid + 1;

		}

		return -1;
	}

	// this gives me some issue

	// private static int checkNumRotations(int[] a, int s, int e) {
	// int mid = s+ (e -s) / 2;
	// int index = -1;
	// if (a[mid] < a[mid - 1] && a[mid] < a[mid + 1])
	// index = mid;
	// else if (a[s] < a[mid]) {
	// index = checkNumRotations(a, mid + 1, a.length);
	//
	// } else {
	// index = checkNumRotations(a, 0, mid - 1);
	// }
	// return index;
	// }

}
