package com.answers.ganga;

import java.util.HashSet;
import java.util.Set;

import com.answers.ganga.KTHToLastElement.LinkedList;
import com.answers.ganga.KTHToLastElement.Node;

public class RemoveDuplicatesLinkedList {

	public static void main(String[] args) {
		LinkedList llist = new LinkedList();
		llist.add(3);
		llist.add(15);
		llist.add(7);
		llist.add(19);
		llist.add(1);
		llist.add(3);
		llist.add(5);
		llist.add(17);
		
		
		//removeDuplicatesWithBuffer(llist);
		removeDuplicatedWithoutBuffer(llist);
	}

	private static void removeDuplicatedWithoutBuffer(LinkedList llist) {
		
		Node curr = llist.head;
		Node prev = null;
		for(int i=0;i<llist.size;i++) {
			int currData = curr.data;
			while(curr!=null) {
				prev = curr;
				curr = curr.next;
				
				if(curr!=null && curr.data==currData) {
					prev.next = curr.next;
				}
			}
			curr = llist.head;
		}
		
		printLinkedList(llist);
		
		
		
	}
	private static void printLinkedList(LinkedList list) {
		Node temp = list.head;
		while(temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
	private static void removeDuplicatesWithBuffer(LinkedList llist) {
		Set set = new HashSet();
		Node curr = llist.head;
		Node prev = null;
		while(curr!= null) {
			System.out.println(curr);
			if(set.contains(curr.data)) {
				prev.next = curr.next;
			} else {
				set.add(curr.data);				
			}
			prev = curr;
			curr = curr.next;
		}
		
		printLinkedList(llist);
		
	}

}
