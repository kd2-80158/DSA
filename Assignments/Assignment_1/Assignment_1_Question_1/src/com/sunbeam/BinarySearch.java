package com.sunbeam;

import java.util.Scanner;

public class BinarySearch {
	
	public static int printComp(int arr[],int size,int key)
	{
		int start=0;
		int end=size-1;
		int comp=0;
		while(start<=end)
		{
			int mid = (start+end)/2;
			
			if(key==arr[mid])
				{
				comp++;
			    return comp;
				}
			else if(key<arr[mid])
				
				{
				end=mid-1;
				comp++;
				}
			else
			{
				comp++;
				start=mid+1;
			}
		}
		return comp;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int arr[] = {10,20,30,40,50,60,70,80};
		
		System.out.println("Enter the key to search: ");
		int key = sc.nextInt();
		
		int result = printComp(arr,arr.length,key);
		System.out.println("Number of comparision: "+result);
		
		

	}

}
