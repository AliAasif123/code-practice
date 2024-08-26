package com.code.operation;

public class MaxArrayEvenOddArray {

	public static void main(String[] args) {

		int array[] = { 10, 12, 14, 7, 8, 5 };
		int n = array.length;
		findMaxEvenOdd(array, n);
	}

	private static void findMaxEvenOdd(int[] array, int n) {
		int res = 1;
		for (int i = 0; i <= n; i++) {
			int curr = 1;
			for (int j = i + 1; j < n; j++) {
				if ((array[j] % 2 == 0 && array[j - 1] % 2 != 0) || (array[j] % 2 != 0 && array[j - 1] % 2 == 0)) {
					curr++;
				} else {
					break;
				}
			}
			res = max(res, curr);
		}
		System.out.println(res);

	}

	private static int max(int res, int curr) {
		if (res > curr) {
			return res;
		}
		return curr;
	}
}
