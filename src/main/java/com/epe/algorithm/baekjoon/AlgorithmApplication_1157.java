package com.epe.algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class AlgorithmApplication_1157 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String[] split = bf.readLine().split("");
		Map<String, Integer> map = new HashMap<>();
		int temp = 0;
		String result = "?";
		
		for (String word : split) {
			String data = word.toUpperCase();
			Integer cnt = map.get(data) == null? 1 : map.get(data)+1;
			map.put(data, cnt);
			
			if(temp == cnt) {
				result = "?";
			}
			if(temp < cnt) {
				temp = cnt;
				result = data;
			}
		}
		System.out.println(result);
	}

}
