package com.epam.java8.epam;

import java.util.Arrays;
import java.util.List;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class Palindrome {
	public static void main(String[] args) {
	     String [] strArray = {"madam","abcba","lasya"};
	     List<String> strList = Arrays.asList(strArray);
	     List<String> finalList=new ArrayList();
	     for(String str:strList) {
	    	 if(isPalindrome(str)) {
	    		 finalList.add(str);
	    	 }
	     }
	     System.out.println("The list of palindromes are:");
	     for(String str:finalList) {
	    	 System.out.println(str);
	     }
	     
}
	public static boolean isPalindrome(String text) {
		String temp = text.toLowerCase();
   	 	return IntStream.range(0, temp.length() / 2).noneMatch(i -> temp.charAt(i) != temp.charAt(temp.length() - i - 1));
   	 }

}
