package com.epe.algorithm.yhlee.example.check1;

/**
 * 
 * 
 */

public class Solution2 {

	
	public static void main(String[] args) {
		Solution2 aab = new Solution2();
		int n = 15;
		int solve = aab.solve(n);
		System.out.println(solve);
	}
	
	public int solve(int n) {
		int d[] = new int[n+1];
		
		for (int i = 1; i <= n; i++){
            d[i] = i;
            for (int j = 1; j*j <= i; j++){
            	
            	int check = i-j*j;
            	
            	d[i] = Math.min(d[i], d[check]+1);
            }
        }
		
//		for (int i : d) {
//			System.out.println(i);
//		}
		return d[n];
	}
	
	
	public void print() {
	}
}
