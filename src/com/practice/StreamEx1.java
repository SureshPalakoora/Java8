package com.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamEx1 {

	public static boolean isPrime(int n)
	{
		if(n<=1)
		{
			return false;
		}
		
		for(int i=2;i<=Math.sqrt(n);i++)
		{
			if(n%i==0)
			{
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		

		int[] numbers = {1,2,3,4,5,6,7,8};
		
		
		Arrays.stream(numbers).filter(n->n%2!=0).forEach(n->System.out.print(n+" "));
		System.out.println();
		
		IntStream numberStream = Arrays.stream(numbers);
		
		/*
		 * int[] evenStream = numberStream .filter(n->n%2==0) .toArray();
		 * 
		 * for(int evenNumber: evenStream) { System.out.print(evenNumber+" "); }
		 */
		
		
		
		/*
		 * numberStream .filter(n->n%2==0) .forEach(n->System.out.print(n+" "));
		 */
		
		
		List<Integer> numberList = numberStream.filter(n->n%2==0).boxed().sorted((a,b)-> b-a).collect(Collectors.toList());
		
		System.out.println(numberList);
		
		
		
		
		int[] numbersArr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14};
		
		long count = Arrays.stream(numbersArr).count();
		int sum = Arrays.stream(numbersArr).sum();
		System.out.println("Sum of "+count+" numbers is "+sum);
		
		
		IntStream numberStreamArr = IntStream.of(numbersArr);
		
		IntStream primeNumbers = numberStreamArr.filter(n-> isPrime(n)); 
		
		primeNumbers.forEach(n-> System.out.print(n+" "));
		
		System.out.println();
		
		
		List<String> stringList = Arrays.asList("Suresh","Ramesh","Ajay","Vijay");
		
		stringList.stream()
		             .filter(s -> s.endsWith("ay"))
		            // .map(s-> s.toUpperCase())
		             .map(String::toUpperCase)
		             .forEach(System.out::println);
		
		
		
		List<Integer> nums = Arrays.asList(2,3,5,7,8);
		
		int result = nums.stream().map(n->n*n)
		.reduce(0,Integer::sum);
		
		System.out.println(result);
		
	}

}
