package com.selenium.project;

import java.util.Arrays;
import java.util.Comparator;


public class Test {
	public static void main(String args[]) {
		String[] arr = {"c","d","b","a","e"};
		InnerClass in = new InnerClass();
		Arrays.parallelSort(arr,in);
		for(String str: arr	) {
			System.out.println(str+"");
			System.out.println(Arrays.binarySearch(arr,"b"));
			
		}
		
	}
	static class InnerClass implements Comparator<String>{
		public int compare(String s1, String s2) {
			return s2.compareTo(s1);
		}

		
	}

}
