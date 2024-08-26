package com.code.operation;

public class RemoveDuplicateFromSortedArray {

	public static void main(String[] args) {
		int array[] = { 10, 10, 20, 30, 30, 30 };
		int n = array.length;
		System.out.println(removeDuplicate(array, n));

	}

	private static Object removeDuplicate(int[] array, int n) {
		int res = 1;
		for (int i = 1; i < n; i++) {
			if (array[i] != array[res - 1]) {
				array[res] = array[i];
				res++;
			}
		}
		return res;

	}
}
