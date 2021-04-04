package com.epe.algorithm.inflearn.StringArray;

/**
 * Meeting이라는 객체에 미팅 시작시간과 종료 시간이 명시된다.
 * Meeting 객체를 배열로 전달 받았을때 시간이 겹치지 않아 미팅룸이 한개로 충분하면 true 아니면 false 리턴
 * -> MeetingRoom2는 미팅룸이 필요한 총 개수를 리턴한다. [0,30], [5,10], [15,20]은 미팅룸 2개가 필요
 * */


/**
 * 다시 작업해야함
 * */
public class MeetingRoom2 {

	public static void main(String[] args) {
		MeetingRoom2 a = new MeetingRoom2();
		
		Meeting m1 = new Meeting(10, 16);
		Meeting m2 = new Meeting(5, 15);
		Meeting m3 = new Meeting(0, 30);
		Meeting m4 = new Meeting(4, 9);
		Meeting m5 = new Meeting(0, 30);

		Meeting[] meetings = new Meeting[]{m1, m2, m3, m4, m5};
		
		System.out.println(a.solve(meetings));
	}
	
	public int solve(Meeting[] meetings) {
		return 0;
	}

	
			
	public void print(Meeting[] meetings) {
		for(int i = 0; i < meetings.length; i++) {
			System.out.print (meetings[i].start+"_"+meetings[i].end);
		}
		System.out.println();
	}
}
