package com.epe.algorithm.inflearn2.Array;

/**
 * 같은 반 학생 한명당 각각 1~5학년 까지의 반 정보를 전달 받는다.
 * 학생은 N명이다. 이때 같은반을 가장 많이 한  학생을 구하라
 * 즉 1번 학생은 2,3,1,7,3 값을 받으면 순서대로 1학년 2반 2학년 3반 ...이다.
 * 데이터는 2차 배열로 받는다.
 * 3번 학생과 4번 학생은 2학년 3학년 모두 같은 반이었다.
 */

public class Array7 {

	public static void main(String[] args) {
		Array7 aab = new Array7();
		int[][] grid = {
/** 1번 학생*/	{2,3,1,7,3},
/** 2번 학생*/	{4,1,9,6,8},
/** 3번 학생*/	{5,5,2,4,4},
/** 4번 학생*/	{6,5,2,6,7},
/** 5번 학생*/	{8,4,2,2,2}
			};
		int solve = aab.solve(5, grid);
		System.out.println(solve);
	}

	public int solve(int n, int[][] arr) {
		int max = Integer.MIN_VALUE;
		int answer = 0;
		for(int i=0; i<n; i++) {
			int cnt = 0;
			for(int j=0; j<n; j++) {
				for(int k=0; k<5; k++) {	//5학년 까지 고정 반복
					//i번째 학생과 j번째 학생과 같은반 이력이 있는지 탐색
					if(arr[i][k] == arr[j][k]) {
						cnt++;
						break;
					} 
				}
			}
			if(cnt > max) {
				max = cnt;
				answer = i;
			}
		}		
		
		return answer+1;
	}
	
	public void print() {
	}
}
