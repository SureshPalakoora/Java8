package com.practice;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example4 {

	public static void main(String[] args) {
		
		
		 String[] namesArray = {"Alice", "Bob", "Charlie", "David", "Eve"};
		 
		 Stream.of("AJ","Hello")
         .filter(name -> name.startsWith("A")).forEach(System.out::println);;
         
         
         Arrays.stream(namesArray).filter(name -> name.startsWith("D")).forEach(System.out::println);
         
         
       List<String> namesList = List.of("Alice","Bob","Charlie","David","Eve");
       
       System.out.println("-----Testing Joining----");
       String s1 = namesList.stream().collect(Collectors.joining());
       System.out.println(s1);
       
       String s2 = namesList.stream().collect(Collectors.joining(","));
       System.out.println(s2);
       
       String s3 = namesList.stream().collect(Collectors.joining(",","[","]"));
       System.out.println(s3);
       
       System.out.println("------Using Grouping By------");
       Map<Integer,List<String>> nameListLength = namesList.stream().collect(Collectors.groupingBy(String::length));
       nameListLength.forEach((key,value)-> System.out.println(key+" "+value));
       
       System.out.println("------Using Grouping By with Count------");
       Map<Integer,Long> nameListLengthAndCount = namesList.stream().collect(Collectors.groupingBy(String::length,Collectors.counting()));
       nameListLengthAndCount.forEach((key,value)-> System.out.println(key+" "+value));
       
       
       List<Integer> numberList = List.of(1,2,3,4,5,6,7,8,9,10);
       
       System.out.println("----------Using Partitioning By----------");
       
       Map<Boolean,List<String>> partitionNameList = namesList.stream().collect(Collectors.partitioningBy(name->name.length()>4));
       System.out.println("List with names greater than length of 4"+partitionNameList.get(true));
       System.out.println("List with names less than length of 4"+partitionNameList.get(false));
       
       Map<Boolean,Long> partitionTotalCountOfNames = namesList.stream().collect(Collectors.partitioningBy(name-> name.length() >4 ,Collectors.counting()));
       System.out.println("Total count of names greater than length of 4 are "+partitionTotalCountOfNames.get(true));
       System.out.println("Total count of names less than length of 4 are "+partitionTotalCountOfNames.get(false));
       
       
       Map<Boolean, IntSummaryStatistics> partitionWithSum = numberList.stream().collect(Collectors.partitioningBy(n->n%2==0,Collectors.summarizingInt(Integer::intValue)));
       System.out.println("Sum of even numbers: " + partitionWithSum.get(true));  
       System.out.println("Sum of odd numbers: " + partitionWithSum.get(false)); 
       
       System.out.println("-------Using toMap-------");
       Map<Integer,String> nameLengthMap = namesList
    		                                  .stream()
    		                                  .collect(Collectors.
    		                                		  toMap(name->name.length(), name->name,
    		                                				  (existing,replacement)->existing+","+replacement, TreeMap::new));
       
       nameLengthMap.forEach((key,value)->System.out.println(key+" "+value));

	}

}
