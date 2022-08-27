package com.dsa.bootcamp.leetcode.array;

//https://leetcode.com/problems/trapping-rain-water/
public class TrappingRainWater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]  height = {4,2,0,3,2,5};
		
		System.err.println(trap(height));

	}
//Brute Force

public int trap_BruteForce(int[] height) {
        
        int n = height.length;
        int[] leftMax = new int[n];
        int[] rightMax = new int[n];
        int max = 0;
        int totalwater = 0;
        
        
        for(int i=0;i<n;i++){
            max = Math.max(max,height[i]);
            leftMax[i] = max;
        }
        
        max = 0;
        
        for(int i=n-1;i>=0;i--){
            max = Math.max(max,height[i]);
            rightMax[i] = max;
        }
        
        for(int i=n-1;i>=0;i--){
            int water = Math.min(leftMax[i],rightMax[i])-height[i];
            totalwater += water;
        }
        return totalwater;  
    }
    
   // ---------**************   Optimal Code   **************--------------
    
     public static int trap(int[] height) {  //tc O(n) ,sc O(1)
        
        int n = height.length;
        int totalwater = 0;
        int max = 0;
        int maxIndex = 0;
        
        for(int i=0;i<n;i++){
           if(height[i]>max){
               max = height[i]; //rmax
               maxIndex = i;
           }
        }
        
        int leftMax = 0;
        //part1
        for(int i=0;i<maxIndex;i++){
           leftMax = Math.max(leftMax,height[i]);
           int water = Math.min(leftMax,max)-height[i];
           totalwater += water;
        }
        
        leftMax = 0;
        //part2
         for(int i=n-1;i>maxIndex;i--){
           leftMax = Math.max(leftMax,height[i]);
           int water = Math.min(leftMax,max)-height[i];
           totalwater += water;
        }
        
        
        return totalwater;
    }
}
