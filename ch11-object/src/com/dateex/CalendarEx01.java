package com.dateex;

import java.util.Calendar;

/*
Calendar 클래스
달력이나 시계작성할때 주로 사용

*/
public class CalendarEx01 {

	public static void main(String[] args) {
		
		Calendar today = Calendar.getInstance();
		System.out.println(today);
		
		int year = today.get(Calendar.YEAR);
		int month = today.get(Calendar.MONTH);
		int date = today.get(Calendar.DATE);
		month += 1;
		
		System.out.println("오늘" + year + "년" + month + "월" + date + "일");
		
		//1~7까지의 값
		int day = today.get(Calendar.DAY_OF_WEEK);	//요일
		
		String nday = "";
		switch(day){
		case 1:
			nday = "일"; break;
		case 2:
			nday = "월"; break;
		case 3:
			nday = "화"; break;
		case 4:
			nday = "수"; break;
		case 5:
			nday = "목"; break;
		case 6:
			nday = "금"; break;
		case 7:
			nday = "토"; break;
		}
		
		System.out.println("오늘은 " + nday + "요일");
		
		//AM: 0		PM: 1
		int amPm = today.get(Calendar.AM_PM);
		String msg_amPm = amPm == 0 ? "오전" : "오후";
		System.out.println(msg_amPm);
		
		int hour = today.get(Calendar.HOUR); 
		int min = today.get(Calendar.MINUTE);
		int sec = today.get(Calendar.SECOND);
		
		System.out.println(hour + "시 " + min + "분 " + sec + "분");

	}

}
