package com.epe.algorithm.inflearn2.Array;

/**
 * 5*5의 격자판 값을 전달 받는다. 
 * 이때 각 행의 합 또는 각 열의 합 또는 대각선의 합중 가장 큰 값을 리턴 하라.
 * 
 */

public class Array5 {

	public static void main(String[] args) {
		Array5 aab = new Array5();
		int[][] grid = {
				{10,13,10,12,15},
				{12,39,30,23,11},
				{11,25,50,53,15},
				{19,27,29,37,27},
				{19,13,30,13,19}
			};
		int solve = aab.solve(grid);
		System.out.println(solve);
	}

	public int solve(int[][] n) {
		int length = n[0].length;
		int length2 = n.length;
		int sum = 0;
		for(int i=0; i<length; i++) {
			int totalRow = 0;
			int totalColumn = 0;
			for(int j=0; j<length2; j++) {
				totalRow += n[i][j];
				totalColumn += n[j][i];
			}
			sum = Math.max(sum, totalRow);
			sum = Math.max(sum, totalColumn);
		}
		int sum1 = 0;
		int sum2 = 0;
		for(int i=0; i<length; i++) {
			sum1 += n[i][i];
			sum2 += n[i][length-i-1];
		}
		sum = Math.max(sum, sum1);
		sum = Math.max(sum, sum2);
		return sum;
	}
	
	public void print() {
	}
}
