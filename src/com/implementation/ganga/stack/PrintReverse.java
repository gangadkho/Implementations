package com.implementation.ganga.stack;

import java.util.Scanner;

public class PrintReverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		int length = input.length();
		Stack inputStack = new Stack(length);
		for(int i=0;i<length;i++) {
			inputStack.push(input.charAt(i));
		}
		System.out.println("The reversed string is ");
		char[] output = new char[length];
		for(int i=0;i<length;i++) {
			output[i] = inputStack.pop();
			System.out.print(output[i]);
		}
		
		sc.close();

	}

}
