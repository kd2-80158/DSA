package com.sunbeam;

import java.util.Scanner;

public class MainClass {
	
	public static int findRank(int arr[],int size,int key)
	{
		int count=0;
		for(int i=0;i<size;i++)
		{
			count++;
			if(arr[i]==key)
				return count;
				
		}
		return -1;
	}

	public static void main(String[] args) {
		int arr[] = { 10, 20, 15, 3, 4, 4, 1 };
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the element to find its rank:");
		int key = sc.nextInt();
		int result = findRank(arr,arr.length,key);
		if(result!=-1)
		   System.out.println("Rank of the given element is: "+result);
		else
			System.out.println("Key not found");

	}

}
