package com.answers.ganga;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class SortArrayWRTAnotherArray {
	public static Scanner sc = new Scanner(System.in);
	private static int[] getArray(int x) {		
		int [] A = new int[x];
		for(int i=0;i<x;i++) {
			A[i] = sc.nextInt();			
		}				
		return A;
	}
	public static void main(String[] args) {
		
		int N = Integer.parseInt(sc.nextLine());
		for(int x=0;x<N;x++) {
			int A1S = sc.nextInt();
			int A2S = sc.nextInt();
			int[] A1 = getArray(A1S);
			int[] A2 = getArray(A2S);
			sortAndPrint(A1,A2);
		}
		sc.close();
	}
	private static void sortAndPrint(int[] A1, int[] A2) {		
		int outputSize = 0;
		Map<Integer,Integer> countMap = new TreeMap<Integer,Integer>();
		
		for(int i:A1) {
			int val = 1;
			if(countMap.containsKey(i)) {
				val = countMap.get(i);
				val++;
			} 
			countMap.put(i, val);
		}
		for(int j=0;j<A2.length;j++) {
			if(countMap.containsKey(A2[j])) {
				int val = countMap.get(A2[j]);
				
				for(int k=0;k<val;k++) {
					A1[outputSize] = A2[j];
					outputSize++;
				}
				countMap.remove(A2[j]);
			}
		}
		for(Map.Entry<Integer,Integer> entry : countMap.entrySet()) {
			A1[outputSize] = entry.getKey();
			outputSize++;
		}
		for(int element:A1) {
			System.out.print(element+" ");
		}
		
	}

}
