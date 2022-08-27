package com.dsa.bootcamp.myrecursive;

import java.util.Arrays;

public class ReverseStr {

	public static void main(String[] args) {
		String str = "scaleracademy"; //ymedacarelacs //ymedacarelacs
		String s = rvereseStr(str);
		System.out.println("Reversed str is :: " + s);
	}
	static String rvereseStr(String s) {
		if(s.isEmpty()) {
			return s;
		}
		return rvereseStr(s.substring(1)) + s.charAt(0);
	}
}
