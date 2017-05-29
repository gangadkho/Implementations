package com.implementation.ganga.sorting;

//Comparisons - O(n2)
//Swaps - O(n)
public class SelectionSort {
	static int[] arr = new int[]{5,3,2,7,1};
	static int size = arr.length;
	
	public static void main(String[] args) {
		System.out.println("Selection Sorting");
		System.out.println("Before Sorting ");
		for(int x:arr) {
			System.out.println(x);
		}
		selectionSort();
		System.out.println("After Sorting ");
		for(int x:arr) {
			System.out.println(x);
		}

	}
	public static void swap(int x, int y) {
		int temp = arr[x];
		arr[x]=arr[y];
		arr[y]=temp;
	}

	private static void selectionSort() {
		int min;
		for(int out = 0;out<size-1;out++) {
			min = out;
			for(int in=out+1;in<size;in++) {
				if(arr[min] > arr[in]) {
					min = in;
				}
			}
			swap(min,out);
		}		
	}

}
