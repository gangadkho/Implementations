package com.implementation.ganga.stack;

public class Stack {

	int top;
	int[] stackArr;
	int max;
	public Stack(int max) {
		this.max = max;
		top = -1;
		stackArr  = new int[max];
	}
	
	public void push(int x) {
		if(top < max) {
			stackArr[++top] = x;
		} else {
			System.out.println("Stack is full");
		}
	}
	
	public int pop() {
		if(top!=-1) {
			return stackArr[top--];
		} 
		return -1;
	}
	
	public int peek() {
		if(stackArr.length!=0) {
			return stackArr[top];
		}
		return -1;
	}
	
	public void printStack(Stack stk) {
		for(int i=0;i<stk.stackArr.length;i++) {
			System.out.println(stk.stackArr[i]);
		}
	}
	public static void main(String[] args) {
		Stack stack = new Stack(3);
		stack.push(3);
		stack.push(9);
		stack.printStack(stack);
	}

}
