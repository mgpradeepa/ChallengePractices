package com.mgp.gfg.prac.gts;

public class OneBitCharacter {

	public static boolean isOneBitCharacter(int[] bits ) {
		for(int i = 0 ; i < bits.length; i++) {
			if(bits[i] == 1) i++;
			else {
				if(i == bits.length-1 && bits[i] == 0) return true;
			}

		}
				return false;
	}

	public static void main(String... args) {
		int[] bits = {1,0,0};
		System.out.println(isOneBitCharacter(bits));
	}
}