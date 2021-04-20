package com.epe.algorithm.inflearn2.Array;

/**
 * 소수 구하기
 * 주어진 수 안에 있는 소수 구하기
 * 에라토스테네스의 체 
 */

public class Array1 {

	public static void main(String[] args) {
		Array1 aab = new Array1();
		int n = 20;
		int solve = aab.solve(n);
		System.out.println(solve);
	}
	
	public int solve(int n) {
		int answer = 0;
		int[] ch = new int[n+1];	//20까지 인덱스를 가지려고 n+1 만큼 선언한다.
		
		for(int i=2; i<=n; i++) {
			
			if(ch[i]==0) {	// 0인 경우 소수라고 본다.
				answer++;
				for(int j=i; j<=n; j=j+i) {	//해당 소수가 포함된 수 들의 표시값을 변경한다. 즉 3이 소수이면 3의 배수 들은 모두 표시값 변경
					ch[j] = 1;
				}
			}
			
		}
		
		
		return answer;
	}
	
	public void print() {
	}
}
