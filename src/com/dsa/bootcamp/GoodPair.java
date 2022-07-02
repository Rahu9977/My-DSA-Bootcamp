package com.dsa.bootcamp;

public class GoodPair {


//	Given an array A and an integer B. A pair(i, j) in the array is a good pair if i != j and (A[i] + A[j] == B). 
//	Check if any good pair exist or not.
	
	/*
	 * Example Input
Input 1:

A = [1,2,3,4]
B = 7
Input 2:

A = [1,2,4]
B = 4
Input 3:

A = [1,2,2]
B = 4

Example Output
Output 1:

1
Output 2:

0
Output 3:

1


Example Explanation
Explanation 1:

 (i,j) = (3,4)
Explanation 2:

No pair has sum equal to 4.
Explanation 3:

 (i,j) = (2,3)
	 */
	public static void main(String[] args) {

	}

	public int solve(int[] A, int B) {
		int count = 0;
		int n = A.length;
		for (int i = 0; i < n-1; i++) {
			for (int j = i + 1; j < n; j++) {
				if (A[i] + A[j] == B) {
					return 1;
				}
			}
		}
		return 0;
	}

}
