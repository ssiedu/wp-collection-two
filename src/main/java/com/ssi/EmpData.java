package com.ssi;

import java.util.Arrays;

public class EmpData {

	public static void main(String[] args) {

		Emp e[]= {new Emp(111,"AAA",50000), new Emp(112,"BBB",25000), new Emp(113,"CCC",90000)};
		
		
		String s[]= {"indore","bhopal","delhi","chennai","agra"};
		
		Arrays.sort(e);
		
		for(Emp emp:e) {
			System.out.println(emp);
		}
		
		
		
		
		/*Arrays.sort(s);
		
		for(String tmp:s) {
			System.out.println(tmp);
		}
		*/
		
		
		
		/*Emp e[]=new Emp[3];
		e[0]=new Emp(111,"AAA",10000);
		e[1]=new Emp(112,"BBB",20000);
		e[2]=new Emp(113,"CCC",30000);*/
		/*for(Emp emp:e) {
			System.out.println(emp);
		}*/
		
	}

}
