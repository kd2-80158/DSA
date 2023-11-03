package com.sunbeam;

public class DoublyCircularLinkedList {
	
	class Node
	{
		private int data;
		private Node prev;
		private Node next;
		
		public Node(int value)
		{
			data=value;
			prev=null;
			next=null;
		}
	}
	private Node head;
	
	public DoublyCircularLinkedList()
	{
		head = null;
	}
    
	public boolean isEmpty()
	{
		return head==null;
	}
	//to avoid invalid positions like pos less than 1 or pos greater than count(number of elements)
	int count=0;
public int addPosition(int value,int pos)
{
	
	Node newnode = new Node(value);
	
	if(isEmpty())
	{
		head=newnode;
		head.prev=newnode;
		head.next=newnode;
		count++;
		
	}
	else
	{
		Node trav = head;
		for(int i=1;i<pos;i++)
		{
			trav=trav.next;
			
		}
		newnode.prev=trav.prev;
		newnode.next=trav;
		//first add this to avoid data loss
		trav.prev.next=newnode;
		trav.prev=newnode;
		count++;
	}
	return count;
}
public void deletePosition(int pos)
{
	if(isEmpty())
	{
		System.out.println("List is empty");
	}
	else if(pos>count || pos<1)
	{
		System.out.println("Invalid position");
	}
	else if(pos==count)
	{
		Node trav = head;
		for(int i=1;i<pos;i++)
		{
			trav=trav.next;
		}
		trav.prev.next=trav.next;
		trav.next.prev=trav.prev;
		
	}
	else
	{
		Node trav = head;
		for(int i=1;i<pos;i++)
		{
			trav=trav.next;
		}
		trav.next=trav.next.next;
		trav.next.prev=trav;
		
	}
}

public void display()
{
	if(isEmpty())
	{
		System.out.println("List is empty");
	}
	Node trav = head;
		
		do
		{
			System.out.println(" "+trav.data);
			trav=trav.next;
		}
		while(trav!=head);
}

}
