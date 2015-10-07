package com.amanzed.algorithms.sort;

public class QuickSort {

	static int arr[];
	
	public static int[] sort(int[] ar){
		arr = ar;		
		sort(0,arr.length-1);
		return arr;
	}

	private static void swap(int i, int j) {
	    int t = arr[i];
	    arr[i] = arr[j];
	    arr[j] = t;
		print();
	}
	private static void sort(int l, int r) {
		if(l < r){
			System.out.println("...");
			int pivot = arr[(l + r)/2];
			int nl = l;
			int nr = r;
			
			do {
				while(arr[nl] < pivot){
					nl++;
				}
				while (pivot < arr[nr]) {
					nr--;
				}
				if (nl <= nr) {
			          swap(nl, nr);
			          nl++;
			          nr--;
				}
			} while (nl <= nr);
			sort(l, nr);
			sort(nl, r);
		}
	}
	
	private static void print(){
		System.out.print("\nIN: ");
		for (int i : arr) {
			System.out.print(i + " , ");
		}
		System.out.print("\n");
	}
}

