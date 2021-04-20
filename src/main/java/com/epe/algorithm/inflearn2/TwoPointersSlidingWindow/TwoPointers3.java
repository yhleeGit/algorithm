package com.epe.algorithm.inflearn2.TwoPointersSlidingWindow;

/**
 * 전달 받는 배열은 일 매출 값이다. 연속적인 날짜의 매출 값이 최대값인 경우를 구하라
 * 연속적인 날짜의 기준은 전달 받는다 n
 * 시간 복잡도를 주의 해서 코딩 하라
 */

public class TwoPointers3 {

	
	public static void main(String[] args) {
		TwoPointers3 aab = new TwoPointers3();
		Integer[] a = {12,15,11,20,25,10,20,19,13,15};
		
		int solve = aab.solve(a, 3);
		System.out.println(solve);
		
	}
	
	public int solve(Integer[] a, int n) {
		int result = 0;
		int sum = 0;
		for(int i=0; i<n; i++) {
			sum += a[i];
		}
		result = sum;
		for(int i=1; i<a.length-n; i++) {
			sum += (a[i+n-1]-a[i-1]);
			result = Math.max(result, sum);
		}
		return result;
	}
	
	public int solve2(Integer[] a, int n) {	//시간 복잡도가 엄청 크게 나온다....
		int result = 0;
		for(int i=0; i<a.length-n; i++) {
			int sum = 0;
			for(int j=0; j<n; j++) {
				sum += a[i+j];
			}
			result = Math.max(result, sum);
		}
		
		return result;
	}
	
	public void print() {
	}
}
