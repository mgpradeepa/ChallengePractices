package com.mgp.hackerrank.ISP.cafecheck;

public class CafeCheckSolution {

	/**
	 * @param args
	 */
	static int servedComputers = 0;
	static int leavingCustomers = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numOfComputers = 1;
		// String customers = "ABCBCA";
		String customers = "ABBA";
		int result = runCustomerSimulation(numOfComputers, customers);
		System.out.println(result);
	}

	static int runCustomerSimulation(int numComputers, String customers) {

		char[] customerArray = customers.toCharArray();
		char[] servedCustomers = new char[customerArray.length];
		char[] waitingCustomer = new char[customerArray.length];

		for (int i = 0; i < customerArray.length; i++) {
			if (servedComputers <= numComputers) {
				if (!(checkServed(customerArray[i], servedCustomers))) {

					servedCustomers[i] = customerArray[i];

					servedComputers++;
				} else if (!(checkWait(customerArray[i], waitingCustomer))) {
					waitingCustomer[i] = customerArray[i];
				} else {
					leavingCustomers++;
				}

			}
		}

		return leavingCustomers;
	}

	private static boolean checkWait(char c, char[] waitingCustomer) {
		for (int j = 0; j < waitingCustomer.length; j++) {

			if (c == waitingCustomer[j]) {

				return true;

			}
		}
		return false;
	}

	private static boolean checkServed(char c, char[] servedCustomer) {
		for (int j = 0; j < servedCustomer.length; j++) {

			if (c == servedCustomer[j]) {

				return true;

			}
		}
		return false;
	}

	static int rCS(int numComputers, String customers) {

		return 0;
	}
}
