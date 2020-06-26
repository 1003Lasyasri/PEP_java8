package com.epam.java8.epam;

import java.util.*;
import java.util.function.Predicate;
import java.util.Optional;
public class Stringtest {

	  public static void main(String[] args) {
	     String [] strArray = {"aaa", "abc", "cc", "race", "time", "", "null", "MM", "yes", "NN"};
	     List<String> strList = Arrays.asList(strArray);
	     
		 List<String> listWithoutEmptyStr = filterEmptyStrings(strList, (String str) -> str.length()==3 && str.charAt(0)=='a');
	     System.out.println(listWithoutEmptyStr);
	  }

	  public static List<String> filterEmptyStrings(List<String> list, Predicate<String> predicate) {
	     List<String> finalList = new ArrayList<>();
	     
		 for (String str : list) {
	       if(predicate.test(str)) {
	         finalList.add(str);
	       }
	    }
	  return finalList;
	  }
	}
