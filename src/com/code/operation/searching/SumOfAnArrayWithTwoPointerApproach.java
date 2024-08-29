package com.code.operation.searching;

public class SumOfAnArrayWithTwoPointerApproach {

	public static void main(String[] args) {
		int array[] = { 2, 4, 8, 9, 11, 12, 20, 30 };
		int low = 0;
		int high = array.length - 1;
		int x = 23;
		boolean sumOfAnArray = isSumOfAnArray(array, low, high, x);
		System.out.println(sumOfAnArray);
	}

	private static boolean isSumOfAnArray(int[] array, int low, int high, int x) {
		while (low <= high) {
			if (array[low] + array[high] == x) {
				return true;
			}
			if (array[low]+array[high]>x) {
				high=high-1;
			}
			else {
				low=low+1;
			}
			
		}
		return false;
	}
}
