package com.code.operation.searching;

public class TripletSum {
	public static void main(String[] args) {
		int[] array = { 2, 3, 5, 6, 15 };
		int x = 20;
		boolean triplte = isTriplte(array, x);
		System.out.println(triplte);
	}

	private static boolean isTriplte(int[] array, int x) {
		for (int i = 0; i < array.length - 2; i++) {
			for (int j = i + 1; j < array.length - 1; j++) {
				for (int k = j + 1; k < array.length; k++) {
					if (array[i] + array[j] + array[k] == x) {
						return true;
					}
				}
			}

		}
		return false;

	}
}
