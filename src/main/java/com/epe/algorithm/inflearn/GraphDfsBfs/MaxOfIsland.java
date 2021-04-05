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
					int area = dfs(grid, i, j, 0);
					max = Math.max(max, area);
				}
			}
		}
		
		return max;
	}

	public int dfs(char[][] grid, int i, int j, int area) {
		
		//1. 범위를 벗어나거나 육지가 아닌 경우
		if(i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] != '1') 
			return area;
		
		//2. 1인 육지가 들어오는 경우
		grid[i][j] = 'X';
		area++;
		
		for(int[] dir : dirs) {
			area = dfs(grid, i+dir[0], j+dir[1], area);
		}
		
		return area;
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
