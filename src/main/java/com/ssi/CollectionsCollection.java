package com.ssi;

import java.util.ArrayList;
import java.util.List;

public class CollectionsCollection {
public static void main(String[] args) {
		
		Student s1=new Student(111,"AAA","Dev");
		Student s2=new Student(112,"BBB","QA");
		Student s3=new Student(113,"CCC","QA");
		Student s4=new Student(114,"DDD","Dev");
		
		List<Student> coreJavaStudents=new ArrayList<>();
		List<Student> advJavaStudents=new ArrayList<>();
		coreJavaStudents.add(s1); coreJavaStudents.add(s2);
		advJavaStudents.add(s3); advJavaStudents.add(s4);
		
		
		List<List<Student>> wpStudents=new ArrayList();
		wpStudents.add(coreJavaStudents);
		wpStudents.add(advJavaStudents);
		
		for(List<Student> list1:wpStudents) {
			for(Student item:list1) {
				System.out.println(item);
			}
		}
		
		
		
		
		
		
}
}
