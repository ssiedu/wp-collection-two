package com.ssi;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class StudentData {

	public static void main(String[] args) {
		
		Student s1=new Student(111,"AAA","Dev");
		Student s2=new Student(112,"BBB","QA");
		Student s3=new Student(113,"CCC","QA");
		Student s4=new Student(114,"DDD","Dev");
		
		List<Student> coreJavaStudents=new ArrayList<>();
		List<Student> advJavaStudents=new ArrayList<>();
		coreJavaStudents.add(s1); coreJavaStudents.add(s2);
		advJavaStudents.add(s3); advJavaStudents.add(s4);
		System.out.println(coreJavaStudents);
		System.out.println(advJavaStudents);
		List<Student> allStudents=new ArrayList<>();
		allStudents.addAll(coreJavaStudents);
		allStudents.addAll(advJavaStudents);
		System.out.println(allStudents);
		//allStudents.removeAll(coreJavaStudents);
		//allStudents.retainAll(coreJavaStudents);
		allStudents.clear();
		System.out.println(allStudents);
		
		
		
		/*
		HashSet<Student> set=new HashSet<>();
		set.add(s1);set.add(s2);
		System.out.println(set.size());	System.out.println(set);
		
		List<Student> list=new ArrayList<>();
		list.add(s1); list.add(s2);
		System.out.println(list);*/
				
		
	}

}
