package com.LockedMe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeTenure {
	public void display() {
		List<Integer> list = new ArrayList();
				
				list.add(10);
				list.add(5);
				list.add(6);
				list.add(7);
				list.add(4);
				list.add(13);
				list.add(15);
				
				Collections.sort(list);
				for(int i:list) {
				System.out.println("The Tenure are: "+i + " years.");
				}
			}

}
