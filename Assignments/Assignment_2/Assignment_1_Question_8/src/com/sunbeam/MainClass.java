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
		
		CircularQueue cq = new CircularQueue(5);
		int ch;
		Scanner sc = new Scanner(System.in);
		
		while((ch=menu())!=0)
		{
			switch(ch)
			{
			case 1:
				if(cq.isFull())
				{
					System.out.println("Queue is full");
				}
			    else
				{
					System.out.println("Enter element: ");
					int ele = sc.nextInt();
					cq.push(ele);
				}

				break;
			case 2:
				if(!cq.isEmpty())
				{
					cq.pop();
				}
				else
				{
					System.out.println("Queue is empty");
				}
				break;
			case 3:
				if(!cq.isEmpty())
				{
					System.out.println("Peek element is: "+cq.peek());
				}
				else
				{
					System.out.println("Queue is empty");
				}
				break;
			default:
				System.out.println("Wrong input entered......");
					
			}
		}
     System.out.println("Thanks for using this app........");
	}

}
