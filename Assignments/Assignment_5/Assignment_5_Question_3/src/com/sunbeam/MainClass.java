package com.sunbeam;

public class MainClass {

	public static void main(String[] args) {
		
		Deque dq = new Deque();
		
		dq.addFirst(40);
		dq.addFirst(30);
		dq.addFirst(20);
		dq.addFirst(10);
		dq.addLast(50);
		dq.addLast(60);
		
		
		dq.display();

	}

}
