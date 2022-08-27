package com.dsa.bootcamp;

import java.util.Arrays;

//Given an array of positive integers A, two integers appear only once, and all the other integers appear twice.
//Find the two integers that appear only once.
/*
 * 
 Input Format
The first argument is an array of integers of size N.

Output Format
Return an array of two integers that appear only once.


Example Input
Input 1:
A = [1, 2, 3, 1, 2, 4]
Input 2:

A = [1, 2]


Example Output
Output 1:
[3, 4]
Output 2:

[1, 2]


Example Explanation
Explanation 1:
3 and 4 appear only once.
Explanation 2:

1 and 2 appear only once.
 */

public class Single_Number_3 {

	public static void main(String[] args) {
		int[] A = { 1, 2, 3, 1, 2, 4 };
		int[] res = solve(A);
		for (int n : res) {
			System.err.println(n);
		}

	}

	public static int[] solve(int[] A) {

		int xor = 0;
		for (int num : A) {
			xor ^= num;
		}
		
		int lowestBit = xor & (-xor);
		
		int[] result = new int[2];

		for (int num : A) {
			if ((lowestBit & num) == 0) {
				result[0] ^= num;
			} else {
				result[1] ^= num;
			}

		}

		Arrays.sort(result);
		return result;
	}
}
