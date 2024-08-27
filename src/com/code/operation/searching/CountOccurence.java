package com.code.operation.searching;

public class CountOccurence {
	public static void main(String[] args) {
		int[] array = { 10, 20, 20, 30, 40 };
		int start = 0;
		int end = array.length - 1;
		int target = 20;
		int countOfAnArray = getCountOfAnArray(array, start, end, target);
		System.out.println(countOfAnArray);
	}

	private static int getCountOfAnArray(int[] array, int start, int end, int target) {
		int count = 1;
		while (start <= end) {
			boolean flag = true;
			if (array[start] != target) {
				flag = false;
				return 0;
			} else
				count++;
			start++;

		}
		return -1;
	}
}
