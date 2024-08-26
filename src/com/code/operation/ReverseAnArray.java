package com.code.operation;

import java.util.Arrays;

public class ReverseAnArray {

	public static void main(String[] args) {
		int array[] = { 10, 5, 7, 3 };
		int n = array.length;
		String reverseAnArray = reverseAnArray(array, n);
		System.out.println(reverseAnArray);
	}

	private static String reverseAnArray(int[] array, int n) {
		int low = 0;
		int high = array.length - 1;
		while (low < high) {
			int temp = array[low];
			array[low] = array[high];
			array[high] = temp;
			low++;
			high--;
		}
		return Arrays.toString(array);
	}
}
