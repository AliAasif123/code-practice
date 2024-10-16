package com.code.operation.sorting;

public class InsertionSort {

	public static void main(String[] args) {

		int[] array = { 20, 5, 40, 60, 10, 30 };
		int n = array.length;
		insertionSort(array, n);
		for (int x : array)
			System.out.print(x + " ");
	}

	private static void insertionSort(int[] array, int n) {
		for (int i = 1; i < n; i++) {
			int key = array[i];
			int j = i - 1;
			while (j >= 0 && array[j] > key) {
				array[j + 1] = array[j];
				j--;
			}
			array[j + 1] = key;
		}

	}
}
