package com.code.operation.searching;

public class BinarySearch {
	public static void main(String[] args) {
		int array[] = { 10, 20, 30, 40, 50, 60, 70 };
		int low = 0;
		int high = array.length - 1;
		int target = 60;
		int search = search(array, low, high, target);
		System.out.println(search);
	}

	private static int search(int[] array, int low, int high, int target) {
		while (low <= high) {
			int mid = high + (low - high) / 2;
			if (array[mid] == target) {
				return mid;
			} else if (array[mid] < target) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return -1;
	}
}
