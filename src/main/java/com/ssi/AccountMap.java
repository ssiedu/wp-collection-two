package com.ssi;

import java.util.Collection;
import java.util.HashMap;

public class AccountMap {

	public static void main(String[] args) {
		Account ac1 = new Account(60811, "Rajeev", 50000);
		Account ac2 = new Account(50711, "Shiv", 15000);
		Account ac3 = new Account(20342, "John", 120000);
		Account ac4 = new Account(40826, "Manish", 50000);
		
		HashMap<Account,String> map=new HashMap<>();
		map.put(ac1,ac1.getName());
		map.put(ac2, ac2.getName());
		map.put(ac3, ac3.getName());
		//map.put(ac1, "XYZ");
		//System.out.println(map);
		//map.put(ac1, "XYZ");
		//System.out.println(map.get(ac1));
		/*
		HashMap<Integer,Account> map=new HashMap<>();
		//LinkedHashMap<Integer, Account> map =new LinkedHashMap<>();
		//TreeMap<Integer,Account> map=new TreeMap<Integer, Account>();
		map.put(ac1.getAccountNo(), ac1);
		map.put(ac2.getAccountNo(), ac2);
		map.put(ac3.getAccountNo(), ac3);
		//System.out.println(map);
		map.put(ac4.getAccountNo(), ac4);
		//System.out.println(map);
		//System.out.println(map.get(60811));
		//map.remove(40826);
		//System.out.println(map);
		//Account account=map.get(50711);
		//System.out.println(account);
		
		Set<Integer> keys=map.keySet();
		System.out.println(keys);
		*/
		
		Collection<String> values=map.values();
		System.out.println(values);
		
		
	}

}
