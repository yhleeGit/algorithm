package com.epe.algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class AlgorithmApplication_10951 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		

		while(true) {
			try {
				StringTokenizer st = new StringTokenizer(bf.readLine());
				String a = st.nextToken();
				String b = st.nextToken();
				bw.write(String.valueOf(Integer.valueOf(a)+ Integer.valueOf(b)));
				bw.newLine();
			}catch (Exception e) {
				break;
			}
		}
		
		bw.flush();
		bw.close();
		
	}

}
