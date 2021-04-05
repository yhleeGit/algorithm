package com.epe.algorithm.programmers.t1;

/**
 * 
 * 
 */

public class Solution1 {

	
	public static void main(String[] args) {
		Solution1 aab = new Solution1();
		int k = 2;
		int[][] grid = {
				{1,0,0,0},
				{0,0,0,1},
				{0,0,1,0},
				{0,1,1,0}
			};
		int solve = aab.solve(grid, k);
		System.out.println(solve);
		
	}
	
	public int solve(int[][] grid, int k) {
		
		int row = grid.length;
		int column = grid[0].length;
		
		int max = 0;
		for(int i=0; i<row; i++) {
			for(int j=0; j<column; j++) {
				if(!(i > grid.length-k || j > grid[0].length -k )) {
					max = Math.max(max, dfs(grid, i, j, k, true));
				}
			}
		}
		return max;
	}
	
	public int dfs(int[][] grid, int i, int j, int k, boolean firstCheck) {
		
		if(!firstCheck) {
			if(grid[i][j] == 1) {
				return 1;
			}else {
				return 0;
			}
		}
		
		if(i < 0 || i >= grid.length || j < 0 || j >= grid[0].length ) {
			return 0 ;
		}
		
		int cnt = 0;
		
		int aa = k+i;
		int bb = k+j;
		
		for(int a = i; a<aa; a++) {
			for(int b = j; b<bb; b++) {
				cnt += dfs(grid, a, b, k, false);
			}
		}
		
		return cnt;
	}
	
	public void print() {
	}
}
