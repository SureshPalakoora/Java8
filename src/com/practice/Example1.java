package com.practice;

import java.util.Arrays;
import java.util.List;

public class Example1 {

	public static void main(String[] args) {
		

		List<Integer> numList= Arrays.asList(1,2,3,5,12,15,16,23,532,143);
		
		numList.stream()
		.map(n->n.toString())
		.filter(s->s.startsWith("1"))
		.forEach(s->System.out.print(s+" "));
	}

}
