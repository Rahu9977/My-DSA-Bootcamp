package com.dsa.bootcamp.myrecursive;

public class Peramatution {

	public static void permatution(String str,String ans) {
		
		if(str ==null) {
			return;
		}
		if(str.length() == 0) {
			System.err.print(ans + " ");
		}
		
		for(int i =0;i<str.length();i++) {
			
			char currChar =str.charAt(i);
			
			String newStr = str.substring(0, i) + str.substring(i+1);
	
			
			permatution(newStr,ans + currChar);
			
		}
		
		
	}
	public static void main(String[] args) {
		permatution("abc","");

	}

}
