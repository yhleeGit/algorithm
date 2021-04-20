package com.epe.algorithm.inflearn2.Array;

import java.util.ArrayList;
import java.util.List;

/**
 * 멘토 멘티를 구하는 문제이다. 전달 받는 데이터는 수학 시험에 대한 결과 이다. {3,4,1,2} 는 3번 학생이 1등, 4번학생이 2등..2번 학생이 4등인 결과이다.
 * 멘토는 모든 시험에서 멘티보다 등수가 높아야 한다.
 * 시험은 m번 치뤄진다. 모든 시험이 종료된 이후 멘토&멘티를 할 수 있는 경우를 모두 구하라.
 */

public class Array8 {

	public static void main(String[] args) {
		Array8 aab = new Array8();
		int[][] grid = {
				{3,4,1,2},
				{4,3,2,1},
				{3,1,4,2}
			};
		int solve = aab.solve(grid);
		System.out.println(solve);
	}

	public int solve(int[][] arr) {
		List<Integer> answer = new ArrayList<>(); 
		for(int i=0; i<arr.length; i++) {
			List<Integer> answer2 = new ArrayList<>();
			for(int j=0; j<arr[i].length; j++) {
				for(int k=j+1; k<arr[i].length; k++) {
					answer2.add(arr[i][j]*10+arr[i][k]);
				}
			}
			
			if(answer.isEmpty()) {
				answer = answer2;
			} else {
				List<Integer> tmp = new ArrayList<>();
				for (Integer integer : answer2) {
					if(answer.contains(integer)) {
						tmp.add(integer);
					}
				}
				answer = tmp;
			}
		}
		return answer.size();
	}
	
	public void print() {
	}
}
