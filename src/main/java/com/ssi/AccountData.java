package com.ssi;

import java.util.Arrays;

public class AccountData {

	public static void main(String args[]) {

		Account ac1 = new Account(60811, "Rajeev", 50000);
		Account ac2 = new Account(50711, "Shiv", 15000);
		Account ac3 = new Account(20342, "John", 120000);
		Account ac4 = new Account(40826, "Manish", 50000);
		
		Account accounts[]= {ac1,ac2,ac3,ac4};
		
		for(Account account:accounts) {
			System.out.println(account);
		}
		System.out.println("______________________________________________________________");
		System.out.println("Sorting Accounts Array : ");
		System.out.println("______________________________________________________________");
		Arrays.sort(accounts);
		for(Account account:accounts) {
			System.out.println(account);
		}
		
		
		
		
	}
}
