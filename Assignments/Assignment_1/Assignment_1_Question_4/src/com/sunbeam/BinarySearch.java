package com.sunbeam;

import java.util.Scanner;

public class BinarySearch {
	
	public static int printComp(int arr[],int size,int key)
	{
		int start=0;
		int end=size-1;
		while(start<=end)
		{
			int mid = (start+end)/2;
			
			if(key==arr[mid])
				{
			    return mid;
				}
			else if(key<arr[mid])
				
				{
				start=mid+1;
				}
			else
			{
				end=mid-1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int arr[] = {80,70,60,50,40,30,20,10};
		
		System.out.println("Enter the key to search: ");
		int key = sc.nextInt();
		
		int result = printComp(arr,arr.length,key);
		if(result!=-1)
		  System.out.println("Element found at index: "+result);
		else
			System.out.println("Element does not exist");
		
		

	}

}
