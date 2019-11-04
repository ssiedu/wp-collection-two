package com.ssi;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class CollectionIteration {

	public static void main(String[] args) {
		
		List<String> list1=Arrays.asList("indore","bhopal","delhi");
		/*List<Integer> list2=Arrays.asList(10,20,30,40,50);
		List<Student> list3=Arrays.asList(new Student(111,"AA","Dev"),new Student(112,"BB","QA"));
		*/
		
		Iterator<String> iterator=list1.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		
		
	/*	for(int i=0; i<list1.size(); i++) {
			System.out.println(list1.get(i));
		}*/
		
		
		/*for(String s:list1) {
			System.out.println(s);
		}*/
		
		
		
		/*//converting list to a array
		Object ar[]=list1.toArray();
		for(Object obj:ar) {
			System.out.println(obj);
		}*/
		
		

	}

}
