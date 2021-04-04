package com.epe.algorithm.programmers;

/**
 * 
 * 
 */

public class ProgrammersTest1 {

	public static void main(String[] args) {
		ProgrammersTest1 aab = new ProgrammersTest1();
		int[] numbers = {1,1,1,1,1};
		int target = 3;
		int solve = aab.solve(numbers, target);
		System.out.println(solve);
		
	}
	
	public int solve(int[] numbers, int target) {
		int cnt = 0;
		return dfs(numbers, target, cnt, 0);
	}
	
	public int dfs(int[] numbers, int target, int cnt, int result) {
		if(cnt == numbers.length) {
			return (result == target)? 1 : 0;
		}
		
		int plus = result + numbers[cnt];
		int minus = result - numbers[cnt];
		
		int dfs = dfs(numbers, target, cnt+1, plus);
		int dfs2 = dfs(numbers, target, cnt+1, minus);
		
		return dfs + dfs2;
	}
	
}
