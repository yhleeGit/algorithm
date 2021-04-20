package com.epe.algorithm.yhlee.example.check4;

/**
 * 
 * 
 */

public class Solution2 {

	
	public static void main(String[] args) {
		Solution2 aab = new Solution2();
		String a = "aa";
		int solve = aab.solve(a);
		System.out.println(solve);
		
	}
	
	public int solve(String s) {
//		if(s.length()==1)return 1;
		for(int i=1; i<=s.length()/2; i++) {
			if(s.length()%i ==0) {
				String checkString = new String();
				boolean check = true;
				for(int j=0; j<s.length(); j+=i) {
					if(j==0) {
						checkString = s.substring(0, i);
						continue;
					} 
					if(!checkString.equals(s.substring(j, j+i))) {
						check = false;
						break;
					}
				}
				if(check == true) {
					return i;
				}
			}
			
			
		}
		return s.length();
	}
	
	public void print() {
	}
}
