package com.dateex;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarEx02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Calendar calendar = Calendar.getInstance();
		
		System.out.println("희망 연도와 월을 입력하세요. (ex 연도: 2016, 월: 12, 일: 30");
		
		System.out.println("연도 > ");
		int year = scan.nextInt();
		
		System.out.println("월 > ");
		int month = scan.nextInt();
		
		System.out.println("[" + year + "년 " + month + "월 " + "]");
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		
		calendar.set(year, month - 1, 1);
		
		int lastofDate = calendar.getActualMaximum(Calendar.DATE);
		
		//1(일)~7(토)
		int week = calendar.get(Calendar.DAY_OF_WEEK);
		
		for(int i=1;i<week;i++){
			System.out.print("\t");
		}
		for(int i=1;i<=lastofDate;i++){
			
			System.out.print(i + "\t");
			if(week%7 == 0)
				System.out.println();
			week++;
		}
		System.out.println("\n");
		
		
		scan.close();
	}

}
