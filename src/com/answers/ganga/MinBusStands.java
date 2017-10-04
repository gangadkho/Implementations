package com.answers.ganga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MinBusStands {

	public static void main(String arg[]) {
		List arrivalList = new ArrayList();
		arrivalList.add(9.00);
		arrivalList.add(9.40);
		arrivalList.add(9.50);
		arrivalList.add(11.00);
		arrivalList.add(15.00);
		arrivalList.add(18.00);

		List depList = new ArrayList();
		depList.add(9.10);
		depList.add(12.00);
		depList.add(11.20);
		depList.add(11.30);
		depList.add(19.00);
		depList.add(20.00);

		List sortedList = new ArrayList();
		sortedList.addAll(arrivalList);
		sortedList.addAll(depList);

		Collections.sort(sortedList);
		System.out.println(sortedList);
		int arr = 0;
		int min = 0;
		for (Object o : sortedList) {
			if (arrivalList.contains(o)) {
				arr += 1;
				if (arr > min) {
					min += 1;
				}
			} else if (depList.contains(o)) {
				arr -= 1;
			}
		}

		System.out.println("Minimum num of bus stands " + min);

	}

}
