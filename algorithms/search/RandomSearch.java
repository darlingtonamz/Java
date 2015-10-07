package com.amanzed.algorithms.search;

import java.util.Random;

public class RandomSearch {
	private RandomSearch(){}
	
	public static int search(int[] a, int e){
		while (true){
			Random rd = new Random();
			int n = rd.nextInt(a.length - 1);
			if (a[n] == e) {
				return n;
			}
		}
	}

}
