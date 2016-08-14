package com.mgp.hackerrank.ISP.fibgcd;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution_1 {
	static List<Integer> primeList = new ArrayList<Integer>();
	static Integer numToBeReturned = 0;

	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int N = Integer.parseInt(line);
		for (int i = 0; i < N; i++) {
			List<Integer> fibGcd = new ArrayList<Integer>();
			checkForSmallestFibonacciGcd(Integer.parseInt(br.readLine()));

			System.out.format("%d %d" + fibGcd.get(0), fibGcd.get(1));
		}
	}

	private static void checkForSmallestFibonacciGcd(int number) {

		// fill the list with all the prime numbers
		findListOfPrime(number);

		findFibonacci(number);

	}

	private static List<Integer> findListOfPrime(int number) {
		// TODO Auto-generated method stub
		for (int i = 1; i < number; i++) {
			boolean isPrime = true;

			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					isPrime = false;
					break;

				}
			}
			if (isPrime) {
				primeList.add(i);
			}
		}
		return primeList;
	}

	private static Integer findFibonacci(int number) {
		for (int i = 0; i < primeList.size(); i++) {

			if (number <= 1) {
				return number;
			}
			return findFibonacci(primeList.get(i) % (number - 1))
					+ findFibonacci(primeList.get(i) % (number - 2));
		}
		return number;
	}
}
