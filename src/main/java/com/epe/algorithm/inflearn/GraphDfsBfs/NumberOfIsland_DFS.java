package com.epe.algorithm.inflearn.GraphDfsBfs;

/**
 * {1,1,1,0,1}
 * {1,1,0,0,0}
 * {1,1,0,0,1}
 * {0,0,0,0,1}
 * 이라는 2차원 배열이 들어왔을때 1은 육지 0은 바다이다. 이때 육지는 총 몇개인지 구하라
 * */

public class NumberOfIsland_DFS {

	public static void main(String[] args) {
		
		char[][] grid = {
					{'1','1','1','0','1'},
					{'1','1','0','0','0'},
					{'1','1','0','0','1'},
					{'0','0','0','0','1'}
				};
		NumberOfIsland_DFS noi = new NumberOfIsland_DFS();
		System.out.println(noi.solve(grid));
		noi.print2(grid);
	}
	
	public int solve(char[][] grid) {
		int cnt = 0;
		for(int i=0;i<grid.length;i++) {
			for(int j=0;j<grid[i].length;j++) {
				if(grid[i][j] == '1') {
					cnt++;
					dfs(grid, i, j);
				}
			}
		}
		return cnt;
	}
	
	public void dfs(char[][] grid, int i, int j) {
		if(i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] != '1') return;
		
		grid[i][j] = 'X';
		
		dfs(grid, i-1, j);
		dfs(grid, i+1, j);
		dfs(grid, i, j+1);
		dfs(grid, i, j-1);
	}
	
	
	public void print(char[][] grid) {
		
		for(int i=0;i<grid.length;i++) {
			for(int j=0;j<grid[i].length;j++) {
				System.out.print("grid["+i+"]["+j+"] -> "+grid[i][j]+" ");
			}
			System.out.println();
		}
		
	}
	
	public void print2(char[][] grid) {
		
		for(int i=0;i<grid.length;i++) {
			for(int j=0;j<grid[i].length;j++) {
				System.out.print(grid[i][j]+" ");
			}
			System.out.println();
		}
		
	}
	
}
