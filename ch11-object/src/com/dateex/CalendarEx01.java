package com.dateex;

import java.util.Calendar;

/*
Calendar Ŭ����
�޷��̳� �ð��ۼ��Ҷ� �ַ� ���

*/
public class CalendarEx01 {

	public static void main(String[] args) {
		
		Calendar today = Calendar.getInstance();
		System.out.println(today);
		
		int year = today.get(Calendar.YEAR);
		int month = today.get(Calendar.MONTH);
		int date = today.get(Calendar.DATE);
		month += 1;
		
		System.out.println("����" + year + "��" + month + "��" + date + "��");
		
		//1~7������ ��
		int day = today.get(Calendar.DAY_OF_WEEK);	//����
		
		String nday = "";
		switch(day){
		case 1:
			nday = "��"; break;
		case 2:
			nday = "��"; break;
		case 3:
			nday = "ȭ"; break;
		case 4:
			nday = "��"; break;
		case 5:
			nday = "��"; break;
		case 6:
			nday = "��"; break;
		case 7:
			nday = "��"; break;
		}
		
		System.out.println("������ " + nday + "����");
		
		//AM: 0		PM: 1
		int amPm = today.get(Calendar.AM_PM);
		String msg_amPm = amPm == 0 ? "����" : "����";
		System.out.println(msg_amPm);
		
		int hour = today.get(Calendar.HOUR); 
		int min = today.get(Calendar.MINUTE);
		int sec = today.get(Calendar.SECOND);
		
		System.out.println(hour + "�� " + min + "�� " + sec + "��");

	}

}
