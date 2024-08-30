package com.code.operation.sorting;

public class BubbleSort {

	public static void main(String[] args) {

		int[] array = { 2, 10, 8, 7, 3 };
		int n = array.length;
		bubble(array, n);
		for (int i = 0; i < n; i++) {
			System.out.print(array[i] + " ");
		}
	}

	private static void bubble(int[] array, int n) {
		int temp;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (array[j] > array[j + 1]) {
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}

			}

		}
	}
}
