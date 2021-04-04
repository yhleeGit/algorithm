package com.epe.algorithm.inflearn.StringArray;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Meeting이라는 객체에 미팅 시작시간과 종료 시간이 명시된다.
 * Meeting 객체를 배열로 전달 받았을때 시간이 겹치지 않아 미팅룸이 한개로 충분하면 true 아니면 false 리턴
 */
class Meeting{
	int start;
	int end;
	
	Meeting(int s, int e){
		this.start = s;
		this.end = e;
	}
}

public class MeetingRoom {

	public static void main(String[] args) {
		MeetingRoom a = new MeetingRoom();
		
		Meeting m1 = new Meeting(15, 20);
		Meeting m2 = new Meeting(5, 10);
		Meeting m3 = new Meeting(0, 30);

		Meeting[] meetings = new Meeting[]{m1, m2, m3};
		
		System.out.println(a.solve(meetings));
	}
	
	public boolean solve(Meeting[] meetings) {
		if(meetings == null) return false;
		
		//1. start 기준으로 오름 차순 정렬을 해준다.
		Arrays.sort(meetings, new Comparator<Meeting>() {
			@Override
			public int compare(Meeting a1, Meeting a2) {
				return a1.start - a2.start;
			}
		});

		//2. 첫번째 기준 종료 시간이 다음 회의 시작 시간보다 크다면 return 처리를 해준다.
		for(int i = 1; i < meetings.length; i++) {
			if(meetings[i-1].end > meetings[i].start) {
				return false;
			} 
		}
		
		return true;
	}

	
			
	public void print(Meeting[] meetings) {
		for(int i = 0; i < meetings.length; i++) {
			System.out.println(meetings[i].start+"_"+meetings[i].end);
		}
	}
}
