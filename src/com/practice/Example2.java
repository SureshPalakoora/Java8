package com.practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class Example2 {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,3,5,6,7,8,7,8,9);
		
		Set<Integer> set = new HashSet<>();
		
		list.stream().filter(n -> !set.add(n)).forEach(System.out::println);
		
		
		List<Integer> list1 = Arrays.asList();
		Optional<Integer> first = list.stream().findFirst();
		if(first.isPresent())
		{
			System.out.println(first.get());
		}
		else
			System.out.println("List is empty");
		

		int max = list.stream().max(Integer::compare).get();
		
		System.out.println(max);
		
		
	}

}
