package com.sunbeam;

public class SinglyCircularLinkedList {

	class Node
	{
		private Node next;
		private int data;
		
		public Node(int value)
		{
			data=value;
			next=null;
		}
	}
	private Node tail;
	private Node head;
	
	public SinglyCircularLinkedList()
	{
		tail = null;
		head = null;
	}
	
	public boolean isEmpty()
	{
//		return head==null;
		return tail==null;
	}
	public void display()
	{
		if(isEmpty())
		{
			return;
		}
//		Node trav = head;
		Node trav = tail.next;
		do
		{
			System.out.println(trav.data+" ");
			trav = trav.next;
		}
		while(trav!=tail.next);
		
	}
	public void addFirst(int value)
	{
		//create node
		Node newnode = new Node(value);
		//check empty
		if(isEmpty())
		{
			tail=newnode;
			newnode.next=newnode;
		}
		else
		{
			
			newnode.next=tail.next;
			tail.next=newnode;
	    }
	}
	public void addLast(int value)
	{
		Node newnode = new Node(value);
		if(isEmpty())
		{
			tail = newnode;
			newnode.next=newnode;
		}
		else
		{
			newnode.next=tail.next;
			tail.next=newnode;
			tail=newnode;
			
		}
	}
	public void deleteFirst()
	{
		if(isEmpty())
		{
			System.out.println("List is empty");
		}
		else if(tail.next==null)
		{
			tail=null;
		}
		else
		{
			tail.next=tail.next.next;
		}
	}
	public void deleteLast()
	{
		if(isEmpty())
		{
			System.out.println("List is empty");
		}
		else if(tail.next==tail)
		{
			tail=null;
		}
		else
		{
			Node trav = tail.next;
			do
			{
				trav=trav.next;
			}
			while(trav.next!=tail);
			trav.next=tail.next;
			tail = trav;
			
			
		}
	}
//	public void addFirst(int value)
//	{
//		//create node
//		Node newnode = new Node(value);
//		//check empty
//		if(isEmpty())
//		{
//			head = newnode;
//			newnode.next=newnode;
//		}
//		else
//		{
//			newnode.next=tail.next;
//			tail=newnode;
//		}	
//		
//	}
}
