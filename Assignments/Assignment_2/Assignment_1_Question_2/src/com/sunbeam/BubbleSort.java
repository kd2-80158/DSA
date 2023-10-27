package com.sunbeam;

import java.util.Arrays;

public class BubbleSort {
	
	public static void bubbleSortAlgo(int arr[],int size)
	{
		int count=0;
		int flag;
		//number of passes
		for(int i=1;i<size;i++)
		{
		      flag=0;
			
			for(int j=0;j<size-i;j++)
			{
				count++;
				if(arr[j]>arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					flag=1;
				}
				
			}
			if(flag==0)
				break;
			
		}
		System.out.println("Number of comparisions: "+count);
	}

	public static void main(String[] args) {
		
		
		int arr[] = {100,200,150,10,8,11,9,33,27,22,16,9};
		
		System.out.println("Array before sort:"+Arrays.toString(arr));
		
		bubbleSortAlgo(arr,arr.length);
		
		System.out.println("Array after sort:"+Arrays.toString(arr));
		

	}

}
