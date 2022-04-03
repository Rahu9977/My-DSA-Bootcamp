package com.dsa.bootcamp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
You are given a constant array A.
You are required to return another array which is the reversed form of the input array.

Input Format

First argument is a constant array A.

Output Format

Return an integer array.


Example Input

Input 1:

A = [1,2,3,2,1]
Input 2:

A = [1,1,10]


Example Output

Output 1:

 [1,2,3,2,1] 
Output 2:

 [10,1,1] 


Example Explanation

Explanation 1:

Reversed form of input array is same as original array
Explanation 2:

Clearly, Reverse of [1,1,10] is [10,1,1]
 */

public class Reverse_Array {

	public static void main(String[] args) {
		List<Integer> A = Arrays.asList(1,1,10);
		System.out.println(solve(A));
	}

	// DO NOT MODIFY THE LIST. IT IS READ ONLY
	public static ArrayList<Integer> solve(final List<Integer> A) {

		ArrayList<Integer> reversedList = new ArrayList<Integer>();
		for (int i = A.size() - 1; i >= 0; i--) {

			reversedList.add(A.get(i));
		}
		return reversedList;
	}
}
