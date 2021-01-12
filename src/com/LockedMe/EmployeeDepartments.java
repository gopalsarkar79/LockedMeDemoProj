package com.LockedMe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeDepartments {
	public void disply() {
		List<String> list = new ArrayList();
				
				list.add("Operations");
				list.add("Analytics");
				list.add("IT");
				list.add("HR");
				list.add("Accounts");
				list.add("Security");
				list.add("Collections");
				
				Collections.sort(list);
				
				for(String i: list ) {
				System.out.println(" These are the current Employees "  + ": " + i);
				}

			}

}
