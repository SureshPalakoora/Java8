package com.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MethodReferenceEx1 {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("John","Doe","Vijay","Ravi");
		
		names.forEach(System.out::println);
		
		names.sort(String::compareToIgnoreCase);
		System.out.println(names);
		
		

	}

}
