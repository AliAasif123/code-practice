package com.code.playWithNumber;

public class PellsApproach {

	public static void main(String[] args) {
		int n = 6;
		for (int i = 0; i <= n; i++) {
			System.out.println("Pell number for n = " + i + " is: " + calculatePell(i));
		}
	}

	private static int calculatePell(int n) {
		if (n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		}

		int a = 0;
		int b = 1;
		int c = 0;

		for (int i = 2; i <= n; i++) {
			c = 2 * b + a;
			a = b;
			b = c;
		}

		return c;
	}
}
