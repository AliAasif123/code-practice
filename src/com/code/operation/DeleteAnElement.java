package com.code.operation;

import java.util.Arrays;

public class DeleteAnElement {

	public static void main(String[] args) {
		int array[] = { 5, 7, 10, 20, 8, 9 };
		String delete = Delete(array, 5, array.length);
		System.out.println(delete);
	}

	private static String Delete(int[] array, int x, int length) {
		int[] newArray = new int[length - 1];
		int i;
		int j;
		for (i = 0; i < length; i++) {
			if (array[i] == x) {
				break;
			}
			newArray[i] = array[i];
		}
		for (j = i + 1; j < length; j++) {
			newArray[j - 1] = array[j];
		}

		return Arrays.toString(newArray);
	}

}
