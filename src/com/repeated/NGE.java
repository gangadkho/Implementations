package com.repeated;

import java.util.Stack;

public class NGE {

	public static void main(String[] args) {
		Stack<Integer> stk = new Stack();
		int [] arr =  new int[]{52,12,3,5,7};
		stk.push(arr[0]);
		
		for(int i=1;i<5;i++) {
			if(!stk.isEmpty()) {
				while(stk.peek()<arr[i]) {
					System.out.println(arr[i]);
					stk.pop();					
				}
				
			}
			stk.push(arr[i]);
		}
		while(!stk.isEmpty()) {
			System.out.println("Inside while");
			System.out.println(stk.pop());
		}

	}

}
