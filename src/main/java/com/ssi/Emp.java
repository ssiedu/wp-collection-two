package com.ssi;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Emp implements Comparable<Emp> {
	private int eno;
	private String ename;
	private int sal;
	
	@Override
	public int compareTo(Emp emp) {

		if(sal>emp.sal) {
			return 1;
		}else if(sal<emp.sal) {
			return -1;
		}else {
			return 0;
		}
		
	}
}
