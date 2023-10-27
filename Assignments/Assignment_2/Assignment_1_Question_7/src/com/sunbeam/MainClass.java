package com.sunbeam;

import java.util.Scanner;

public class MainClass {
	
	public static int menu()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("**************");
		System.out.println("0. Exit");
		System.out.println("1. Add element");
		System.out.println("2. Remove element");
		System.out.println("3. Peek element");
		System.out.println("***************");
		System.out.println("Enter your choice: ");
		int choice = sc.nextInt();
		return choice;
	}

	public static void main(String[] args) {
		
		LinearQueue lq= new LinearQueue(5);
		Scanner sc = new Scanner(System.in);
		int ch;
		while((ch=menu())!=0)
		{
			switch(ch)
			{
			case 1:
				if(lq.isFull())
				{
					System.out.println("Queue is full..cannot add an element.");
				}
				else
				{
				System.out.println("Enter element to add: ");
				int data = sc.nextInt();
				lq.push(data);
				}
				break;
			case 2:
				if(lq.isEmpty())
				{
					System.out.println("Queue is empty...cannot remove an element");
				}
				else
					lq.pop();
				break;
			case 3:
				if(lq.isEmpty())
				{
					System.out.println("Queue is empty.");
				}
				else
				   System.out.println("The peek element is: "+lq.peek());
				break;
			default:
				System.out.println("Wrong input entered...");
			}
		}
	}
}
