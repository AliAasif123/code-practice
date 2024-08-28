package com.code.operation.searching;

public class Count1s {
	public static void main(String[] args) {
		int[] array = { 0,  1, 1, 1, 1, 1 };
		int start = 0;
		int end = array.length - 1;
		int countOfOne = getCountOfOne(array, start, end);
		System.out.println(countOfOne);
	}

	private static int getCountOfOne(int[] array, int start, int end) {
		while (start <= end) {
			int mid = end + (start - end) / 2;
			if (array[mid] < 1) {
				start = mid + 1;

			} else if (array[mid] > 1) {
				start = mid - 1;
			} else {
				if (mid == 0 || array[mid - 1] != array[mid]) {
					return array.length - mid;
				} else {
					end = mid - 1;
				}
			}

		}
		return end;
	}

}
