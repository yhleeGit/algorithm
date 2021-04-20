package com.epe.algorithm.inflearn2.TwoPointersSlidingWindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 2개의 배열이 주어진다. 중복값은 없다.
 * 이 2개의 배열중 교집합 원소를 추출 하고 오름차순으로 정렬하여라
 */

public class TwoPointers2 {

	
	public static void main(String[] args) {
		TwoPointers2 aab = new TwoPointers2();
		Integer[] a = {1,3,9,5,2};
		Integer[] b = {3,2,5,7,8};
		List<Integer> solve = aab.solve(a,b);
		for (Integer integer : solve) {
			System.out.println(integer);
		}
		
	}
	
	public List<Integer> solve(Integer[] a, Integer[] b) {
		List<Integer> aa = new ArrayList<Integer>(); 
		int p1=0, p2=0;
		Arrays.sort(a);
		Arrays.sort(b);
		
		while(p1 < a.length && p2 < b.length) {
			if(a[p1] == b[p2]) {
				aa.add(a[p1]);
				p1++;
				p2++;
			} else if(a[p1] < b[p2]) {
				p1++;
			} else {
				p2++;
			}
		}
		return aa;
	}
	
	public void print() {
	}
}
