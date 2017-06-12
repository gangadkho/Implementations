package com.answers.ganga;

import java.util.LinkedList;

public class LinkedListReversal {
	
	
	 static Node head;
	 
	    static class Node {
	 
	        int data;
	        Node next;
	 
	        Node(int d) {
	            data = d;
	            next = null;
	        }
	    }
	    
	    public void ReverseUsingRecursion(Node p) {
	    	if(p.next ==  null) {
	    		head = p;
	    		return;
	    	}
	    	ReverseUsingRecursion(p.next);
	    	Node q = p.next;
	    	q.next = p;
	    	p.next = null;
	    }
	    void printList(Node node) {
	        while (node != null) {
	            System.out.print(node.data + " ");
	            node = node.next;
	        }
	    }
	public static void main(String ar[]) {
		LinkedListReversal list = new LinkedListReversal();
		list.head = new Node(1);
        list.head.next = new Node(2);
        list.head.next.next = new Node(3);
        list.head.next.next.next = new Node(4);
        list.head.next.next.next.next = new Node(5);
        list.head.next.next.next.next.next = new Node(6);
        list.head.next.next.next.next.next.next = new Node(7);
        list.head.next.next.next.next.next.next.next = new Node(8);
		
		list.printList(head);
		
		
		list.ReverseUsingRecursion(head);
		list.printList(head);
		
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		linkedList.add(1);
		linkedList.add(2);
		linkedList.add(3);
		linkedList.add(4);
		linkedList.add(5);
		//System.out.println(linkedList);
		
		
		//System.out.println(linkedList.remove());
		//Create a Stack
		//Remove items from LinkedList and push to Stack.
		//Once the LinkedList is empty, start popping from the stack and add it to the linked list
		
		
	}
	
	
	//Another Approach
//	currentNode = head;
//	while(currentNode != null) {
//		nextNode = currentNode.next();
//		currentNode.next = prevNode;
//		prevNode = currentNode;
//		currentNode = nextNode
//	}
//	head = prevNode;
	
}
