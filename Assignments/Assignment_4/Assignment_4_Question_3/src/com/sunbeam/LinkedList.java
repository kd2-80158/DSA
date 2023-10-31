package com.sunbeam;


public class LinkedList {
	
	//Node Inner class
	class Node
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
	private Node tail;
		public LinkedList()
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
			//1. create node with given value
			Node newnode = new Node(value);
			//2. if list is empty
			if(isEmpty())
			{
			//a. add newnode into head itself 
				head = newnode;
				tail = newnode;
			}
			//3. if list is not empty
			else
			{
				//a. add first node into next of newnode 
				newnode.next=head;
			//b. add newnode into head
				head=newnode;
			}
		}
		
		public void addLast(int value)
		{
			//1. create node with given data
			Node newnode = new Node(value);
			//2. if list is empty
			if(isEmpty())
			{
			//a. add newnode into head itself
				head = newnode;
				tail = newnode;
			}
			else
			{
				tail.next=newnode;
				tail = newnode;
			
			}
	}
		public void deleteFirst()
		{
			//1. if list is empty 
			if(isEmpty())
			{
				System.out.println("List is empty");
			}
			else
			{
				head = head.next;
			}
		}
		public void deleteLast()
		{
			//1. if list is empty // print msg
			if(isEmpty())
			{
				System.out.println("List is empty");
			}
			else if(head.next==null)
			{
				head=null;
				tail=null;
			}
			else
			{
				Node trav = head;
				while(trav.next.next!=null)
				{
					trav=trav.next;
				}
				trav.next=null;
				
			}
		}
		
		public void addPosition(int value, int pos)
		{
			//1. create node 
			Node newnode = new Node(value);
			//2. if list is empty
			if(isEmpty())
			{//a. add newnode into head 
				head = newnode;
			}
			else if(pos<=1)
			{
				addFirst(value);
			}
			else
			{
			//3. if list is not empty
				Node trav = head;
			//a. traverse till pos-1
			for(int i=0;i<pos-1 && trav.next!=null;i++)
				trav = trav.next;
			//b. add pos node into next of newnode 
			newnode.next = trav.next;
			//c. add newnode into next of pos-1 node
			trav.next=newnode;
			}
		}
		public void display()
		{
			//1. create one referance and start at first node 
			Node trav = head;
			while(trav!=null)
			{
				//2. print(visit) the current node
			System.out.print(" "+trav.data);
			//3. go on next node
			trav=trav.next;
			//4. repeat step 2 and 3 till last node
		}
			System.out.println();
		}
		
		public int findMiddle()
		{
			Node v1,v2;
			v1=v2= head;
			Node trav = head;
			while(v2.next!=null)
			{
				v1=v1.next;
				v2=v2.next.next;
			}
			return v1.data;
		}
		
}
