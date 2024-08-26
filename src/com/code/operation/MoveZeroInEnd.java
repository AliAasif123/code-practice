package com.code.operation;

import java.util.Arrays;

public class MoveZeroInEnd {
	public static void main(String[] args) {

		int array[] = { 10, 5, 9, 0, 8, 7, 0, 99, 8, 0 };
		int n = array.length;
		Move(array, n);
	}

	private static void Move(int[] array, int n) {
		for (int i = 0; i < n; i++) {
			if (array[i] == 0)
				for (int j = i + 1; j < n; j++) {
					if (array[j] != 0) {
						int temp = array[i];
						array[i] = array[j];
						array[j] = temp;
					}
				}

		}
		System.out.println(Arrays.toString(array));

	}

}
