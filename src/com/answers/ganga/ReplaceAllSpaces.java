package com.answers.ganga;

import java.util.Scanner;

public class ReplaceAllSpaces {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		int nos = 0;
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i) == ' ') {
				nos++;
			}
		}
		int newlength = str.length() + (nos*2);
		char [] result = new char[newlength+1];
		result[newlength] = '\0';
	
		for(int j=str.length()-1;j>=0;j--) {
			if(str.charAt(j)==' ') {
				result[newlength-1] = '%';
				result[newlength-2] = '2';
				result[newlength-3] = '0';
				newlength = newlength -3;
			} else {
				result[newlength-1] = str.charAt(j);
				newlength = newlength -1;
			}
		}
		
		System.out.println(new String(result));
	}

}
