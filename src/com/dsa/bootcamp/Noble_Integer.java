package com.dsa.bootcamp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*
 Given an integer array A, find if an integer p exists in the array 
 such that the number of integers greater than p in the array equals p.
 
Input Format
First and only argument is an integer array A.

Output Format
Return 1 if any such integer p is present else, return -1.

Example Input
Input 1:

 A = [3, 2, 1, 3]
Input 2:

 A = [1, 1, 3, 3]

Example Output
Output 1:

 1
Output 2:

 -1

Example Explanation
Explanation 1:

 For integer 2, there are 2 greater elements in the array..
Explanation 2:

 There exist no integer satisfying the required conditions.
 */
public class Noble_Integer {

	public static void main(String[] args) {
		ArrayList<Integer>A = new ArrayList();
		A.add(3);
		A.add(2);
		A.add(1);
		A.add(3);
		System.err.println(solve(A));
	}

	public static int solve(ArrayList<Integer> A) {
		Collections.sort(A);
		for (int i = A.size() - 1; i >= 0; i--) {
			if (i < A.size() - 1 && A.get(i) == A.get(i + 1))
				continue;
			if (A.get(i) == (A.size() - i - 1))
				return 1;
		}
		return -1;
	}

}
