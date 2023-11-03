package com.sunbeam;

public class QueueClass {
	
	LinkedList ll;
	
	public QueueClass(int size)
	{
		ll = new LinkedList();
	}
	public boolean isEmpty()
	{
		return ll.isEmpty();
	}
	public void enqueue(int value)
	{
		ll.addFirst(value);
	}
	public void dequeue()
	{
		ll.deleteLast();
	}
	public int peek()
	{
		return ll.getData();
	}

}
