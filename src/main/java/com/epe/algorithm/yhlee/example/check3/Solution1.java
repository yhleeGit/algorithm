package com.epe.algorithm.yhlee.example.check3;

/**
 * 
 * 
 */

public class Solution1 {

	
	public static void main(String[] args) {
		Solution1 aab = new Solution1();
		String s = "ababa";
		int solve = aab.solve(s);
		System.out.println(solve);
		
	}
	
	public int solve(String s) {
		int cnt = 0;
		String[] split = s.split("");
		for (String aa : split) {
			if(aa.equals("a"))cnt++;
		}
		if(cnt%3 != 0) return 0;
		if(cnt==0) return s.length()+1;
		
		int aa = cnt/3;
		
		int eqPoint = 0;
		int point = 0;
		int[] arr = new int[3];
		for (String ss : split) {
			if(ss.equals("a")) {
				if(++eqPoint % aa == 0) point++;
				continue;
			} 
			arr[point] = arr[point]+1;
		}
		int b1 = arr[1]+1;
		int b2 = arr[2]+1;
		return b1*b2;
	}
	
	public void print() {
	}
}
