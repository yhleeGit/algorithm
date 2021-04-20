package com.epe.algorithm.yhlee.example.check3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 
 * 
 */

public class Solution2 {

	
	public static void main(String[] args) {
		Solution2 aab = new Solution2();
		String s = "TacoCat";
		int solve = aab.solve(s);
		System.out.println(solve);
	}
	
	
	public int solve(String S) {
		char[] arr = S.toCharArray();
		int min = 400;
		for(int i=0; i<arr.length; i++) {
			Set<Integer> aa = new HashSet<>();
			List<Integer> bb = new ArrayList<>(); 
			for(int j=i; j<arr.length; j++) {
				int b = (int)arr[j];
				aa.add(b);
				bb.add(b);
				
				boolean check = true;
				for(int k=0; k<bb.size(); k++) {
					Integer it = bb.get(k);
					int search = (97 <= it && it <= 122) ? it-32 : it+32;
					if(!aa.contains(search)) {
						check = false;
						break;
					} 
				}
				if(check) {
					min = Math.min(bb.size(), min);
					break;
				}
			}
		}
		if(min == 400) min = -1;
		return min;
	}
	
	public void print() {
	}
}
