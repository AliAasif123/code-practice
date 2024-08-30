package com.code.operation.sorting;

public class SelectionSort {
	public static void main(String[] args) {
		int array[] = { 10, 5, 8, 20, 2, 18 };
		int n = array.length;
		selectSort(array, n);
		for (int i = 0; i < n; i++) {
			System.out.print(array[i] + ", ");
		}
	}

	private static void selectSort(int[] array, int n) {

		for (int i = 0; i < n - 1; i++) {
			int min_idex = i;
			for (int j = i + 1; j < n; j++) {
				if (array[j] < array[min_idex]) {
					min_idex = j;

				}
			}
			swap(array, min_idex,i);

		}
	}

	private static void swap(int[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
}
