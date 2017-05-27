package com.implementation.ganga.arrays;

public class Arrays {
	static int[] arr = new int[100];
	static int size = arr.length;
	public static void main(String arg[]) {
		System.out.println("Implementation of Array" + arr.length);
		insert(1);
		
	}
	public static void insert (int value) {
		System.out.println("Test");
		//find the position
		int i=0;
		for(i=0;i<size;i++) {
			if(arr[i]>value) {
				break;
			}
		}
		for(int j=size;j<i;j--) {
			arr[j] = arr[j-1];
		}
		arr[i] = value;
		size++;
	}
	public int find(int value) {
		int lowerBound = 0;
		int upperBound = size-1;
		while(true) {
			int current = (lowerBound + upperBound) /2 ;
			if(lowerBound > upperBound) {
				return size;
			} 
			else if (value == arr[current]) {
				return current;
			}
			else if(value < arr[current]) {
				//it lies in lower half
				upperBound = current - 1;
			} else if (value > arr[current]) {
				lowerBound = current + 1;
			}
		}		
	}
	public void delete (int value) {
		//Find position
		int pos = find(value);
		for(int i=pos;i<size;i++) {
			arr[i] = arr[i+1];
		}
		size--;
		
	}
	
}
