package com.epe.algorithm.yhlee.example.check2;

/**
 * 
 * 
 */

public class Solution2 {

	
	public static void main(String[] args) {
		Solution2 aab = new Solution2();
		int[] A = {2,-2,3,0,4,-7};
		int cnt = 0;
		int sum = 0;
		for(int i =0; i<A.length; i++) {
			if(A[i]==0) cnt++;
			sum=A[i];
			for(int j=i+1; j<A.length; j++) {
				sum = sum + A[j];
				if(sum==0) cnt++;
			}
		}
		System.out.println(cnt);
		if(cnt >= 1000000000)
		aab.solve();
		
	}
	
	public String solve() {
		
		return null;
	}
	
	public void print() {
	}
}
