package com.mathex;
/*

Random Ŭ���� �̿�
0���� 2000�̸��� ������ �� 100 ��µǵ��� ���α׷�


*/

import java.util.Random;

public class RandomEx03 {

	public static void main(String[] args) {
		
		Random rand = new Random();

		for(int i=0; i<100 ;i++){
			System.out.println( rand.nextInt(2000) );
		}
	}
}
