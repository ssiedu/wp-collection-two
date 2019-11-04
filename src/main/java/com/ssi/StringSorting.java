package com.ssi;

import java.util.Arrays;
import java.util.Comparator;

class MyOwnComparator implements Comparator<String>{

	@Override
	public int compare(String firstString, String secondString) {
		
			//return firstString.length()-secondString.length();
		
			int len1=firstString.length();
			int len2=secondString.length();
			if(len1>len2) {
				return 1;
			}else if(len1<len2) {
				return -1;
			}else {
				return 0;
			}
		
	}


	
}


public class StringSorting {

	public static void main(String[] args) {
	
		
		String s[]= {"indore","bhopal","agra","delhi","chennai","goa"};
		for(String tmp:s) {
			System.out.println(tmp);
		}
		System.out.println("Sorting Array=>>>>>>>>>>>>>>>>>>>");
		//Arrays.sort(s);
		Arrays.sort(s, new MyOwnComparator());
		for(String tmp:s) {
			System.out.println(tmp);
		}
	}

}
