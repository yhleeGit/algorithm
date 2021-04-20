package com.epe.algorithm.inflearn2.TwoPointersSlidingWindow;

/**
 * 숫자 N을 전달 받는다. N을 2개 이상의 자연수의 합으로 정수 N을 표현할 수 있는 가짓수를 구하라 
 * ex. N=15 -> 7+8 = 15, 4+5+6 = 15, 1+2+3+4+5 = 15 이렇게 3가지 이다. 
 */

public class TwoPointers4 {

	
	public static void main(String[] args) {
		TwoPointers4 aab = new TwoPointers4();
		int solve = aab.solve(15);
		System.out.println(solve);
	}
	
	public int solve(int n) {
		int result= 0;
		int lt = 1;
		int sum = 0;
		for(int rt=1; rt <= (n/2)+1; rt++) {
			sum += rt;
			if(sum == n) result++;
			while(sum >= n) {
				sum -= (lt++);
				if(sum == n) result++;
			}
		}
		return result;
	}
	
	public void print() {
	}
}
