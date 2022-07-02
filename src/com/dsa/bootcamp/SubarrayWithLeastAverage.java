package com.dsa.bootcamp;

import java.util.ArrayList;

//Q10. Subarray with least average

/*
* Given an array of size N, find the subarray of size K with the least average.
* 
* Input Format
First argument contains an array A of integers of size N.
Second argument contains integer k.


Output Format
Return the index of the first element of the subarray of size k that has least average.
Array indexing starts from 0.

Example Input
Input 1:
A=[3, 7, 90, 20, 10, 50, 40]
B=3
Input 2:

A=[3, 7, 5, 20, -10, 0, 12]
B=2


Example Output
Output 1:
3
Output 2:

4

Example Explanation
Explanation 1:
Subarray between indexes 3 and 5
The subarray {20, 10, 50} has the least average 
among all subarrays of size 3.
Explanation 2:

Subarray between [4, 5] has minimum average

*/
public class SubarrayWithLeastAverage {

	public static void main(String[] args) {
		ArrayList<Integer> A = new ArrayList();

		A.add(3);
		A.add(7);
		A.add(90);
		A.add(20);
		A.add(10);
		A.add(50);
		A.add(40);
		System.err.println(solve(A, 3));

	


	}

	public static int solve(int[] A, int B) { // Used sliding window
		//
		int currSum = 0;
		int outputIndex = 0;
		for (int i = 0; i < B; i++) { // get sum of 1st k elements
			currSum += A[i]; // O(N)
		}
		int min = currSum; // store sum of 1st k elements
		for (int i = 1; i <= A.length - B; i++) { // O(N)
			currSum = currSum - A[i - 1] + A[i + B - 1];
			// A[i - 1] - removing previous element
			// A[i + B - 1] adding next element
			if (currSum < min) {
				min = currSum;
				outputIndex = i;
			}
		}
		return outputIndex; // O (2N) = O(N)
	}

	public static int solve(ArrayList<Integer> A, int B) {
		int currSum = 0;
		int outputIndex = 0;
		for (int i = 0; i < B; i++) { // get sum of 1st k elements
			currSum += A.get(i); // O(N)
		}
		int min = currSum; // store sum of 1st k elements
		for (int i = 1; i <= A.size() - B; i++) { // O(N)
			currSum = currSum - A.get(i - 1) + A.get(i + B - 1);
			// A[i - 1] - removing previous element - java 7
			// A[i + B - 1] adding next element - java 7
			if (currSum < min) {
				min = currSum;
				outputIndex = i;
			}
		}
		return outputIndex;
	}

}
