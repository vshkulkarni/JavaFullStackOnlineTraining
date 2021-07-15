package com.test.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String[] args) {
		
		
		//stream example with reference  object 
		List<String> list = Arrays.asList("ABC", "PQR", "XYZ"); // foreach
		list.stream().forEach(System.out::print); // reference operator

		//foreach with lambda expression passing 
		List<String> list1 = Arrays.asList("ABC", "PQR", "XYZ");
		list.stream().forEach(p -> System.out.println(p));

		
		//join operation
	
		String finalString = list.stream().collect(Collectors.joining(" "));
		System.out.println(finalString);

	   Stream stream=Stream.of("A","B","C","D");  //stream 
		System.out.println(stream.findFirst());
		
	
		
		//intermidate procession, termination procesion

		
	}

}
