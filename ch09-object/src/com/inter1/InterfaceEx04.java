package com.inter1;

import java.util.Scanner;

interface Week {
	int MON=1, TUE=2, WED=3, THU=4, FRI=5, SAT=6, SUN=7;
}

public class InterfaceEx04 {

	public static void main(String[] args) {
		
		System.out.println("�����ϴ� ������ ���ڸ� �����ϼ���...");
		System.out.println("1.������, 2.ȭ����, 3.������");
		System.out.println("4.�����, 5.�ݿ���, 6.�����, 7.�Ͽ���");
		System.out.println("����� ������?");
		
		Scanner input = new Scanner(System.in);
		int select = input.nextInt();
		
		switch(select){
		case Week.MON:
			System.out.println("����� ������ ������");
			break;
		case Week.TUE:
			System.out.println("����� ������ ȭ����");
			break;
		case Week.WED:
			System.out.println("����� ������ ������");
			break;
		case Week.THU:
			System.out.println("����� ������ �����");
			break;
		case Week.FRI:
			System.out.println("����� ������ �ݿ���");
			break;
		case Week.SAT:
			System.out.println("����� ������ �����");
			break;
		case Week.SUN:
			System.out.println("����� ������ �Ͽ���");
			break;
		default:
			System.out.println("���� �Ϸ� ��̰� ��������~");
		}
		
		input.close();
	}

}
