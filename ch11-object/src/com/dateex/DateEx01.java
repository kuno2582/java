package com.dateex;
/*
java.util.Date
 - ������ �ú��ʸ� �Ѳ����� ����� �� ���
 - ������ �ú��ʸ� ���� ���ϰ� ���� ��쿡�� CalendarŬ������ ���



*/
import java.util.Date;
import java.text.SimpleDateFormat;

public class DateEx01 {

	public static void main(String[] args) {
		
		Date now = new Date();
		System.out.println(now);
		
		/*System.out.println(now.toLocaleString());
		System.out.println(now.toGMTString());*/
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy��MM��dd�� E���� a hh:mm:ss");
		String today = sdf.format(now);
		System.out.println(today);

		
	}

}