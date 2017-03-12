package com.inter1;

import java.util.Scanner;

interface Week {
	int MON=1, TUE=2, WED=3, THU=4, FRI=5, SAT=6, SUN=7;
}

public class InterfaceEx04 {

	public static void main(String[] args) {
		
		System.out.println("좋아하는 요일의 숫자를 선택하세요...");
		System.out.println("1.월요일, 2.화요일, 3.수요일");
		System.out.println("4.목요일, 5.금요일, 6.토요일, 7.일요일");
		System.out.println("당신의 선택은?");
		
		Scanner input = new Scanner(System.in);
		int select = input.nextInt();
		
		switch(select){
		case Week.MON:
			System.out.println("당신의 선택은 월요일");
			break;
		case Week.TUE:
			System.out.println("당신의 선택은 화요일");
			break;
		case Week.WED:
			System.out.println("당신의 선택은 수요일");
			break;
		case Week.THU:
			System.out.println("당신의 선택은 목요일");
			break;
		case Week.FRI:
			System.out.println("당신의 선택은 금요일");
			break;
		case Week.SAT:
			System.out.println("당신의 선택은 토요일");
			break;
		case Week.SUN:
			System.out.println("당신의 선택은 일요일");
			break;
		default:
			System.out.println("오늘 하루 즐겁게 보내세요~");
		}
		
		input.close();
	}

}
