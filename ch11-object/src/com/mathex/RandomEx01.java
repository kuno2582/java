package com.mathex;

/*
Math.random()
0.0 ~ 1.0 �̸�(0.99999999999)�� ���� �߻�
0.0 ~ 0.9

*/
public class RandomEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] gift = 
			//0			1			2		3		4
			{"�ƺ�", "������ī�޶�", "�º�", "��", "��Ʈ��"};
		
		double random = Math.random();
		System.out.println(random);
		
		int idx = (int)(random*5); //0~4
		System.out.println("�߻��� ����: " + idx);
		System.out.println("�߻��� ����: " + gift[idx]);
	}
}

//5 x 1 = 5		5 x 0.1 = 0.5
//5 x 2 = 10		5 x 0.2 = 1.0
//5 x 3 = 15		5 x 0.3 = 1.5
//5 x 4 = 20		5 x 0.4 = 2.0
//5 x 5 = 25		5 x 0.5 = 2.5
//5 x 6 = 30		5 x 0.6 = 3.0
//5 x 7 = 35		5 x 0.7 = 3.5
//5 x 8 = 40		5 x 0.8 = 4.0
//5 x 9 = 45		5 x 0.9 = 4.5
