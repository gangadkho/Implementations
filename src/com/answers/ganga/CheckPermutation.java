package com.answers.ganga;

import java.util.Arrays;
import java.util.Scanner;

public class CheckPermutation {

	//Sorting the characters and check
	public static boolean checkPermutationUsingSorting(String s1, String s2) {
		if(s1.length()!=s2.length()) {
			return false;
		}
		char[] s1Array =  s1.toCharArray();
		char[] s2Array = s2.toCharArray();
		Arrays.sort(s1Array);
		Arrays.sort(s2Array);
		return new String(s1Array).equals(new String(s2Array));
	}
	
	public static boolean checkPermutationUsingCharCount(String s1, String s2) {
		if(s1.length() != s2.length()) {
			return false;
		}
		int[] countArray = new int[256];
		for(int i=0;i<=s1.length()-1;i++) {
			int ch = s1.charAt(i);
			countArray[ch]+=1;
		}
		
		for(int j=0;j<=s2.length()-1;j++) {
			int ch = s2.charAt(j);
			countArray[ch]-=1;
			if(countArray[ch] < 0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		System.out.println(checkPermutationUsingSorting(s1,s2));
		System.out.println(checkPermutationUsingCharCount(s1,s2));
		sc.close();
	}
}
