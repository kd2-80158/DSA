package com.sunbeam;

import java.util.Scanner;

public class MainClass {
	
	public static int findNthOccurence(int arr[],int size,int key,int occurence)
	{
		int count=0;
		int i;
		for(i=0;i<size;i++)
		{
			
			if(key==arr[i])
				count++;
			if(count==occurence)
			{
				return i;
			}
			
			
		}
		return -1;
	}

	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
    int arr[] = {1,5,9,8,5,2,11};
    
    
    System.out.println("Enter the key element to search:");
    int key = sc.nextInt();
    
    System.out.println("Enter the occurence of an element:");
    int occurence = sc.nextInt();
    
    int result = findNthOccurence(arr,arr.length,key, occurence);
    System.out.println("Nth occurence of element is at index: "+result);
    
    
    
    
	}

}
