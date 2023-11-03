package com.sunbeam;

public class LinkedList {
	
	public class Node
	{
		private int data;
		private Node next;
		
		public Node(int value)
		{
			data=value;
			next=null;
		}
	}
	private Node head;
	
	public LinkedList()
	{
		head=null;
	}
	public boolean isEmpty()
	{
		return head==null;
	}
	
	public void addFirst(int value)
	{
		//1. create node with given value.
		Node newnode = new Node(value);
		
		//2. Check whether list is empty
		if(isEmpty())
		{
			//2.1 If it is empty then add newnode into head itself.
			head = newnode;
		}
		//2.2 if not empty then add first node into next of newnode and then add newnode into head
		else
		{
			newnode.next=head;
			head=newnode;
		}	
	}
	
	public void deletefirst()
	{
		//1. check whether list is empty
		if(isEmpty())
		{
			System.out.println("List is empty");
		}
		else if(head.next==null)
			head=null;
		else
		{
			head = head.next;
		}
	}
	public void deleteLast()
	{
		if(isEmpty())
		{
			System.out.println("List is empty");
		}
		else
		{
			Node trav = head;
			while(trav.next.next!=null)
			{
				trav.next=null;
			}
		}
	}
	
	public void display()
	{
		//check whether list is empty
		if(isEmpty())
		{
			System.out.println("List is empty");
		}
		else
		{
			Node trav = head;
			while(trav!=null)
			{
				System.out.println(" "+trav.data);
				trav=trav.next;
			}
		}
	}
	public int getData()
	{
		return head.data;
	}

}
