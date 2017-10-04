package com.implementation.ganga.dynamicprogramming;

import java.util.Scanner;

public class ByteLandianGold {

	public static void main(String[] args) {
		System.out.println("Enter n");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(coins(n));
	}

	private static int coins(int n) {
		// base case
		if (n < 1)
			return 0;

		return Math.max(n, coins(n / 2) + coins(n / 3) + coins(n / 4));
	}

}

/*
 * In Byteland they have a very strange monetary system.
 * 
 * Each Bytelandian gold coin has an integer number written on it. A coin n can
 * be exchanged in a bank into three coins: n/2, n/3 and n/4. But these numbers
 * are all rounded down (the banks have to make a profit).
 * 
 * You can also sell Bytelandian coins for American dollars. The exchange rate
 * is 1:1. But you can not buy Bytelandian coins.
 * 
 * You have one gold coin. What is the maximum amount of American dollars you
 * can get for it?
 * 
 * Input
 * 
 * The input will contain several test cases (not more than 10). Each testcase
 * is a single line with a number n, 0 <= n <= 1 000 000 000. It is the number
 * written on your coin.
 * 
 * Output
 * 
 * For each test case output a single line, containing the maximum amount of
 * American dollars you can make.
 * 
 * Example
 * 
 * Input: 12 2
 * 
 * Output: 13 2
 * 
 * 
 */