package com.sunbeam;

import java.util.Arrays;

public class selectionSort {

	public static void selectionSortAlgo(int arr[],int size)
	{
		int count=0;
		for(int i=0;i<size-1;i++)
		{
			for(int j=i+1;j<size;j++)
			{
				count++;
				if(arr[i]>arr[j])
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("Number of comparisions: "+count);

	}
	public static void main(String[] args) {
		
 
		int arr[] = {22,11,33,66,13,45,37,26};
		
		System.out.println("Array before sort: "+Arrays.toString(arr));
		
		selectionSortAlgo(arr,arr.length);
		
		System.out.println("Array after sort: "+Arrays.toString(arr));
	}

}
