package com.epe.algorithm.inflearn.StringArray;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * [2,8,11,14] 이라는 배열이 주어지고 target number(16)가 주어진다
 * 전달 받은 배열중 2개의 숫자를 더해서 target number를 만들면 된다.
 * target number가 만들어진 숫자 2개에 각각 배열 index번호를 return 한다. 
 */

public class TwoSum {

	
	public static void main(String[] args) {
		
		TwoSum ts = new TwoSum();
		int[] arr = new int[] {1, 8, 11, 14, 5};
		int target = 16;
		
		int[] solve = ts.solve(arr, target);
		
		if(solve == null) {
			System.out.println("error");
		}else {
			ts.print(solve);
		}
	}
	
	public int[] solve(int[] arr, int target) {

		Map<Integer, Integer> maps = new HashMap<>();
		
		int index = 0;
		for (int i : arr) {
			maps.put(i, index++);
		}
		
		
		Iterator<Integer> it = maps.keySet().iterator();
		while(it.hasNext()) {
			
			Integer key = it.next();
			
			if(target-key != key && maps.containsKey(target-key) ) {
				Integer index1 = maps.get(key);
				Integer index2 = maps.get(target-key);
				
				return new int[] {index1, index2};
			}
		}
		
		return null;
	}
	
	public void print(int[] arr) {
		for (int i : arr) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
}
