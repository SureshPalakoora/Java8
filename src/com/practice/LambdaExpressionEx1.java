package com.practice;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.DoubleBinaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.function.IntPredicate;

public class LambdaExpressionEx1 {

	
	public static void main(String[] args) {
		
		BiFunction<Integer,Integer,Integer> sum1 = (a,b) -> a + b;		
		Integer result1 = sum1.apply(25,35);		
		System.out.println("Result using BiFunction "+result1);
		
		
		
		BinaryOperator<Integer> sum2 = (a,b) -> a + b;		
		Integer result2 = sum2.apply(25,35);		
		System.out.println("Result using BinaryOperator "+result2);
		
		
		
		
		IntBinaryOperator sum3 = (a,b) -> a + b;		
		int  result3 = sum3.applyAsInt(25, 35);		
		System.out.println("Result using IntBinaryOperator "+result3);
		
		
		
        DoubleBinaryOperator sum4 = (a,b) -> a + b;		
		double  result4 = sum4.applyAsDouble(25.4, 35.6);		
		System.out.println("Result using DoubleBinaryOperator "+result4);
		
		
		BinaryOperator<String> concat = (s1,s2) -> s1 + s2;		
		String s3 = concat.apply("How are ", "you?");		
		System.out.println(s3);
		
		
		BinaryOperator<Integer> max = (a,b) -> a>b?a:b;		
		Integer resultMax = max.apply(435, 6343);		
		System.out.println(resultMax);
		
		
	    IntPredicate isEven = a -> a%2==0;
	    boolean resultEvenOrNot = isEven.test(456);
	    System.out.println(resultEvenOrNot);
	    
		

	}

}
