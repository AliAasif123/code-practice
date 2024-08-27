package com.code.operation.searching;

public class LastOccurenceOfAnArray {

	public static void main(String[] args) {

		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 8, 9 };
		int start = 0;
		int end = array.length - 1;
		int target = 8;
		int fetchIndex = FetchIndex(array, start, end, target);
		System.out.println(fetchIndex);
	}

	private static int FetchIndex(int[] array, int start, int end, int target) {
		while (start <= end) {
			int mid = end + (start - end) / 2;

			if (array[mid] < target) {
				start = mid + 1;
			} else if (array[mid] > target) {
				start = mid - 1;
			} else {
				if (mid == 0 || array[mid +1] != array[mid]) {
					return mid;
				} else {
					end = mid - 1;
				}
			}

		}
		return -1;
	}
}
