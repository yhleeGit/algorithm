package com.epe.algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class AlgorithmApplication_1110 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		Integer value = Integer.valueOf(bf.readLine());
		int check = value;
		int n=0;
		while(true) {
			n++;
			int a = check/10;
			int b = check%10;
			
			check = (b*10) + (a+b)%10;
			
			
			if(value == check) break;
			
		}
		System.out.println(n);
	}

}
