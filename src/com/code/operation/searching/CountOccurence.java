package com.code.operation.searching;

public class CountOccurence {
	public static void main(String[] args) {
		int[] array = { 10, 20, 20,20, 30, 40 };
		int start = 0;
		int end = array.length - 1;
		int target = 20;
		int firstOccurence = firstOccurence(array, start, end, target);
		int lastOccurence = lastOccurence(array, start, end, target);
		int countOfAnArray = getCountOfAnArray(array, firstOccurence(array, start, end, target),
				lastOccurence(array, start, end, target));
		System.out.println(countOfAnArray);

	}

	private static int getCountOfAnArray(int[] array, int firstOccurence, int lastOccurenc) {
		if ((array[firstOccurence] == -1 || array[lastOccurenc] == -1)) {
			return 0;
		}
		return lastOccurenc - firstOccurence + 1;

	}

	private static int lastOccurence(int[] array, int start, int end, int target) {
		while (start <= end) {
			int mid = end + (start - end) / 2;
			if (array[mid] > target) {
				start = mid - 1;
			} else if (array[mid] < target) {
				start = mid + 1;
			} else {
				if (mid == 0 || array[mid + 1] != array[mid]) {
					return mid;
				}
				else {
					end = mid - 1;
				}
			}
		}
		return -1;

	}

	private static int firstOccurence(int[] array, int start, int end, int target) {
		while (start <= end) {
			int mid = end + (start - end) / 2;
			if (array[mid] > target) {
				start = mid - 1;
			} else if (array[mid] < target) {
				start = mid + 1;
			} else {
				if (mid == 0 || array[mid - 1] != array[mid]) {
					return mid;
				}
				else {
					end = mid - 1;
				}
			}
		}
		return -1;

	}

}
