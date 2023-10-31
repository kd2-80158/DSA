package com.sunbeam;

public class MainClass {

	public static void main(String[] args) {
		
		SinglyCircularLinkedList list = new SinglyCircularLinkedList();
//		list.addFirst(50);
//		list.addFirst(40);
//		list.addFirst(30);
//		list.addFirst(20);
//		list.addFirst(10);
		
//		list.addLast(60);
//		list.addLast(70);
		list.addLast(80);
		
		
//		
//		list.deleteFirst();
		list.deleteLast();
		
		list.display();

	}

}
