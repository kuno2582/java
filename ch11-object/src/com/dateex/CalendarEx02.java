package com.dateex;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarEx02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Calendar calendar = Calendar.getInstance();
		
		System.out.println("��� ������ ���� �Է��ϼ���. (ex ����: 2016, ��: 12, ��: 30");
		
		System.out.println("���� > ");
		int year = scan.nextInt();
		
		System.out.println("�� > ");
		int month = scan.nextInt();
		
		System.out.println("[" + year + "�� " + month + "�� " + "]");
		System.out.println("��\t��\tȭ\t��\t��\t��\t��");
		
		calendar.set(year, month - 1, 1);
		
		int lastofDate = calendar.getActualMaximum(Calendar.DATE);
		
		//1(��)~7(��)
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
