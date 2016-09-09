package com.mgp.aoip.ISP.pracstring.hackerrank12;

import java.util.Scanner;

public class RepeatedString {
	public static void main(String[] args) {
		System.out.println("");
		Scanner in = new Scanner(System.in);
		String s = in.next();
		long n = in.nextLong();

		// specification

		// append the same string to itself until the n value crossed.
		// have the length of the string calculated everytime.
		// once the string is appended, and increased out of the n given, take
		// te substring and count the number of a
		//
		// if the intial string count is just 1 with a then donot do these
		// operation . just render back the n value.

		int sizeOfString = s.length();
		StringBuffer sb = new StringBuffer(s);
		if(sizeOfString ==1 && s.charAt(0) == 'a'){
			System.out.println(n);
			
		}
		else{
			checkforInfinity(sb, s, n, sizeOfString);
		}
	}

	private static void checkforInfinity(StringBuffer sb, String s, long n, int size) {
		
		do{
			sb.append(s);
			size= sb.length();
			
		}while(size<n);
		System.out.println("size of infinity check " + size);
		String formedInfinityString = sb.toString();
		String requiredInfinityString = formedInfinityString.substring(0, (int)n);
		
		int anum =  numOfA(requiredInfinityString);
		System.out.println("total a num count = " + anum+ " " + requiredInfinityString + " form  " + formedInfinityString);
	}

	private static int numOfA(String requiredInfinityString) {
		int count = 0;
		for(int i =0;i<requiredInfinityString.length();i++){
			if(requiredInfinityString.charAt(i) =='a') count++;
		}
		return count;
	}
	
}
