package com.sunbeam;

public class Stack {

	private int arr[];
	private int top;
	private final int size;
	
	public Stack(int size) {
		this.size=size;
		arr = new int[size];
		top=-1;
	}
	//add element
	public void push(int data)
	{
		top++;
		arr[top] = data;
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
	public boolean isEmpty()
	{
		return top==-1;
	}
	public boolean isFull()
	{
		return top==size-1;
	}
}
