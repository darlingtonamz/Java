package com.amanzed.datatypes;

import java.util.Random;

public class Test {
	public static void main(String[] args){
		Queue<Integer> q = new Queue<Integer>();
		int[] arr = {34,2,54,8,5,1,4,7,79,4,6};
		for (int i = 0; i < 10; i++) {
			q.push(arr[i]);
		}	
		System.out.println(q.toString());
		q.pop();
		System.out.println(q.toString());
		q.clear();
		System.out.println(q.toString());
		
		/*Stack<Integer> stk = new Stack<Integer>();
		for (int i = 0; i < 10; i++) {
			stk.push(i);
		}
		System.out.println(stk.toString());
		stk.pop();
		System.out.println(stk.toString());
		stk.size();
		System.out.println(stk.toString());
		
		System.out.println("Size: " + stk.size());
		
		//System.out.println("Contains: " + stk.contains(4));
		
		System.out.println("IsEmpty: " + stk.isEmpty());
		stk.clear();
		System.out.println(stk.toString());*/
		
		/*BinarySearchTree bst = new BinarySearchTree();
			
		bst.toString();
		System.out.println("\nSmallest: "+bst.smallest() +"\nLargest: "+bst.largest());*/
	}
}
