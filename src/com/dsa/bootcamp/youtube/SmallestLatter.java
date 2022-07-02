package com.dsa.bootcamp.youtube;

/*
 * find smallest latter greater than target
 * exa :
 * input  :("c","f","j") => target = "a"
 * output : "c"
 * input :  e , f , j => target = d
 * output  : f
 * input :  e, f, j => t= g
 * output : j
 * input : c,f,j => t = j
 * output : c
 * 
 * ==============================
 * input c, f, j => target =c
 * output = f
 * 
 * here  f and j is large than c
 * but f is smaller
 * 
 * same as ceiling of no
 */
public class SmallestLatter {
	public static void main(String[] args) {

			char[] ch = {'c','f','j'};
			int ans = nextGreatestLatter(ch, 'c');
			System.err.println(ans); //102 
		
	}
	public static char nextGreatestLatter(char[] latter ,char target) {
		int start =0;
		int end = latter.length-1;
		while(start <= end) {
			int mid = start + (end - start) / 2 ;
			if(target < latter[mid]) {
				end = mid -1;
			}else {
				start = mid +1;
			}
		}
		return latter[start % latter.length];
	}
}
