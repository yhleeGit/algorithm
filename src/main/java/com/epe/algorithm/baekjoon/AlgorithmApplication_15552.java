package com.epe.algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class AlgorithmApplication_15552 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		List<Integer> sumList = new ArrayList<>();
		
		Integer value = Integer.valueOf(bf.readLine());
		for(int i = 0; i < value; i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			String a = st.nextToken();
			String b = st.nextToken();
			sumList.add(Integer.valueOf(a)+ Integer.valueOf(b));
		}
		
		for (Integer integer : sumList) {
			bw.write(String.valueOf(integer));
			bw.newLine();
		}
		
		bw.flush();
		bw.close();
		
	}

}
