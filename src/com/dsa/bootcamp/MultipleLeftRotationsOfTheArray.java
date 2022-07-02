package com.dsa.bootcamp;

import java.util.ArrayList;

/*
 * Given an array of integers A and multiple values in B, which represents the number of times array A needs to be left rotated.

Find the rotated array for each value and return the result in the from of a matrix where ith row represents the rotated array for the ith value in B.

input Format
The first argument given is the integer array A.
The second argument given is the integer array B.


Output Format
Return the resultant matrix.


Example Input
Input 1:
 
    A = [1, 2, 3, 4, 5]
    B = [2, 3]

Input 2:

  
    A = [5, 17, 100, 11]
    B = [1]




Example Output
Output 1:
 
    [ [3, 4, 5, 1, 2]
     [4, 5, 1, 2, 3] ]


Output 2:

    
    [ [17, 100, 11, 5] ]


Example Explanation
for input 1 -> B[0] = 2 which requires 2 times left rotations

1: [2, 3, 4, 5, 1]

2: [3, 4, 5, 1, 2]

B[1] = 3 which requires 3 times left rotation

1: [2, 3, 4, 5, 1]

2: [3, 4, 5, 1, 2]

2: [4, 5, 1, 2, 4]
 */
public class MultipleLeftRotationsOfTheArray {

	public static void main(String[] args) {
		ArrayList<Integer> A = new ArrayList();
		ArrayList<Integer> B = new ArrayList();
		A.add(1);
		A.add(2);
		A.add(3);
		A.add(4);
		A.add(5);
		
		B.add(2);
		B.add(3);
		
		solve(A,B);
		System.err.println(solve(A,B));

	}
	 public static ArrayList<ArrayList<Integer>> solve(ArrayList<Integer> A, ArrayList<Integer> B) {
         ArrayList<ArrayList<Integer>> result = new ArrayList<>();
       for (int i = 0; i < B.size(); i ++) {
           ArrayList<Integer> row = new ArrayList<>();
           int pivot = B.get(i) % A.size();
           row.addAll(A.subList(pivot, A.size()));
           row.addAll(A.subList(0, pivot));
           result.add(row);
       }
       return result;
   }
}

