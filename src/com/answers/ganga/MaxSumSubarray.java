package com.answers.ganga;

import java.util.Scanner;

public class MaxSumSubarray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arraySize = sc.nextInt();
		int[] array = new int[arraySize];
		for(int i=0;i<arraySize;i++) {
			array[i] = sc.nextInt();
		}
		
		int sum = 0;
		int maxSum = 0;
		for(int j=0;j<arraySize;j++) {
			sum+= array[j];
			if(sum < 0) {
				sum = 0;
			} else if(maxSum<sum) {
				maxSum = sum;
			}			
		}
		System.out.println("Maximum sum in a subarray is" + maxSum);
	}

}
