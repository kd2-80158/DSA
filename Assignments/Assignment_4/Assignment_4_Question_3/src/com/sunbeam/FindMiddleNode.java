package com.sunbeam;

public class FindMiddleNode {

	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		
		list.addFirst(50);
		list.addFirst(40);
		list.addFirst(30);
		list.addFirst(20);
		list.addFirst(10);

		list.display();
		
		int ans = list.findMiddle();
		System.out.println("Middle element is: "+ans);
	}

}
