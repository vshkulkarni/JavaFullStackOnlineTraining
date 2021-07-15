package com.test.string.demo;

public class DiffernceStringBufferBuilder {


//Java program to demonstrate difference between String, 
//StringBuilder and StringBuffer 

 // Concatenates to String 
 public static void concat1(String s1) 
 { 
     s1 = s1.concat("One"); 
 } 

 // Concatenates to StringBuilder 
 public static void concat2(StringBuilder s2) 
 { 
     s2.append("two"); 
 } 

 // Concatenates to StringBuffer 
 public static void concat3(StringBuffer s3) 
 { 
     s3.append("three"); 
 } 

 public static void main(String[] args) 
 { 
    // String s1 = "test"; 
	 String s1=new String("test");
     concat1(s1);  // s1 is not changed 
     System.out.println("String: " + s1); 

     StringBuilder s2 = new StringBuilder("test"); 
     concat2(s2); // s2 is changed 
     System.out.println("StringBuilder: " + s2); 

     StringBuffer s3 = new StringBuffer("test"); 
    
     concat3(s3); // s3 is changed 
     System.out.println("StringBuffer: " + s3); 
 } 
} 