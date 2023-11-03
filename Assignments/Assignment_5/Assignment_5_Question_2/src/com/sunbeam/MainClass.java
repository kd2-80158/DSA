package com.sunbeam;

public class MainClass {

	public static void main(String[] args) {
		
//		StackClass sc = new StackClass(5);
//		
//		sc.push(40);
//		sc.push(30);
//		sc.push(20);
//		sc.push(10);
		
		QueueClass qc = new QueueClass(5);
		
		qc.enqueue(10);
		qc.enqueue(20);
		qc.enqueue(30);
		qc.enqueue(40);
		qc.enqueue(50);
//		LinkedList ll = new LinkedList();
//		ll.addFirst(10);
//		ll.addFirst(20);
//		ll.addFirst(30);
//		ll.addFirst(40);
//		
//		ll.display();
		
//		sc.pop();
		
		System.out.println("Peek data: "+qc.peek());
		

	}

}
