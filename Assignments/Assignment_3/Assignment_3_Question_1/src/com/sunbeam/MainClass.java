package com.sunbeam;

public class MainClass {
	
	public static int calculate(int op1,char ele,int op2)
	{
		switch(ele)
		{
		case '+': return op1 + op2;
		case '-': return op1 - op2;
		case '/': return op1 / op2;
		case '*': return op1 * op2;
		}
		return 0;
		
		}
		
	public static int postfixEvaluation(String postfix)
	{
		//1.create stack to push operands
		Stack st = new Stack(30);
		//Traverse expression from left to right
		for(int i=0;i<postfix.length();i++)
		{
			//read element from ith index
			char ele = postfix.charAt(i);
			
			//check if element is operand
			if(Character.isDigit(ele) || postfix.charAt(i)==' ')
			{
				//push operand on stack
				st.push(ele-'0');
			}
			else
			{
				//if element is operator
				int op2 = st.pop();
				int op1 = st.pop();
				//perform operations on op1 and op2
				int result = calculate(op1,ele,op2);
				//push result on stack
				st.push(result);
				
			}
		}
		if(!st.isEmpty())
			//pop result from stack and return it
			  return st.pop();
		return 0;
	}

	public static void main(String[] args) {
		
		
		String postfix = "3 4 2 * +";
		
		System.out.println("Postfix: "+postfix);
		
		int result = postfixEvaluation(postfix);
		
		System.out.println("Postfix: "+result);

	}

}
