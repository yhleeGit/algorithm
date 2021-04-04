package com.epe.algorithm.inflearn.GraphDfsBfs;

/**
 * {1,1,0,1,1}
 * {0,1,1,0,0}
 * {0,0,0,0,0}
 * {1,1,0,1,1}
 * {1,0,1,1,1}
 * {1,0,1,1,1}
 * NumberOfIsland 참고 하여 육지를 구하고 육지중 가장 큰 육지를 구해라
 */

public class MaxOfIsland {

	public static void main(String[] args) {
		char[][] grid = {
				{'1','1','0','1','1'},
				{'0','1','1','0','0'},
				{'0','0','0','0','0'},
				{'1','1','0','1','1'},
				{'1','0','1','1','1'},
				{'1','0','1','1','1'}
			};
		
		MaxOfIsland aab = new MaxOfIsland();
		int solve = aab.solve(grid);
		System.out.println(solve);
		
	}
	
	int[][] dirs = {{-1,0},{1,0},{0,-1},{0,1}};
	
	public int solve(char[][] grid) {
		if(grid == null | grid.length==0) return 0;
		int max = 0;
		
		for(int i=0;i<grid.length;i++) {
			for(int j=0;j<grid[i].length;j++) {
				if(grid[i][j] == '1') {
					max = Math.max(max, dfs(grid, i, j));
				}
			}
		}
		
		return max;
	}

	public int dfs(char[][] grid, int i, int j) {
		
		if(i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] != '1') return 0;
		
		grid[i][j] = 'X';
		
		int a = dfs(grid, i-1, j);
		int b = dfs(grid, i+1, j);
		int c = dfs(grid, i, j+1);
		int d = dfs(grid, i, j-1);
		
		return a+b+c+d+1;
	}
	
	public void print(char[][] grid) {
		
		for(int i=0;i<grid.length;i++) {
			for(int j=0;j<grid[i].length;j++) {
				System.out.print(grid[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}
