package com.LockedMe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeName {

	public void disply() {
List<String> list = new ArrayList();
		
		list.add("Gopal");
		list.add("John");
		list.add("Sam");
		list.add("Mark");
		list.add("Wasim");
		list.add("Ron");
		list.add("Neha");
		
		Collections.sort(list);
		
		for(String i: list ) {
		System.out.println(" These are the current Employees "  + ": " + i);
		}

	}

}

