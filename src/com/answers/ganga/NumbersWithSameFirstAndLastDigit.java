package com.answers.ganga;

import java.util.Scanner;

public class NumbersWithSameFirstAndLastDigit {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		
		int[] arr = new int[n*2];
		for(int i=0;i<n*2;i++) {
		    arr[i] = sc.nextInt();
		}
		
		for(int j=0;j<n*2;j+=2) {
		   findRange(arr[j],arr[j+1]);
		}
		sc.close();
	}
	public static void findRange(int x, int y) {
		int count =0;
	    for(int i=x;i<=y;i++) {
	        if(getLastDigit(i) == getFirstDigit(i)) {
	            count+=1;
	        }	        
	    }
	    System.out.println(count);
	}
	public static int getLastDigit(int x) {
	    return x%10;
	}
	public static int getFirstDigit(int x) {
	    while(x>9) {
	        x = x / 10;
	    }
	    return x;
	}
}
