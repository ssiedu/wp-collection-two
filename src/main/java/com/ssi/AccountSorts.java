package com.ssi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class AccountNumberComparator implements Comparator<Account>{

	@Override
	public int compare(Account first, Account second) {
		return first.getAccountNo()-second.getAccountNo();
	}
	
}

class CustomerNameComparator implements Comparator<Account>{

	@Override
	public int compare(Account first, Account second) {
		return first.getName().compareTo(second.getName());
	}
	
}
class BalanceComparator implements Comparator<Account>{

	@Override
	public int compare(Account first, Account second) {
		return first.getBalance()-second.getBalance();
	}
	
}


public class AccountSorts {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in)	;
		Account ac1 = new Account(60811, "Rajeev", 50000);
		Account ac2 = new Account(50711, "Shiv", 15000);
		Account ac3 = new Account(20342, "John", 120000);
		Account ac4 = new Account(40826, "Manish", 50000);
		
		Account accounts[]= {ac1,ac2,ac3,ac4};
		System.out.println("Give your sorting choice : 1. ano, 2. name, 3. balance :");
		int choice=sc.nextInt();
		if(choice==1) {
			Arrays.sort(accounts, new AccountNumberComparator());
		}else if(choice==2) {
			Arrays.sort(accounts, new CustomerNameComparator());
		}else if(choice==3) {
			Arrays.sort(accounts, new BalanceComparator());
		}else{
			Arrays.sort(accounts);
		}
		System.out.println("AFTER SORTING ============================>");
		for(Account account:accounts) {
			System.out.println(account);
		}
		
	}

}
