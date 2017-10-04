package com.repeated;

import java.util.Arrays;

public class PythagoreanTriplet {

	public static void main(String[] args) {
		int[] array = new int []{1,5,3,4,2};
		
		Arrays.sort(array);
		
		for(int i=0;i<array.length;i++) {
			array[i] *= array[i];
		}
		
		System.out.println(array.length);
		for(int j=array.length-1; j>=2; j--) {
			int l = 2;
			int r = array.length-2;
			while(l<r) {
				if(array[l]  + array[r] == array[j]) {
					System.out.println("Triplet found");
				}
				if(array[l] + array[r] < array[j]) { l++; }  else { r--; }
			}
		}

	}

}
