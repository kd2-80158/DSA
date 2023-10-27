package com.sunbeam;

public class LinearQueue {
	
	private int arr[];
	private int front;
	private int rear;
	private final int size;
	

	public LinearQueue(int size) {
		
		arr = new int[size];
		this.front = 0;
		this.rear = 0;
		this.size = size;
	}
	
	//add element in queue
	public void push(int data)
	{

			   arr[rear] = data;
			   int item = arr[rear];
			   this.rear++;
			   System.out.println("Element added: "+item);
    }
	//delete element in queue
	public void pop()
	{
		 int item = arr[front];
         arr[front] = 0; 
         front = (front + 1) % size;
         System.out.println("Element delete: " +item);
	}
	//peek element in queue
	public int peek()
	{
        return arr[front];
	}
	public boolean isFull()
	{
       return rear==size;
	}
	public boolean isEmpty()
	{
       return front==rear;
	}
	
}
