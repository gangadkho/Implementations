package com.answers.ganga;

import java.util.Scanner;

import com.answers.ganga.KTHToLastElement.LinkedList;
import com.answers.ganga.KTHToLastElement.Node;

public class ListPartition {
	public static void main(String arg[]) {
		LinkedList list = new LinkedList();
		list.add(1);
		list.add(32);
		list.add(45);
		list.add(20);
		list.add(4);
		list.add(6);
		list.add(16);
		
		Scanner sc = new Scanner(System.in);
		int val = sc.nextInt();
		Node temp = list.head;
		while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
		
		
		System.out.println(partition(list, val));
		
		
		
		
	}

	private static Node partition(LinkedList list, int val) {
		Node beforeList = null;
		Node afterList = null;
		
		Node temp2 = list.head;
		while(temp2!=null) {
			System.out.println("Inside while");
			Node next = temp2.next;
			if(temp2.data<val) {
				temp2.next = beforeList;
				beforeList = temp2;
			} else {
				temp2.next = afterList;
				afterList = temp2;
			}
			temp2 = next;
		}
		
		if(beforeList==null) {			
			return afterList;			
		}
		while(beforeList!=null) {
			beforeList = beforeList.next;
		}
		beforeList.next = afterList;
		
		return beforeList;
		
	}
}
