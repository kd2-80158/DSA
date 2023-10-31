package com.sunbeam;

public class MainClass {

	public static void main(String[] args) {
		
    SinglyLinearLinkedList list = new SinglyLinearLinkedList();
    
    list.addFirst(40);
    list.addFirst(30);
    list.addFirst(20);
    list.addFirst(10);
    list.addLast(100);
    
//    list.deleteLast();
//    
    list.deleteLast();
    
//    list.deleteFirst();
//    list.deleteFirst();
//    list.addPosition(50, 1);
    
    list.display();
	}

}
