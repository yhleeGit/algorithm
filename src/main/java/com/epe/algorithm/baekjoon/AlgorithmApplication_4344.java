package com.epe.algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class AlgorithmApplication_4344 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		Integer arr = Integer.valueOf(bf.readLine());
		
		for(int i = 0; i < arr; i++) {
			
			StringTokenizer st = new StringTokenizer(bf.readLine());
			Double check = Double.valueOf(st.nextToken());
			List<Double> dList = new ArrayList<>();
			
			Double sum = 0.0;
			for(int j =0; j < check; j++) {
				Double value = Double.valueOf(st.nextToken());
				sum += value;
				dList.add(value);
			}
			
			Double avg = sum/check;
			int data = 0;
			for (Double value : dList) {
				if(value > avg) data++; 
			}
			System.out.println(String.format("%.3f", Double.valueOf(data)/Double.valueOf(check)* 100)+"%");
			
		}
		
		
	}

}
