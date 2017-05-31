package com.implementation.ganga.stack;

import java.util.Scanner;

public class DelimiterCheck {
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		String inputString = sc.nextLine();
		Stack inputStack = new Stack(inputString.length());
		for(char c: inputString.toCharArray()) {
			switch (c) {
				case '{':
				case '[':
				case '(':
				case '<':
					inputStack.push(c);
					break;
				case '}':
				case ']':
				case ')':
				case '>':
					char last = inputStack.pop();
					if((c=='}' && last == '{') ||
							(c=='>' && last == '<') ||
							(c==']' && last == '[') ||
							(c==')' && last == '(') ) {
					} else {
						System.out.println("Error at " + c);
					}
					break;
				default:
					break;
			}
				
		}
	}
}
