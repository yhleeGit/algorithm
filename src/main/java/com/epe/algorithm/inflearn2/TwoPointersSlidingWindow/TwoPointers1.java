package com.epe.algorithm.inflearn2.TwoPointersSlidingWindow;

import java.util.ArrayList;
import java.util.List;

/**
 * 오름차순으로 정렬된 2개의 배열을 받는다. 
 * 이 2개의 배열을 오름차순으로 정렬 합친다.
 * 실무라면...합치고 정렬 하는게 답
 */

public class TwoPointers1 {

	
	public static void main(String[] args) {
		TwoPointers1 aab = new TwoPointers1();
		int[] a = {1,3,5};
		int[] b = {2,3,6,7,9};
		List<Integer> solve = aab.solve(a,b);
		for (Integer integer : solve) {
			System.out.println(integer);
		}
		
	}
	
	public List<Integer> solve(int[] a, int[] b) {
		List<Integer> aa = new ArrayList<Integer>(); 
		int p1=0, p2=0;
		
		while(p1 < a.length && p2 < b.length) {
			if(a[p1] < b[p2]) {
				aa.add(a[p1++]);
			}else {
				aa.add(b[p2++]);
			}
		}
		while(p1 < a.length) {
			aa.add(a[p1++]);
		}
		while(p2 < b.length) {
			aa.add(b[p2++]);
		}
		
		return aa;
	}
	
	public void print() {
	}
}
