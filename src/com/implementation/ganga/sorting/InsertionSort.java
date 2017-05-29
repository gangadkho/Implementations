package com.implementation.ganga.sorting;

public class InsertionSort {
	
	static int[] arr = new int[]{5,3,2,7,1};
	static int size = arr.length;
	
	public static void main(String[] args) {
		System.out.println("Insertion Sorting");
		System.out.println("Before Sorting ");
		for(int x:arr) {
			System.out.println(x);
		}
		insertionSort();
		System.out.println("After Sorting ");
		for(int x:arr) {
			System.out.println(x);
		}

	}
	private static void insertionSort() {
		for(int i=1;i<size;i++) {
			int key = arr[i];
			int j = i -1;
			while(j>=0 && arr[j] > key) {
				arr[j+1] = arr[j];
				j = j-1;
			}
			arr[j+1] =  key;
		}
		
	}
}
