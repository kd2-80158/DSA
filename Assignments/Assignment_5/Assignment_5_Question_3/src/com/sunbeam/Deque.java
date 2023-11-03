package com.sunbeam;

public class Deque {
	
	public class Node
	{
		private int data;
		private Node next;
		private Node prev;
		
		public Node(int value)
		{
			data=value;
			next=null;
			prev=null;
		}
	}
	private Node head;
	private Node tail;
	
	public Deque()
	{
		head=null;
		tail=null;
	}
	
	public boolean isEmpty()
	{
		return head==null;
	}
	
	public void addFirst(int value)
	{
		Node newnode = new Node(value);
		
		if(isEmpty())
		{
			head=tail= newnode;
		}
		else
		{
			newnode.next=head;
			head.prev=newnode;
			head=newnode;
		}
	}
	public void addLast(int value)
	{
		Node newnode = new Node(value);
		
		if(isEmpty())
		{
			head=tail=newnode;
		}
		else
		{
			newnode.prev=tail;
			tail.next=newnode;
			tail=newnode;
		}
	}
	public void deleteFirst()
	{
		if(isEmpty())
		{
			System.out.println("Deque is empty");
		}
		else
		{
			head = head.next;
			head.prev=null;
		}
	}
	public void deleteLast()
	{
		if(isEmpty())
		{
			System.out.println("Deque is empty");
	    }
		else
		{
			tail=tail.prev;
			tail.next=null;
		}
	}
	public void display()
	{
		if(isEmpty())
		{
			System.out.println("Deque is empty");
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

}
