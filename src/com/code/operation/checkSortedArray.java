package com.code.operation;

public class checkSortedArray {

	public static void main(String[] args) {
		int array[] = { 5, 6, 3, 8, 12, 16 };
		int n = array.length;
		boolean checkSorted = checkSorted(array, n);
		System.out.println(checkSorted);
	}

	private static boolean checkSorted(int array[], int n) {
		boolean flag = true;
		for (int i = 1; i < n; i++) {
			if (array[i - 1] > array[i]) {
				flag = false;
			}
		}
		return flag;

	}

}
