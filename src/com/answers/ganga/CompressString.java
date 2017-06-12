package com.answers.ganga;

import java.util.Scanner;

public class CompressString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char last = str.charAt(0);
		int count =0;
		StringBuffer resultBuffer = new StringBuffer();
		for(int i=0;i<str.length();i++) {
			char curr = str.charAt(i);
			if(curr == last) {
				count++;
			} else {
				resultBuffer.append(last);
				resultBuffer.append(count);
				last = curr;
				count = 1;
			}
		}
		resultBuffer.append(last);
		resultBuffer.append(count);
		System.out.println(resultBuffer);
		
	}

}
