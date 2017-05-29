package com.implementation.ganga.sorting;

public class BubbleSort {
	static int[] arr = new int[]{5,3,2,7,1};
	static int size = arr.length;
	
	public static void main(String ar[]) {
		System.out.println("Bubble Sorting");
		System.out.println("Before Sorting ");
		for(int x:arr) {
			System.out.println(x);
		}
		bubbleSort();
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
	public static void bubbleSort() {
		for(int out=size-1;out>0;out--) {
			for(int in = 0;in<out;in++) {
				if(arr[in] > arr[in+1]) {
					swap(in,in+1);
				}
			}
		}
	}
}
