package com.LockedMe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeSalary {
	
	public void display() {
List<Integer> list = new ArrayList();
		
		list.add(50000);
		list.add(55000);
		list.add(57000);
		list.add(58000);
		list.add(60000);
		list.add(80000);
		list.add(90000);
		
		Collections.sort(list);
		for(int i:list) {
		System.out.println("The salaries are: "+i);
		}
	}

}
