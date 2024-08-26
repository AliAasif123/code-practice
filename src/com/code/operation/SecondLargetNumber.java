package com.code.operation;

public class SecondLargetNumber {
	public static void main(String[] args) {
		int array[] = { 5, 8, 12, 20, 9, 3 };
		int n = array.length;
		int large = getLarge(array, n);
		int secondlarge = getSecondlarge(array, large, n);
		System.out.println(secondlarge);
	}

	private static int getSecondlarge(int[] array, int large, int n) {
		int res = -1;
		for (int i = 0; i < n; i++) {
			if (array[i] != array[large]) {
				if (res == -1) {
					res = i;
				} else if (array[i] > array[res]) {
					res = i;
				}
			}
		}
		return res;
	}

	private static int getLarge(int[] array, int n) {
		int res = 0;
		for (int i = 1; i < n; i++) {
			if (array[i] > array[res]) {
				res = i;
			}

		}
		return res;

	}
}
