package com.mgp.gfg.prac.gts;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SelfDividingNumber{

	public static void main(String... args) {
		int left = 1;
		int right = 22;

		List<Integer> result =  selfDividingNumber(left, right);

		for(Integer res : result){
			System.out.println(res);
		}
	}

	public static List<Integer> selfDividingNumber(int left, int right){

		// java8+ 
		return IntStream.rangeClosed(left, right)
		.filter(i-> String.valueOf(i).chars()
	    .map(Character::getNumericValue)
	    . allMatch(digit -> digit !=0 && i %digit == 0 ) )
	    .boxed()
	    .collect(Collectors.toList());
	}

}