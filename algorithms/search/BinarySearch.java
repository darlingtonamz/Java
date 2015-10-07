package com.amanzed.algorithms.search;

public class BinarySearch {
	private BinarySearch(){}
	
	public static int search(int[] arr, int e){
		return search(arr, e, 0, arr.length - 1);
	}
	
	private static int search(int[] arr, int e, int first, int last){
		if (first > last) return -1;
		
		int mid = (first + last)/2;
		int midVal = arr[mid];
		
		if (midVal == e) {
			return mid;
		} else if (midVal > e) {
			return search(arr, e, 0, mid - 1);
		} else {
			return search(arr, e, mid + 1, last);
		} 
	}
	/*private static int search(int[] arr, int e, int first, int last){
		int mid = (first + last)/2;
		int midVal;
		if (arr.length > 0)
			midVal = arr[mid];
		else
			return -1;
		
		if (midVal == e) {
			return mid;
		} else if (midVal > e) {
			if (arr[first] <= e)
				return search(arr, e, 0, mid - 1);
		} else if (midVal < e) {
			if (arr[last] >= e)
				return search(arr, e, mid + 1, last);
		} 
		return -1;
	}*/
	/*public static int search(int[] array, int e){
		int start = 0;
		int end = array.length-1;
		int i = array.length / 2;
		int tries = 0;
		while(i > 0){	
			tries++;
			if(array[start] == e){
				return start;
			}else if(array[end] == e){
				return end;
			}else if ( array[i] > e){
				end = i;
			}else if ( array[i] < e){
				start = i;
			}
			
			if((end - start) == 1)
				break;
				
			i = ((start + end)/2);
			if (e == array[i])
				return i;
			System.out.println(start + " : " + end+"\nstart= "+array[start]+" : end= "+array[end]+" tries: "+tries);
		}
		return -1;
	}*/
}
