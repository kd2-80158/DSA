package com.sunbeam;

import java.util.Scanner;

public class SearchBySalary {
	
	//Search by empName
		public static int searchBySalary(Employee emp[],double salary,int size)
		{
			for(int i=0;i<emp.length;i++)
			{
				if(salary==emp[i].getSalary())
				{
					return i;
				}
			}
			return -1;
		}
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Employee[] emp = new Employee[5];
		
		
		System.out.println("Enter employee salary to search: ");
		double salary = sc.nextDouble();
		
		emp[0] = new Employee(1,"Saurabh",2800000);
		emp[1] = new Employee(2,"Vaibhaw",3300000.60);
		emp[2] = new Employee(4,"Rohit",450000);
		emp[3] = new Employee(3,"Ashish",300000);
		emp[4] = new Employee(5,"Saurav",500000);
		
		int result = searchBySalary(emp, salary, emp.length);
		if(result!=-1)
		{
			System.out.println(emp[result]);
		}
		else
		{
			System.out.println("Employee not found");
		}

	}

}
