package com.sunbeam;

public class MainClass {

	public static void main(String[] args) {
		
		BSTreeByRecursion bst = new BSTreeByRecursion();
		

		bst.addNode(50);
		bst.addNode(40);
		bst.addNode(30);
		bst.addNode(5);
		bst.addNode(20);
		bst.addNode(10);
		
		bst.preOrder();
		bst.inOrder();
		

	}

}
