package com.answers.ganga;

import java.util.HashMap;
import java.util.Map;

public class Polynomial {

	public static void main(String[] args) {
		Map<Integer,Integer> polynomial = new HashMap<Integer,Integer>();
		polynomial.put(0,1);
		polynomial.put(1, 6);
		polynomial.put(3, 5);
		
		Map<Integer,Integer> derivative = new HashMap<Integer,Integer>();
		for(Map.Entry<Integer,Integer> entry: polynomial.entrySet()) {
			if(entry.getKey()!=0) {
				derivative.put(entry.getKey()-1, entry.getKey() * entry.getValue());
			}
		}
		System.out.println(polynomial);
		System.out.println(derivative);
	}

}
