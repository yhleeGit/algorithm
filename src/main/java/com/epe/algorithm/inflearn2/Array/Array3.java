package com.epe.algorithm.inflearn2.Array;

/**
 * ox 문제가 주어진다. 문제를 맞추면 1점 틀리면 0점이다. 연속적으로 문제를 맞추면 가산점이 +1점 부여된다. 3연속이면 +3점이다.
 * 배열로 문제의 결과를 전달 받는다 이때 총 점수를 구하여라
 * 
 */

public class Array3 {

	public static void main(String[] args) {
		Array3 aab = new Array3();
		int[] n = {1, 0, 1, 1, 1, 0, 0, 1, 1, 0};
		int solve = aab.solve(n);
		System.out.println(solve);
	}

	public int solve(int[] n) {
		int totalScore = 0;
		int score = 0;
		for(int a : n) {
			if(a==1) {
				totalScore += (++score);
			}else {
				score = 0;
			}
		}
		return totalScore;
	}
	
	public void print() {
	}
}
