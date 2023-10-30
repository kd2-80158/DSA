package com.sunbeam;

import java.util.Scanner;

public class LinearSearch {
	
	public static int printComp(int arr[],int size,int key)
	{
		for(int i=0;i<size;i++)
		{
			if(key==arr[i])
			  return i+1;
		}
		
		return -1;
	}

	public static void main(String[] args) {
		
		int arr[] = {10,20,30,40,50,60,70,80};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the key to search: ");
		int key = sc.nextInt();
		
		int result = printComp(arr,arr.length,key);
		if(result!=-1)
		   System.out.println("Number of comparision: "+result);
		else
		   System.out.println("Number of comparision: "+arr.length);
		

	}

}
