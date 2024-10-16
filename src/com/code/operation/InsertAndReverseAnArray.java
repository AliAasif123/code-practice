package com.code.operation;

import java.util.Arrays;
import java.util.Collections;

public class InsertAndReverseAnArray {

	public static void main(String[] args) {
		Integer[] arr = { 1, 0, 0, 1,1, 0, 1, 0 };

		Arrays.sort(arr);

		Collections.reverse(Arrays.asList(arr));

		System.out.println(Arrays.toString(arr));
		
	
	}
}
