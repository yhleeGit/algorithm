package com.epe.algorithm.baekjoon;

import java.util.Scanner;

public class AlgorithmApplication_2884 {

	public static void main(String[] args) throws Exception {
		
		Scanner sc = new Scanner(System.in);
		int hour = sc.nextInt();
		if(0 < hour && hour > 23) throw new Exception("error check");
		int min = sc.nextInt();
		if(0 < min && min > 59) throw new Exception("error check");
		
		min = min - 45;
		if(min < 0) {
			min = 60 + min;
			if(--hour < 0) hour = 23;
		}
		System.out.println(hour + " " +min);
	}

}
