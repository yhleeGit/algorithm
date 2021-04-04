package com.epe.algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class AlgorithmApplication_1152 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		String readLine = bf.readLine();
		String[] split = readLine.split(" ");
		int length = split.length;
		if(length > 0 && split[0].equals("")) {
			length--;	
		}
		System.out.println(length);
		
	}

}
