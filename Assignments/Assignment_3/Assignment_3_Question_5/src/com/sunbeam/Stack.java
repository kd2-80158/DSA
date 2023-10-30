package com.sunbeam;

public class Stack {
	
	private final int size;
	private int top;
	private int arr[];
	
	public Stack(int size)
	{
		this.size=size;
		arr= new int[5];
		top=-1;
	}

	public void push(int data)
	{
		top++;
		arr[top] = data;
	}
	
	public void pop()
	{
		top--;
	}
	public int peek()
	{
		return arr[top];
	}
	public boolean isEmpty()
	{
		return top==-1;
	}
}
