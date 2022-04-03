package com.dsa.bootcamp;

/*
 *Find the contiguous non-empty subarray within an array, A of length N, with the largest sum.
 *Input Format
The first and the only argument contains an integer array, A.



Output Format
Return an integer representing the maximum possible sum of the contiguous subarray.



Example Input
Input 1:

 A = [1, 2, 3, 4, -10] 
Input 2:

 A = [-2, 1, -3, 4, -1, 2, 1, -5, 4] 


Example Output
Output 1:

 10 
Output 2:

 6 


Example Explanation
Explanation 1:

 The subarray [1, 2, 3, 4] has the maximum possible sum of 10. 
Explanation 2:

 The subarray [4,-1,2,1] has the maximum possible sum of 6. 
 */
public class MaxSubArray {
	
	public static void main(String[] args) {
		int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
		System.err.println(maxSubArray(nums));
	}

	public static int maxSubArray(final int[] nums) {
		int max = nums[0];
		int sum = 0;
		int highestSum = nums[0];

		for (int i = 0; i < nums.length; i++) {

			// record max
			if (max < nums[i])
				max = nums[i];

			if (sum + nums[i] < 1) {
				sum = 0;
			} else {
				sum += nums[i];

				if (highestSum < sum)
					highestSum = sum;
			}
		}

		if (max > highestSum)
			return max;
		else
			return highestSum;
	}

}
