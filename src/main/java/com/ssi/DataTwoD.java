package com.ssi;

public class DataTwoD {

	public static void main(String[] args) {
		
		int x[][]= {{11,12,13,14,16},{21,22,23},{31},{41,42,44,44},{55,56}};
		
/*		int x[][]=new int[3][];
		x[0]=new int[4];
		x[1]=new int[2];
		x[2]=new int[3];
		
		x[0][0]=10; x[0][1]=12; x[0][2]=14; x[0][3]=16;
		x[1][0]=20; x[1][1]=22; 
		x[2][0]=30; x[2][1]=32; x[2][2]=34; 
*/		
		for(int tmp[]:x) {
			for(int n:tmp) {
				System.out.print(n+"\t");
			}
			System.out.println();
		}
		
		
		/*for(int i=0; i<x.length ; i++) {
			for(int j=0; j<x[i].length; j++) {
				System.out.print(x[i][j]+"\t");
			}
			System.out.println("");
		}*/

	}

}
