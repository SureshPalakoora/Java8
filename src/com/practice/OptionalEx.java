package com.practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class OptionalEx {

	public static void main(String[] args) {
		
		int[] numbers = {1,2,2,34,2,2,2,9,3};
		
		Optional<Integer> numbersGreaterThan10 = Arrays.stream(numbers).filter(n -> n>10).boxed().findFirst();
		Integer result = numbersGreaterThan10.orElseThrow();
		System.out.println(result);

	}

}
