package com.sunbeam;

import java.util.Scanner;

public class FindMaxClass {
	

	public static void main(String[] args) {
		
		Stack st = new Stack(20);
		st.push(10);
		st.push(3);
		st.push(35);
		st.push(99);
		st.push(44);
		st.push(66);
		st.push(77);
		st.push(88);
		
		int result = st.getMax();
		System.out.println("Maximum element is: "+result);
		
	}

}
