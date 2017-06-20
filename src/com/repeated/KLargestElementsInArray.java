package com.repeated;

import java.util.Collections;
import java.util.PriorityQueue;

public class KLargestElementsInArray {

	public static void main(String[] args) {
		int[] array =  new int[]{112,25,32,74,52};
		int k = 2;
		
		PriorityQueue queue = new PriorityQueue<>(Collections.reverseOrder());		
		for(int i:array) {			
			queue.add(i);
		}
		System.out.println(queue);
		
		while(k!=0) {
			System.out.println(queue.poll());
			k--;
		}		
	}
}
