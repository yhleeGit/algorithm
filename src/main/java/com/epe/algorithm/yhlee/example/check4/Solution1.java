package com.epe.algorithm.yhlee.example.check4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 
 * 
 */

public class Solution1 {

	
	public static void main(String[] args) {
		Solution1 aab = new Solution1();
		String[] a = {"alex pizza pasta steak", "bob noodle sandwich pasta", "choi pizza sandwich pizza", "alex pizza pasta steak"};
		aab.solve(a);
		
	}
	
	public String[] solve(String[] orders) {
		Map<String, Set<String>> orderMap = new HashMap<>();
		for (String data : orders) {
			String[] split = data.split(" ");
			if(orderMap.containsKey(split[0])) {
				Set<String> foodSet = orderMap.get(split[0]);
				for(int i=1; i<split.length; i++) {
					foodSet.add(split[i]);
				}
				orderMap.put(split[0], foodSet);
			} else {
				Set<String> foodSet = new HashSet<>();
				for(int i=1; i<split.length; i++) {
					foodSet.add(split[i]);
				}
				orderMap.put(split[0], foodSet);
			}
		}
		Integer min = Integer.MIN_VALUE;
		List<String> checkList = new ArrayList<>();
		for (String string : orderMap.keySet()) {
			int setSize = orderMap.get(string).size();
			if(min == setSize) {
				checkList.add(string);
			}
			if(min < setSize) {
				min = orderMap.get(string).size();
				checkList = new ArrayList<>();
				checkList.add(string);
			}
		}
		
		String[] array = checkList.toArray(new String[]{});
		Arrays.sort(array);
		return array;
	}
	
	public void print() {
	}
}
