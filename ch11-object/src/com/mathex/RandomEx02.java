package com.mathex;
/*
java.util.Random Ŭ����

nextInt(int n)
- 0���� ���ڷ� ���޹��� n���� �������� ������ ������ �߻� ��ŵ�ϴ�.(n-1)
- 0���� n�̸��� int�� ���� ��ȯ


*/

import java.util.Random;

public class RandomEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] luck = {"�ζ� ��÷", "�����Ϸ� ����", "�����ο� �Ϸ�",
				"��ſ� ����", "�׳� �׳�", "����~�𸣰ڴ�"};
		
		Random r1 = new Random();
		System.out.println(luck[r1.nextInt(6)]);

	}

}
