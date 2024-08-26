package com.code.operation;

public class LeftRotateByOne {

	public static void main(String[] args) {

		int array[] = { 1, 2, 3, 4, 5 };
		int n = array.length;
		leftRotate(array, n);
	}

	private static void leftRotate(int[] array, int n) {
		int temp = array[0];
		for (int i = 1; i < n; i++) {
			array[i - 1] = array[i];

		}
		array[n - 1] = temp;
		for (int i = 0; i < n; i++) {
			System.out.print(array[i] + " ");
		}

	}
}
