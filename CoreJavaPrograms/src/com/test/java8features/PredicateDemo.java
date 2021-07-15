package com.test.java8features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;




public class PredicateDemo {
	public static void main(String[] args) {
	/*
		Predicate<Integer> pred=num->num%2==0;
		System.out.println(pred.test(3));*/
		
		List<String> names = Arrays.asList("Reflection","Collection","Stream");
		List<String> result = names.stream().map(String::valueOf).filter(s->s.startsWith("S")).collect(Collectors.toList());
		System.out.println(result);
		
		
	}

}
