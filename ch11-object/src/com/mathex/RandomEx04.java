package com.mathex;
/*
��¥ ����(Pseudo-random number)
- ����(seed)�� �����ϸ� �����Ǵ� ������ ������ 100% ������ ������ �߻��մϴ�.
- ��ǻ���� ������ ������ ������� �����Ǳ� ������ ��¥ ������� �Ҹ��ϴ�.

*/
import java.util.Random;

public class RandomEx04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random rand = new Random(7);	//�����ų������ ���� ���� ����
		
		for(int i=0; i<10 ;i++){
			System.out.println(rand.nextInt(100));
		}
		

	}

}
