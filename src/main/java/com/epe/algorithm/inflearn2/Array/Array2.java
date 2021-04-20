package com.epe.algorithm.inflearn2.Array;

import java.util.ArrayList;
import java.util.List;

/**
 * 소수 구하기
 * 주어진 배열의 수를 뒤집고(ex. 123이 뒤집으면 321이 된다.) 소수 인지 판별
 *  
 */

public class Array2 {

	public static void main(String[] args) {
		Array2 aab = new Array2();
		int[] n = {14, 56,342, 211, 96754, 11};
		for (int i : aab.solve(n)) {
			System.out.println(i);
		}
	}

	public boolean isPrime(int num) {	//소수 인지 확인 하는 함수
		if(num==1) return false;
		for(int i=2; i<num; i++) {	//자신을 제외한 다른 수 중 나누어 떨어지는 수가 있는지 확인
			if(num%i==0) return false;
		}
		return true;
	}
	
	public List<Integer> solve(int[] n) {
		List<Integer> aa = new ArrayList<>();
		for (int a : n) {
			int tmp = a;
			int res = 0;
			while(tmp > 0) {
				int t = tmp%10;
				res = res*10+t;
				tmp = tmp/10;
			}
			if(isPrime(res)) aa.add(res);
		}
		return aa;
	}
	
	public void print() {
	}
}
