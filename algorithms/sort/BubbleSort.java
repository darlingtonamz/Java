package com.amanzed.algorithms.sort;

public class BubbleSort {
	
	public static int[] sort(int[] arr){
		if(arr.length <= 1) return arr;
		
		for (int pos = 0; pos < arr.length; pos++) {
			int leastPos = pos + 1;
			
			for (int j = leastPos; j < arr.length; j++) {
				if (arr[j] < arr[leastPos]) {
					leastPos = j;
				}				
			}
			
			if (pos < arr.length-1) {
				int temp = arr[pos + 1];
				arr[pos + 1] = arr[leastPos];
				arr[leastPos] = temp;
			}			
		}
		return arr;
	}

}
