package com.epe.algorithm.inflearn2.Array;

/**
 * N개의 점수가 주어졌을때 각 점수가 몇등인지 구하라
 * 같은점수가 있을경우 등수는 같다. 즉 92, 86, 92 이렇게 있다면 92점은 1등 86점은 3등이다. 
 */

public class Array4 {

	public static void main(String[] args) {
		Array4 aab = new Array4();
		int[] n = {92, 86, 92, 100, 76};
		for (int i : aab.solve(n)) {
			System.out.println(i);
		}
	}

	public int[] solve(int[] n) {
		int[] aa = new int[n.length];
		for(int i=0; i<n.length; i++) {
			int cnt = 1;
			for(int j=0; j<n.length; j++) {
				if(n[j] > n[i]) cnt++;
			}
			aa[i] = cnt;
		}
		return aa;
	}
	
	public void print() {
	}
}
