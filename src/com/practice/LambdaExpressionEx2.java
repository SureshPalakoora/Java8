package com.practice;

@FunctionalInterface
interface MathOperation
{
	int operate(int a, int b);
}

@FunctionalInterface
interface CheckEven
{
	boolean isEven(int a);
}

public class LambdaExpressionEx2 {

	public static void main(String[] args) {
		
		MathOperation sum = (a,b) -> a + b;
		int addition = sum.operate(32,45);
		System.out.println(addition);

		
		
		CheckEven check = (a) -> a%2==0;
		boolean even = check.isEven(123);
		System.out.println(even);
		
		MathOperation max = (a,b) -> a>b?a:b;
		int maxCheck = max.operate(234, 789);
		System.out.println(maxCheck);
	}

}
