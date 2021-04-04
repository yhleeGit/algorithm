package com.epe.algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class AlgorithmApplication_1712 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
		
		Integer a = Integer.valueOf(st.nextToken());
		Integer b = Integer.valueOf(st.nextToken());
		Integer c = Integer.valueOf(st.nextToken());
		
		Integer result =-1;
		if(c-b > 0) {
			result = a==0? 0 : a/(c-b);
			result++;
		}
		System.out.println(result);
	}

}
