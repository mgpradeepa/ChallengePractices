package com.mgp.aoip.ISP.pracstring;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Set;

import static java.lang.System.in;
public class CheckPrime {
	
	
	public static void main(String[] args) {
		System.out.println("  ");
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			int n1 = Integer.parseInt(br.readLine());
			int n2 = Integer.parseInt(br.readLine());
			int n3 = Integer.parseInt(br.readLine());
			int n4 = Integer.parseInt(br.readLine());
			int n5 = Integer.parseInt(br.readLine());
			Prime ob = new Prime();
			ob.checkPrime(n1);
			ob.checkPrime(n1, n2);
			ob.checkPrime(n1, n2, n3);
			ob.checkPrime(n1, n2, n3, n4, n5);
			Method[] methods = Prime.class.getDeclaredMethods();
			Set<String> set = new HashSet<>();
			boolean overload = false;
			for (int i = 0; i < methods.length; i++) {
				if (set.contains(methods[i].getName())) {
					overload = true;
					break;
				}
				set.add(methods[i].getName());

			}
			if (overload) {
				throw new Exception("Overloading not allowed");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}


class Prime {
	

	public void checkPrime(Integer... nums) {
		for (Integer in : nums) {
			if (isPrime(in)) {
				System.out.print(in + " ");
			}
		}
		System.out.println();

	}

	private boolean isPrime(int n) {
		if(n == 1) return false;
		for(int i=2; i<=n/2; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;

	}
}
