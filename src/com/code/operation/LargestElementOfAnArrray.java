package com.code.operation;

public class LargestElementOfAnArrray {

	public static void main(String[] args) {
		int array[] = { 10, 5, 20, 8, 76 };
		int n = array.length;
		int findLarge = findLarge(array, n);
		System.out.println(findLarge);
	}
// naive approach
//	private static int findLarge(int array[], int n) {
//		for (int i = 0; i < n; i++) {
//			boolean flag = true;
//			for (int j = i + 1; j < n; j++) {
//				if (array[i] < array[j]) {
//					flag = false;
//					break;
//				}
//			}
//			if (flag == true) {
//				return i;
//			}
//
//		}
//		return -1;
//	}

	// efficient approach..
	private static int findLarge(int array[], int n) {
		int res = 0;
		for (int i = 1; i < n; i++) {
			if(array[i]>array[res]) {
				res=i;
			}
		}
		return res;
	}

}
