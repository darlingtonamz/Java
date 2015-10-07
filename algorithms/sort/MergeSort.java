package com.amanzed.algorithms.sort;

import java.util.ArrayList;

public class MergeSort{
	static int[] arr;
	
	@SuppressWarnings("static-access")
	public static int[] sort(int[] arr1){
		int first = 0;
		arr = arr1;
		System.out.println("\nLength: "+arr.length);
		int last = arr.length - 1;
		sort(first, last);
		return arr;
	}

	private static void sort(int first, int last) {
		if(first > last) return;
		if((last - first) == 1){
			if(arr[last] > arr[first])
				return;
			else
				swap(last,first);
		}else{		
			//System.out.println("Length");
			int mid = (first + last)/2;
			sort(first, mid);
			sort(mid+1,last);
			merge(first,last,mid);
		}
	}
	
	private static void merge(int f, int l, int m){
		boolean swapped = true;
		while (swapped) {
			swapped = false;
			for (int i = f; i <= m; i++) {
				for (int j = (m+1); j <= l; j++) {
					if(arr[i] > arr[j]){
						swap(i,j);
						swapped = true;
					}
				}
			}
		}
		
	}
	
	private static void swap(int n1, int n2){
		System.out.println("Swap "+n1+ " : " + n2);
		int temp = arr[n1];
		arr[n1] = arr[n2];
		arr[n2] = temp;

		System.out.print("\nIN: ");
		for (int i : arr) {
			System.out.print(i + " , ");
		}
		System.out.print("\n");
	}
	
	private static int[] split(int f, int l){
		//int[] out = Int[l-f];
		return null;
	}
	
	
}
