package com.sunbeam;

public class Stack {

	private int arr[];
	private int maxi = Integer.MIN_VALUE;
	private int top;
	private final int size;
	
	public Stack(int size) {
		this.size=size;
		arr = new int[size];
		top=0;
	}
	//add element
	public void push(int data)
	{
		arr[top] = data;
		
		if(arr[top]>maxi)
		{
	      maxi = data;
		}
	}
	//delete element
	public int pop()
	{
		int data = arr[top];
		top--;
		return data;
	}
	//peek element;
	public int peek()
	{
		return arr[top];
	}
	
	public int getMax()
	{
		return maxi;
	}
	
	public boolean isEmpty()
	{
		return top==-1;
	}
	public boolean isFull()
	{
		return top==size-1;
	}
}
