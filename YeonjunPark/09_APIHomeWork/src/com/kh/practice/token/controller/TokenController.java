package com.kh.practice.token.controller;

import java.util.StringTokenizer;

public class TokenController {
	
	public TokenController() {}
	
	public String afterToken(String str) {
		StringTokenizer st = new StringTokenizer(str," ");
		String a = "";
		while(st.hasMoreTokens()) {
			a+=st.nextToken();
		}
		
		return a;
	}
	
	public String firstCap(String input) {
		
		return input.substring(0,1).toUpperCase() + input.substring(1);
	}
	
	public int findChar(String input, char one) {
		int cnt=0;
		for(int i = 0; i<input.length(); i++) {
			if(input.charAt(i) == one) {
				cnt++;
			}
		}
		return cnt;
	}
}
