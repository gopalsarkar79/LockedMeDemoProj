package com.LockedMe;

import java.sql.SQLException;
import java.util.Scanner;

public class MainDisplay {

	public static void main(String[] args) throws Exception {
		System.out.println("Hello My name is Gopal Sarkar!");
		System.out.println("I am a full Stack Java Developer!");
		System.out.println("On this App, you can search for a file or Delete a file or uplaod a file as per your preference!");
		System.out.println("Let us get started!");
		System.out.println("\nHere are few files you can download:");
		System.out.println("1: Employee names.");
		System.out.println("2: Employee salary.");
		System.out.println("3: Employee departments.");
		System.out.println("4: Employee tenure.");
		System.out.println("5: All the details combined.");
		System.out.println("Please enter the option as per your preference! (I.e 1, 2, 3, 4, 5)");
		Scanner scanner= new Scanner(System.in);
		int input= scanner.nextInt();
		while(input>0) {
		switch(input) {
		case 1: 
			EmployeeName employee= new EmployeeName();
			employee.disply();
			break;
			
		case 2:
			EmployeeSalary salary= new EmployeeSalary();
			salary.display();
			break;
			
		case 3: 
			EmployeeDepartments department= new EmployeeDepartments();
			department.disply();
			break;
			
		case 4:
			EmployeeTenure tenure= new EmployeeTenure();
			tenure.display();
			break;
			
		case 5: 
			CombinedDetails cd= new CombinedDetails();
			cd.display();
			break;
			
			
		}
		break;
		}
		
		
		
		System.out.println("\nYou can use this option to upload a file!"+"\nClick to upload");
		System.out.println("\nYou can delete the uploaded file here!"+"\nClick to choose and delete" );

	}

}
