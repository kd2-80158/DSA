package com.sunbeam;

public class CircularQueue {
	
	private int arr[];
	private final int size;
	private int front;
	private int rear;
	
	public CircularQueue(int size) {
	    this.size=size;
		arr = new int[size];
	    front = -1;
	    rear = -1;
	   
	 
	}
	//add element
	public void push(int data)
	{
		rear=(rear+1)%size;
		arr[rear] = data; 	
	}
	//delete element
	public void pop()
	{
      front=(front+1)%size;
      
	}
	//peek element
	public int peek()
	{
		return arr[(front+1)%size];
	}

	public boolean isFull()
	{
		return (front==rear && rear!=-1) || (front==-1 && rear==size-1);
	}
	public boolean isEmpty()
	{
		return (front==rear && rear==-1);
		
	}
}
