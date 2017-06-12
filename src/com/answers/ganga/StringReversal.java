package com.answers.ganga;

import java.util.Scanner;

public class StringReversal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char[] strArray = str.toCharArray();
		
		int i=0;
		int j=strArray.length-1;
		
		while(i<j) {
			char temp = strArray[j];
			strArray[j] =  strArray[i];
			strArray[i] = temp;
			i=i+1;
			j=j-1;
		}
		
		System.out.println(new String(strArray));

	}

}
