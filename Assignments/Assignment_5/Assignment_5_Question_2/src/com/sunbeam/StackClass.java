package com.sunbeam;

import java.util.List;

public class StackClass {
	
	
	LinkedList li;
	
	public StackClass(int size)
	{
		li = new LinkedList();
	}
	public boolean isEmpty()
	{
		return li.isEmpty();
	}
	public void push(int value)
	{
			li.addFirst(value);
	}
	public void pop()
	{
		if(isEmpty())
		{
			System.out.println("Stack is empty");
		}
		else
		{
			li.deletefirst();
		}
	}
	public int peek()
	{
		return li.getData();
	}

}
