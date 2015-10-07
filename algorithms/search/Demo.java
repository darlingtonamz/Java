package com.amanzed.algorithms.search;

import java.util.Random;

import com.amanzed.algorithms.sort.BubbleSort;
import com.amanzed.algorithms.sort.MergeSort;
import com.amanzed.algorithms.sort.QuickSort;

public class Demo {
	public static void main (String[] args){
		/*int[] arr = new int[1000];
		Random rd = new Random();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rd.nextInt(999);
		}*/
		//System.out.println(BinarySearch.search(arr,5));
		
		int[] arr2 = {1,24,5,6,8,32,3};
		print(QuickSort.sort(arr2));
	}
	
	public static boolean isSorted(int[] arr){
		boolean out = (arr[0] > arr[1]);
		int i = 1;
		while (i < arr.length - 2){
			if ((arr[i] > arr[i+1]) != out)
				return false;
			i++;
		}
		
		return true;
	}
	
	private static void print(int[] arr){
		System.out.print("\nIN: ");
		if(arr.length < 1) System.out.println("Empty");
		for (int i : arr) {
			System.out.print(i + " , ");
		}
		System.out.print("\n");
	}
}
