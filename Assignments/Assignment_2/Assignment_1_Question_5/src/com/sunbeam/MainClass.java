package com.sunbeam;

import java.util.Arrays;

public class MainClass {
	
	public static void SortByEmployee(Employee[] emp,int size)
	{
		for(int i=0;i<size;i++)
		{
			Employee temp = emp[i];
			int j;
			for(j=i-1;j>=0;j--)
			{
				if(emp[j].getSalary()>temp.getSalary())
				{
					emp[j+1]=emp[j];			
				}
				else
					break;
			}
			 emp[j+1]=temp;
			
		}
	}

	public static void main(String[] args) {
		
		Employee[] emp = new Employee[5];
		emp[0] = new Employee(1,"Saurabh",234000.50);
		emp[1] = new Employee(5,"Manav",450000.56);
		emp[2] = new Employee(3,"Nisha",120000);
		emp[3] = new Employee(2,"Vaibhaw",5600000);
		emp[4] = new Employee(4,"Ashish",4600000);
		
		System.out.println("Employees before sort: ");
		
		System.out.println(Arrays.toString(emp));
		
		SortByEmployee(emp,emp.length);
		
		System.out.println("Employees before sort: ");
		
		System.out.println(Arrays.toString(emp));
		

	}

}
