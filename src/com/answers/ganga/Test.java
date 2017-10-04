package com.answers.ganga;

import java.util.LinkedList;

public class Test {
	
	class Node
	{
	    int data;
	    Node left, right;
	   Node(int item)    {
	        data = item;
	        left = right = null;
	    }
	} 
	int res;
	int dia(Node root)
	{
	    if(root==null) return 0;
	    int l=dia(root.left);
	    int r=dia(root.right);
	    res=Math.max(res,l+r+1);
	    return Math.max(l,r)+1;
	}
	   /* Complete the function to get diameter of a binary tree */
	    int diameter(Node node)
	    {
	        res=0;
	        dia(node);
	        return res;
	    }
	public static void main(String[] args) {
		

	}

}
