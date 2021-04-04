package com.epe.algorithm.inflearn.GraphDfsBfs;

/**
 * {1,1,1,0,1}
 * {1,1,0,0,0}
 * {1,1,0,0,1}
 * {0,0,0,0,1}
 * 이라는 2차원 배열이 들어왔을때 1은 육지 0은 바다이다. 이때 육지는 총 몇개인지 구하라
 * 
 * BFS는 다시 확인 할 필요가 있음
 * */

public class NumberOfIsland_BFS {

	public static void main(String[] args) {
		
		char[][] grid = {
					{'1','1','1','0','1'},
					{'1','0','1','0','0'},
					{'1','1','0','0','1'},
					{'0','0','0','0','1'}
				};
		NumberOfIsland_BFS noi = new NumberOfIsland_BFS();
		System.out.println(noi.solve(grid));
		noi.print(grid);
	}
	
	public int solve(char[][] grid) {
		int cnt = 0;
		return cnt;
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
