package com.sunbeam;

public class BSTreeByRecursion {
	
	public class Node
	{
		private int data;
		private Node left;
		private Node right;
		
		public Node(int value)
		{
			data=value;
			left=null;
			right=null;
		}
	}
	private Node root;
	
	public BSTreeByRecursion()
	{
		root=null;
	}

	
	public boolean isEmpty()
	{
		return root==null;
	}

	public void addNode(int value)
	{
		Node newnode = new Node(value);
		if(isEmpty()){
		   root = newnode;
		}
		else
		  add(root,value);
	}
	public void add(Node trav,int value)
	{
		if(value<trav.data)
		{
			if(trav.left==null)
				trav.left= new Node(value);
			else
				add(trav.left,value);
		}
		else
		{
			if(trav.right==null)
				trav.right= new Node(value);
			else
				add(trav.right,value);
		}
	}
	public void preOrder(Node root)
	{
		if(root==null)
			return;
		System.out.print(" "+root.data);
		preOrder(root.left);
		preOrder(root.right);
		
	}
	
	public void preOrder()
	{
		System.out.println("Preorder: ");
		preOrder(root);
	}
	
	public void inOrder(Node root)
	{
		if(root==null)
			return;
		inOrder(root.left);
		System.out.print(" "+root.data);
		inOrder(root.right);
	}
	
	public void inOrder()
	{
		System.out.println();
		System.out.println("Inorder: ");
		inOrder(root);
	}

}
