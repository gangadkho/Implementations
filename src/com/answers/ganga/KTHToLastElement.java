package com.answers.ganga;

import java.util.Scanner;

public class KTHToLastElement {

	static class Node {
		int data;
		Node next;
		Node(int data) {
			this.data = data;
		}
	}
	static class LinkedList {
		Node head;
		int size;
		LinkedList() {
			head = null;
		}
		public void add(int data) {
			if(head == null) {
				head = new Node(data);
			} else {
				Node curr = new Node(data);
				Node temp = head;
				while(temp.next != null) {
					temp = temp.next;
				}
				temp.next = curr;
				size++;
			}
		}
	}
	
	
	public static void main(String[] args) {
		LinkedList llist = new LinkedList();
		llist.add(3);
		llist.add(5);
		llist.add(7);
		llist.add(9);
		llist.add(11);
		llist.add(13);
		llist.add(15);
		llist.add(17);
		
		
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		
		Node ptr = llist.head;
		for(int i=0;i<k;i++) {
			if(ptr!=null) {
				ptr=ptr.next;
			}
		}
		
		Node currentPtr = llist.head;
		for(int j=0;j<llist.size;j++) {
			if(currentPtr!=null && ptr!=null) {
				currentPtr = currentPtr.next;
				ptr = ptr.next;
				break;
			}
		}
		System.out.println(ptr.data);
		

	}

}
