package com.answers.ganga;

import java.util.Scanner;

public class CheckRotation {

	public static boolean checkRotation(String s1, String s2) {
		String s1s1 = s1.concat(s1);
		return isSubString(s2,s1s1);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		
		System.out.println(checkRotation(s1,s2));
	}
	public static boolean isSubString(String s2,String s1s1) {
		return s1s1.toLowerCase().contains(s2.toLowerCase());
	}

}
