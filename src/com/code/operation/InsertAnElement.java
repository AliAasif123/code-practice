package com.code.operation;

import java.util.Arrays;

public class InsertAnElement {

	public static void main(String[] args) {

		int array[] = { 5, 7, 10, 20, 8 };
		System.out.println(insertAnElement(array, 1, 3, 2, 6, array.length));

	}

	static String insertAnElement(int array[], int indx, int x, int pos, int cap, int n) {
		int newArray[] = new int[n + 1];
		for (int i = 0; i < n; i++) {
			newArray[i] = array[i];
		}
		for (int i = n - 1; i >= indx; i--) {
			newArray[i + 1] = array[i];
			newArray[indx] = x;
		}
		return Arrays.toString(newArray);
	}

}
