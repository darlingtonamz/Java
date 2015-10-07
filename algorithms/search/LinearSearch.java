package com.amanzed.algorithms.search;

public class LinearSearch{
	public static void main(String[] args){
		Object[] nums = {5,2,4,3,1,6,"love",9,8,10};	
		System.out.println(search(nums, 9));
	}
	private LinearSearch(){}
	
	/*public static int search(int[] array, int element){		
		for (int i = 0; i < array.length; i++){
			if(array[i] == element)
				return i;
		}
		return -1;
	}*/
	
	public static int search(Object[] array, Object element){		
		for (int i = 0; i < array.length; i++){
			if(array[i].equals(element))
				return i;
		}
		return -1;
	}
}