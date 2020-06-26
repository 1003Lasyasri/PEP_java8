package com.epam.java8.epam;
import java.io.*;
import java.util.*;

public class Average {
	public static void main(String args[])
	{
		int[] arr= new int[10];
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter array size:");
			int n=sc.nextInt();
			for(int i =0;i<=n;i++)
			{
				arr[i]=sc.nextInt();
			}
		}
		double res=Average(arr);
		System.out.println("The average of list of integers is:"+res);
	
	}
	public static double Average(int[] array) {
		return Arrays.stream(array).average().orElse(Double.NaN);
		}
	
}