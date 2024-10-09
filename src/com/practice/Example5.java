package com.practice;

import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntPredicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Example5 {

	public static void main(String[] args) {
	
		Function<String,Integer> stringLength = s-> s.length();
		int result = stringLength.apply("Hello");
		System.out.println(result);
		
		
		Consumer<String> print = s-> System.out.println(s);
		print.accept("Hello");
		
		
		Supplier<Double> randomValue = ()->Math.random();
		Double d = randomValue.get();
		System.out.println(d);
		
		UnaryOperator<Integer> square = x -> x*x;
		int squareResult = square.apply(5);
		System.out.println(squareResult);
		
		
		BinaryOperator<Integer> sum = (a,b)->a+b;
		int sumResult = sum.apply(5, 10);
		System.out.println(sumResult);
		
		IntPredicate value = n -> n%2 ==0;
		boolean b = value.test(96);
		System.out.println(b);
		

	}

}
