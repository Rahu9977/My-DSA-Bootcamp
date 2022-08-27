package com.dsa.bootcamp.leetcode.array;

/*
 * Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

Example:

Input: [-2,1,-3,4,-1,2,1,-5,4],
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.
 * */
//https://leetcode.com/problems/maximum-subarray/
//https://leetcode.com/problems/maximum-subarray/discuss/1595097/JAVA-or-Kadane's-Algorithm-or-Explanation-Using-Image
public class MaximumSubarray {
	public static void main(String[] args) {
		int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		System.err.println(maxSubArray(nums));
	}
	// *********Brute Force Solution **************

	public int maxSubArray1(int[] nums) {

		int max = Integer.MIN_VALUE;

		for (int i = 0; i < nums.length; i++) { // 1 2 3 4
			for (int j = i; j < nums.length; j++) {
				int sum = 0;
				for (int k = i; k <= j; k++) {
					sum = sum + nums[k];
				}
				max = Math.max(sum, max);
			}
		}
		return max;
	}
	// *********Optimize 1 Solution **************

	public int maxSubArray2(int[] nums) {

		int max = Integer.MIN_VALUE;
		for (int i = 0; i < nums.length; i++) {
			int sum = 0;
			for (int j = i; j < nums.length; j++) {
				sum = sum + nums[j];
				max = Math.max(sum, max);
			}
		}
		return max;
	}
//	*********Optimize 2 Solution **************

	public static int maxSubArray(int[] nums) { // Kadane's-Algorithm- TC : O(n) SC:O(1)

		int bestsum = Integer.MIN_VALUE;
		int currentsum = 0;

		for (int i = 0; i < nums.length; i++) {
			currentsum = Math.max(nums[i], currentsum + nums[i]);
			bestsum = Math.max(bestsum, currentsum);
		}
		return bestsum;
	}

	public int maxSubArray3(int[] nums) {// Kadane's-Algorithm-
		int n = nums.length;
		int max = Integer.MIN_VALUE, sum = 0;

		for (int i = 0; i < n; i++) {
			sum += nums[i];
			max = Math.max(sum, max);

			if (sum < 0)
				sum = 0;
		}

		return max;
	}
}
