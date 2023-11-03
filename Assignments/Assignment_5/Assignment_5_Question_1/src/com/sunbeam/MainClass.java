package com.sunbeam;

public class MainClass {

	public static void main(String[] args) {
		
		DoublyCircularLinkedList list = new DoublyCircularLinkedList();
		
		list.addPosition(10, 1);
		list.addPosition(20, 2);
		list.addPosition(30, 3);
		list.addPosition(40, 4);
		
//		slist.deletePosition(3);
//		list.deletePosition(3);
		list.deletePosition(5);
		
		list.display();
		
		

	}

}
