package com.sunbeam;

public class ReverseArray {

	public static void main(String[] args) {
		
		int arr[] = {10,20,30,40,50};
		
		Stack st = new Stack(5);
		
		//insert element into stack
		for(int i=0;i<arr.length;i++)
			st.push(arr[i]);
		
		//print
		while(!st.isEmpty())
		{
			System.out.print(st.peek()+",");
			st.pop();
		}
		
	}

}
