package com.practice;

import java.util.Arrays;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class Example3 {

	public static void main(String[] args) {
		
		int[] numbers = {1,2,3,56,2,643,232,13,13,22131,31,134123,11};
		
		
		boolean checkEvenNumbers = Arrays.stream(numbers).anyMatch(n -> n%2==0);
		System.out.println(checkEvenNumbers);
		
		
		boolean none = Arrays.stream(numbers).noneMatch(n -> n>150000);
		System.out.println(none);
		
		boolean allCheck = Arrays.stream(numbers).allMatch(n->n<15332);
		System.out.println(allCheck);
		
		boolean anyCheck = Arrays.stream(numbers).anyMatch(n->n<15332);
		System.out.println(anyCheck);
		
		
		IntStream nums = IntStream.of(1,2,3,4,5);
		nums.forEach(System.out::println);
		
		
		IntStream.range(1, 5).forEach(n->System.out.print(n+" "));
		System.out.println();
		IntStream.rangeClosed(1, 5).forEach(n->System.out.print(n+" "));
		System.out.println();
		DoubleStream.iterate(0, n->n+1).limit(5).forEach(n->System.out.print(n+" "));
		
		

	}

}
