package com.code.operation;

public class LeaderInAnArray {

	public static void main(String[] args) {
		int array[] = { 7, 10, 4, 10, 6, 5, 2 };
		int n = array.length;
		findLeader(array, n);
	}

	private static void findLeader(int[] array, int n) {
		for (int i = 0; i < n; i++) {
			boolean flag = true;
			for (int j = i + 1; j < n; j++) {
				if (array[i] <= array[j]) {
					flag = false;
					break;
				}
			}
			if (flag) {
				System.out.print(array[i] + " ");
			}
		}

	}

}
