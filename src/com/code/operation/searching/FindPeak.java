package com.code.operation.searching;

public class FindPeak {
	public static void main(String[] args) {
		int[] array = { 5, 20, 40, 30, 20, 50, 60 };
		int low = 0;
		int high = array.length - 1;
		int findPeakElement = findPeakElement(array, low, high);
		System.out.println(findPeakElement);
	}

	private static int findPeakElement(int[] array, int low, int high) {
		while (low <= high) {
			int mid = low + (high - low) / 2;
			if ((mid == 0 || array[mid - 1] <= array[mid]) && (mid == array.length - 1 || array[mid + 1] <= array[mid])) {
				return mid;
			}  if (mid > 0 && array[mid - 1] >= array[mid]) {
				high = mid - 1;
			} else
				low = mid + 1;
		}
		return -1;

	}
}
