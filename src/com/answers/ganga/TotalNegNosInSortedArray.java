package com.answers.ganga;

import java.util.Scanner;

public class TotalNegNosInSortedArray {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] sortedArray = new int[n][m];
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				sortedArray[i][j] = sc.nextInt();
			}
		}
		
		
		
		int x = 0;
		int y= m-1;
		int count = 0;
		while(x<n && y>=0) {
			System.out.println("Entering");
			if(sortedArray[x][y] < 0) {
				System.out.println("x is " +x + " y is " +y);
				count = count + y + 1;
				x++;
				y=m-1;
			}
			y--;
		}
		System.out.println(count);
		

	}

}
